package com.example.photoquiz;

import com.example.funchem.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Que2 extends Activity{
	TextView tvRes;
	int answer;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.que2);
		Button rb1, rb2, rb3, rb4,rb5;
		

		rb1 = (Button) findViewById(R.id.rd201);
		rb2 = (Button) findViewById(R.id.rd202);
		rb3 = (Button) findViewById(R.id.rd203);
		rb4 = (Button) findViewById(R.id.rd204);
		tvRes = (TextView) findViewById(R.id.tvr2);
		rb5 = (Button) findViewById(R.id.bn2);
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
			
					tvRes.setText("Correct");
				

			}
		});
		rb4.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					tvRes.setText("Wrong");

			}
		});
		rb5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent opennextActivity = new Intent("com.example.funchem.QUE3");
				startActivity(opennextActivity);
			}
		});
	}
	
	
}
