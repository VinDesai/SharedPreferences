package com.felight.android.sharedpreferences;

import android.os.Bundle;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.Menu;
import android.widget.TextView;

public class SecondActivity extends Activity {
	TextView tvResult;
	private SharedPreferences prefs;
	private String prefName = "MyPref1";
	private static final String TEXT_VALUE_KEY = "textvalue";
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		tvResult = (TextView) findViewById(R.id.tvResult);
		prefs = getSharedPreferences(prefName, MODE_PRIVATE);
		tvResult.setText(prefs.getString(TEXT_VALUE_KEY, ""));
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

}
