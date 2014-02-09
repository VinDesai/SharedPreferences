package com.felight.sharedpreferencedemo;

import java.util.ArrayList;

import com.felight.sharedpreferencedemo.R.layout;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class SettingsActivity extends Activity implements OnItemSelectedListener {
	private Spinner spinnerBG;
	RelativeLayout myLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
		spinnerBG = (Spinner) findViewById(R.id.spinnerBackground);
		
		//myLayout = (RelativeLayout) findViewById(R.layout.activity_settings);
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		
		
		
//		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.background_colors, android.R.layout.simple_spinner_item);
//		spinnerBG.setAdapter(adapter);
		
		
//		ArrayList<CharSequence> bgColorList = new ArrayList<CharSequence>();
//		bgColorList.add("Red");
//		bgColorList.add("Blue");
//		bgColorList.add("yellow");
//		bgColorList.add("White");
//		
//		ArrayAdapter<CharSequence> adapter = new ArrayAdapter<CharSequence>(getBaseContext(), android.R.layout.simple_spinner_item, bgColorList);
//		spinnerBG.setAdapter(adapter);
		
		spinnerBG.setOnItemSelectedListener(this);
		
	}
	
	
	public void saveBGPreference(View view){
		
		//Utils.toastIt(getBaseContext(), view.getId() + " ");
		
	}
	
	

	@SuppressLint("ResourceAsColor")
	@Override
	public void onItemSelected(AdapterView<?> arg0, View view, int arg2,
			long arg3) {
		
		if(arg2 == 4) {
			this.findViewById(android.R.id.content).setBackgroundColor(R.color.transparent_blue);
		}
		
		
		if(arg2 == 1) {
			this.findViewById(android.R.id.content).setBackgroundColor(R.color.b_orange);
		}
		
		
		if(arg2 == 2) {
			this.findViewById(android.R.id.content).setBackgroundColor(R.color.b_yellow);
		}
		
		
		Utils.toastIt(getBaseContext(), view.getId()+"asdf " + arg2);
		
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		
		
	}
	
	

}
