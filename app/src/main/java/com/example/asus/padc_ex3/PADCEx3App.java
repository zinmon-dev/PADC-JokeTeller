package com.example.asus.padc_ex3;

import android.app.Application;
import android.content.Context;

/**
 * Created by Asus on 6/25/2016.
 */
public class PADCEx3App extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this.getApplicationContext();

    }

    public static Context getContext() {
        return context;
    }
}
