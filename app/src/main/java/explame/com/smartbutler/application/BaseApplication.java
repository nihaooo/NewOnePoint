package explame.com.smartbutler.application;

import android.app.Application;

import cn.bmob.v3.Bmob;

/**
 * Created by www10 on 2017/4/18.
 *
 * Application
 */

public class BaseApplication extends Application{

    //创建
    @Override
    public void onCreate() {
        super.onCreate();
        Bmob.initialize(this, "f9fd3e06a0ee9b9d702db043e81e7393");
    }
}
