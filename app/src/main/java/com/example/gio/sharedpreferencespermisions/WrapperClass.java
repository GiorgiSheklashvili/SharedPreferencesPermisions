package com.example.gio.sharedpreferencespermisions;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

/**
 * Created by Gio on 11/5/2016.
 */

public class WrapperClass {
    public static SharedPreferences preferences;
    public static SharedPreferences.Editor editor;

    public static void Initialize(Context context) {
        preferences = PreferenceManager.getDefaultSharedPreferences(context);
        editor = preferences.edit();
    }

    public static void saveColor(String key, int i) {
        editor.putInt(key, i);
        editor.commit();
    }

    public static int getColor(String key) {
        int result = preferences.getInt(key, R.color.black);
        return result;
    }
}
