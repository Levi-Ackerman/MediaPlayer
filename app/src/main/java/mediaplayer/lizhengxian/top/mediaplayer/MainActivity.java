package mediaplayer.lizhengxian.top.mediaplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends Activity {
    private String url = "http://c.m.163.com/recommend/getChanListNews?channel=T1457068979049&size=20&offset=0&fn=3&passport=h3o88AuDhdH7tlyrE3hlILX2WMCoMqapk08GhEzPqX4%3D&devId=DWT861zlolJo7mHnyynnGA%3D%3D&version=15.0&net=wifi&ts=1474185450&sign=JmMhXTnPo%2BqgTgwyxKstDgS9lmS5Pv%2BUCP5tZ%2FrWevV48ErR02zJ6%2FKXOnxX046I&encryption=1";

    ListView mVideoList;
    List<Video> mVideos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mVideoList = new ListView(this);
        mVideoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Video video = mVideos.get(position);
                Intent intent = new Intent(MainActivity.this, VideoActivity.class);
                intent.putExtra("video", video);
                startActivity(intent);
            }
        });
        setContentView(mVideoList);
        final OkHttpClient client = new OkHttpClient();
        final Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        new AsyncTask<Void, Void, List<Video>>() {

            @Override
            protected List<Video> doInBackground(Void... params) {
                try {
                    Response response = client.newCall(request).execute();
                    String result = response.body().string();
                    Log.i("lee..", result);
                    JSONObject root = JSON.parseObject(result);
                    List<JSONObject> list = JSON.parseObject(root.getString("视频"), List.class);
                    mVideos = new ArrayList<Video>();
                    for (JSONObject obj : list) {
                        mVideos.add(JSON.parseObject(obj.toString(), Video.class));
                    }
                    return mVideos;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(List<Video> videos) {
                super.onPostExecute(videos);
                if (videos != null) {
                    mVideoList.setAdapter(new VideoListAdapter(MainActivity.this, videos));
                }
            }
        }.execute((Void) null);
    }


}
