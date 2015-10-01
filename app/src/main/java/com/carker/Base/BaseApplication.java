package com.carker.Base;

import android.app.Application;
import android.util.Log;

import com.carker.Utils.ApiHttpClient;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.PersistentCookieStore;
import com.loopj.android.http.RequestParams;

import org.apache.http.Header;

/**
 * Created by PC on 2015/9/28.
 */
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("tag", "test");
//        initTest();
    }



}
