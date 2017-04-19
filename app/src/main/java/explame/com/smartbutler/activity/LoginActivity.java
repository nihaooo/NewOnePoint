package explame.com.smartbutler.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import explame.com.smartbutler.R;

/*
 *      项目名：    SmartButler
 *      包名：       explame.com.smartbutler.activity
 *      时间           2017/4/18.
 *      创建者：    qzhuorui
 *      描述：        TODO 登录
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    //注册按钮
    private Button btn_registered;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_layout);
        
        initView();
    }

    private void initView() {
        btn_registered = (Button) findViewById(R.id.btn_registered);
        btn_registered.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_registered:
                startActivity(new Intent(this,RegisteredActivity.class));
                break;
        }
    }
}
