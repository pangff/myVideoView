package com.example.myvideoplayer;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    // 设置全屏
    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    // 设置屏幕常亮
    getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    setContentView(R.layout.activity_main);
    VideoView videoView = (VideoView)findViewById(R.id.videoView);
    Uri uri = Uri.parse("http://bcs.duapp.com/pangxinlong/media/S6S8002MR.mp4"); 
    videoView.setVideoURI(uri);
    //设置媒体控制条
    MediaController mediaController = new MediaController(this);
    mediaController.setAnchorView(videoView);

    videoView.setMediaController(mediaController);
    videoView.start();
    videoView.requestFocus();
  }


  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

}
