package mediaplayer.lizhengxian.top.mediaplayer;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;

import com.alibaba.fastjson.JSON;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        initView();
        final OkHttpClient client = new OkHttpClient();
        final Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Response response = client.newCall(request).execute();
                    String result = response.body().string();
                    Log.i("lee..",result);
                    JSONObject obj = new JSONObject(result);
                    List<Video> list ;
                    list = JSON.parseObject(obj.getString("视频"),List.class);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

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
