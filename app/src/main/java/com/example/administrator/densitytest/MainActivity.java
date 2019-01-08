package com.example.administrator.densitytest;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class MainActivity extends AppCompatActivity {

    private static float sNoncompatDensity;
    private static float sNoncompatScaledDensity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DensityUtil.setCustomDensity(this,getApplication(),0);//setCustomDensity(this,getApplication());//ApplicationUtil.getInstance()
        setContentView(R.layout.activity_main);
    }
}
