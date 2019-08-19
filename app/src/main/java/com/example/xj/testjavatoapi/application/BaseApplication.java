package com.example.xj.testjavatoapi.application;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by AndroidXJ on 2019/8/19.
 */
public class BaseApplication extends Application {
    //  ARouter 调试开关
    private boolean isDebugARouter = true;

    @Override
    public void onCreate() {
        super.onCreate();
        if (isDebugARouter) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(BaseApplication.this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        ARouter.getInstance().destroy();
    }
}
