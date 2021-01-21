package com.example.ashik.iubworkshop;

import android.content.Context;
import android.content.SharedPreferences;

public class LogerInfo {

    private String LiEmail;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public String getLiEmail() {
        return sharedPreferences.getString("Email","");
    }

    public void setLiEmail(String liEmail) {
        LiEmail = liEmail;
        editor.putString("Email",LiEmail);
        editor.commit();
    }

    public void Remove()
    {
        editor.clear();
        editor.commit();
    }

    public LogerInfo(Context context) {

        sharedPreferences = context.getSharedPreferences("LogerInfo",Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();


    }
}
