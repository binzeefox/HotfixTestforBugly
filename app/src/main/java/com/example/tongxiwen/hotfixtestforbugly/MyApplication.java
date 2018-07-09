package com.example.tongxiwen.hotfixtestforbugly;

import android.app.Application;

import com.tencent.bugly.Bugly;
import com.tencent.bugly.beta.Beta;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        String appId = getString(R.string.APP_ID);
        Beta.autoCheckUpgrade = true;
        Bugly.init(getApplicationContext(), appId, true);
    }
}
