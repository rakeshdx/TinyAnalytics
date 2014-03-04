package com.bytefly.analytics.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

//Prefs file definition goes here.
public class Prefs {
	final static String PREFS_NAME = "TinyAnalyticsConfig";
	final static String TAG = "TinyAnalyticsPrefs";
	
	public static void setAppInstallConfig(Context context)
	{
		SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, 0);
		
        if (settings.getBoolean("Installed", false)) {
            //the app is being launched for first time, do something        
            Log.d(TAG, "First time install");

            // first time task record the fact that the app has been started at least once
            settings.edit().putBoolean("Installed", true).commit();
            Log.d(TAG, "Shared Pref value set to true");
        } 
	}
}
