package com.felight.sharedpreferencedemo;

import android.content.Context;
import android.widget.Toast;

public class Utils {

	
	public static void toastIt(Context context, String message){
		Toast.makeText(context, message, Toast.LENGTH_LONG).show();
	}

}
