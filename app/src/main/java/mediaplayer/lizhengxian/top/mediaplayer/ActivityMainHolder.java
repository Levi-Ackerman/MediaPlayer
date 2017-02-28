package mediaplayer.lizhengxian.top.mediaplayer;

import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class ActivityMainHolder {
    private RelativeLayout activityMain;
    private SurfaceView surfaceview;
    private Button play;
    private Button pause;
    private Button stop;

    public ActivityMainHolder(View view) {
        activityMain = (RelativeLayout) view.findViewById(R.id.activity_main);
        surfaceview = (SurfaceView) activityMain.findViewById(R.id.surfaceview);
        play = (Button) activityMain.findViewById(R.id.play);
        pause = (Button) activityMain.findViewById(R.id.pause);
        stop = (Button) activityMain.findViewById(R.id.stop);
    }

    public SurfaceView getSurfaceview() {
        return surfaceview;
    }

    public RelativeLayout getActivityMain() {
        return activityMain;
    }

    public Button getPause() {
        return pause;
    }

    public Button getPlay() {
        return play;
    }

    public Button getStop() {
        return stop;
    }
}
