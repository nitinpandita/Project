package com.example.carpool;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_user extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setContentView(R.layout.activity_userlayout);
		super.onCreate(savedInstanceState);
		Button register=(Button)findViewById(R.id.button2);
		register.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent j = new Intent(activity_user.this,register.class);
				startActivity(j);
			}
		});
	}

}
