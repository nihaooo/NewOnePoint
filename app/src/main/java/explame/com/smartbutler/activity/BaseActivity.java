package explame.com.smartbutler.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by www10 on 2017/4/18.
 * Activity 基类
 */

/**
 * 主要做的事情
 * 统一的接口
 * 统一的属性
 * 统一的方法
 */
public class BaseActivity extends AppCompatActivity {

    public String TAG;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = getComponentName().getShortClassName();


    }
}
