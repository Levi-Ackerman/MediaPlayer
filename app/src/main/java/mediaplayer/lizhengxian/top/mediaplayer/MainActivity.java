package mediaplayer.lizhengxian.top.mediaplayer;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.IOException;

public class MainActivity extends Activity implements View.OnClickListener {

    private SurfaceView mSurfaceview;
    private Button mPlay;
    private Button mPause;
    private Button mStop;
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mMediaPlayer = new MediaPlayer();
    }

    private void initView() {
        mSurfaceview = (SurfaceView) findViewById(R.id.surfaceview);
        mPlay = (Button) findViewById(R.id.play);
        mPause = (Button) findViewById(R.id.pause);
        mStop = (Button) findViewById(R.id.stop);

        mPlay.setOnClickListener(this);
        mPause.setOnClickListener(this);
        mStop.setOnClickListener(this);
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
