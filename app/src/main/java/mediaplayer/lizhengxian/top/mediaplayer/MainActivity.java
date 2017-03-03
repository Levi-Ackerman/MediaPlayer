package mediaplayer.lizhengxian.top.mediaplayer;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends Activity implements View.OnClickListener {

    private String url = "http://c.m.163.com/recommend/getChanListNews?channel=T1457068979049&size=20&offset=0&fn=3&passport=h3o88AuDhdH7tlyrE3hlILX2WMCoMqapk08GhEzPqX4%3D&devId=DWT861zlolJo7mHnyynnGA%3D%3D&version=15.0&net=wifi&ts=1474185450&sign=JmMhXTnPo%2BqgTgwyxKstDgS9lmS5Pv%2BUCP5tZ%2FrWevV48ErR02zJ6%2FKXOnxX046I&encryption=1";
    private SurfaceView mSurfaceview;
    private Button mPlay;
    private Button mPause;
    private Button mStop;
    private MediaPlayer mMediaPlayer;
    ListView mVideoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mVideoList = new ListView(this);
        setContentView(mVideoList);
//        initView();
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
                    List<Video> videoList = new ArrayList<Video>();
                    for (JSONObject obj : list) {
                        videoList.add(JSON.parseObject(obj.toString(), Video.class));
                    }
                    return videoList;
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

    private void initView() {
        mSurfaceview = (SurfaceView) findViewById(R.id.surfaceview);
        mPlay = (Button) findViewById(R.id.play);
        mPause = (Button) findViewById(R.id.pause);
        mStop = (Button) findViewById(R.id.stop);

        mPlay.setOnClickListener(this);
        mPause.setOnClickListener(this);
        mStop.setOnClickListener(this);

        mMediaPlayer = new MediaPlayer();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.play:
                try {
                    mMediaPlayer.setDataSource(Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "1.mp4");
                    mMediaPlayer.setDisplay(mSurfaceview.getHolder());
                    mMediaPlayer.prepare();
                    mMediaPlayer.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.pause:
                if (mMediaPlayer.isPlaying()) {
                    mMediaPlayer.pause();
                } else {
                    mMediaPlayer.start();
                }
                break;
            case R.id.stop:
                mMediaPlayer.stop();
                mMediaPlayer.reset();
                break;
            default:
                break;
        }
    }
}
