package com.example.photoquiz;

	import com.example.funchem.R;

import android.app.Activity;
	import android.content.Intent;
	import android.os.Bundle;
	import android.view.View;
	import android.widget.Button;
import android.widget.TextView;

public class Que6 extends Activity{
	
 
	
	
		TextView tvRes;
		int answer;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.que6);
			Button rb1, rb2, rb3, rb4,rb5;
		

			rb1 = (Button) findViewById(R.id.rd601);
			rb2 = (Button) findViewById(R.id.rd602);
			rb3 = (Button) findViewById(R.id.rd603);
			rb4 = (Button) findViewById(R.id.rd604);
			tvRes = (TextView) findViewById(R.id.tvr6);
			rb5 = (Button) findViewById(R.id.bn6);
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
					
						tvRes.setText("Correct");

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
						tvRes.setText("wrong");

				}
			});
			rb5.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent opennextActivity = new Intent("com.example.funchem.QUE7");
					startActivity(opennextActivity);
				}
			});
		}
		
		
	}



