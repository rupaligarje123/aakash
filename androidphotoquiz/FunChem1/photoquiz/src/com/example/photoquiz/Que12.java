package com.example.photoquiz;

	import com.example.funchem.R;

import android.app.Activity;
	import android.content.Intent;
	import android.os.Bundle;
	import android.view.View;
	import android.widget.Button;
import android.widget.TextView;

public class Que12 extends Activity{
	
				TextView tvRes;
				int answer;
				@Override
				protected void onCreate(Bundle savedInstanceState) {
					// TODO Auto-generated method stub
					super.onCreate(savedInstanceState);
					setContentView(R.layout.que12);
					Button rb1, rb2, rb3, rb4,rb5;
				

					rb1 = (Button) findViewById(R.id.rd1201);
					rb2 = (Button) findViewById(R.id.rd1202);
					rb3 = (Button) findViewById(R.id.rd1203);
					rb4 = (Button) findViewById(R.id.rd1204);
					tvRes = (TextView) findViewById(R.id.tvr12);
					rb5 = (Button) findViewById(R.id.bn12);
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
							Intent opennextActivity = new Intent("com.example.funchem.MAINACTIVITY");
							startActivity(opennextActivity);
						}
					});
				}
				
				
			}















