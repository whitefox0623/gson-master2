package com.example.shardul.jsonparsingusinggson;

import android.app.Application;

import com.android.volley.manager.RequestManager;

public class VolleyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        RequestManager.getInstance().init(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
