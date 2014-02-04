package com.example.mediaplayerdemo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MediaPlayerActivity extends Activity implements OnClickListener{

	  Button buttonStart, buttonStop;

	  @Override
	  public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_media_player);

	    buttonStart = (Button) findViewById(R.id.buttonStart);
	    buttonStop = (Button) findViewById(R.id.buttonStop);

	    buttonStart.setOnClickListener(this);
	    buttonStop.setOnClickListener(this);
	  }

	  public void onClick(View src) {
	    switch (src.getId()) {
	    case R.id.buttonStart:
	      startService(new Intent(this, MediaService.class));
	      break;
	    case R.id.buttonStop:
	      stopService(new Intent(this, MediaService.class));
	      break;
	    }
	  }

}
