package com.example.photoquiz;

	import com.example.funchem.R;

import android.app.Activity;
	import android.content.Intent;
	import android.os.Bundle;
	import android.view.View;
	import android.widget.Button;
import android.widget.TextView;

public class Que5 extends Activity{
	
	
		TextView tvRes;
		int answer;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.que5);
			Button rb1, rb2, rb3, rb4,rb5;
		

			rb1 = (Button) findViewById(R.id.rd501);
			rb2 = (Button) findViewById(R.id.rd502);
			rb3 = (Button) findViewById(R.id.rd503);
			rb4 = (Button) findViewById(R.id.rd504);
			tvRes = (TextView) findViewById(R.id.tvr5);
			rb5 = (Button) findViewById(R.id.bn5);
			rb1.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
						tvRes.setText("Wrong");

				}
			});
			rb2.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
						tvRes.setText("Wrong");

				}
			});
			rb3.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
						tvRes.setText("Wrong");
					

				}
			});
			rb4.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
						tvRes.setText("Correct");

				}
			});
			rb5.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent opennextActivity = new Intent("com.example.funchem.QUE6");
					startActivity(opennextActivity);
				}
			});
		}
		
		
	}


