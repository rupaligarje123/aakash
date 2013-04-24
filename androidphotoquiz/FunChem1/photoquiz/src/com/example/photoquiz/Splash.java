package com.example.photoquiz;

import com.example.funchem.R;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {
	MediaPlayer mySong;
	@Override
	protected void onCreate(Bundle Splash) {
		// TODO Auto-generated method stub
		super.onCreate(Splash);
		setContentView(R.layout.splash);
		mySong = MediaPlayer.create(Splash.this, R.raw.sms);
		mySong.start();
		Thread timer = new Thread() {
			public void run() {

				try {
					sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent openMainActivity = new Intent("com.example.funchem.MAINACTIVITY");
					startActivity(openMainActivity);
				}
			}
		};
		timer.start();
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		mySong.release();
		finish();
	}
	
	
}
