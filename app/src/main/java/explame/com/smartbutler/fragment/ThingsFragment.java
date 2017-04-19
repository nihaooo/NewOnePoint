package explame.com.smartbutler.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import cn.bmob.v3.listener.SaveListener;
import explame.com.smartbutler.BeanBmob.Lost;
import explame.com.smartbutler.R;

/*
 *      项目名：    SmartButler
 *      包名：       explame.com.smartbutler.fragment
 *      时间           2017/4/19.
 *      创建者：    qzhuorui
 *      描述：        TODO
 */
public class ThingsFragment extends BaseFragment {

    private EditText et_title, et_phone, et_describe;
    private DatePicker dp_date;

    private View mContentView;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mContentView = inflater.inflate(R.layout.message_lostthing_layout, container, false);
        return mContentView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        android.app.FragmentManager fm = getFragmentManager();
        android.app.FragmentTransaction tx = fm.beginTransaction();
        tx.addToBackStack(null);
        tx.commit();

    }

    private void initView() {
        et_title = (EditText) mContentView.findViewById(R.id.et_title);
        et_phone = (EditText) mContentView.findViewById(R.id.et_phone);
        et_describe = (EditText) mContentView.findViewById(R.id.et_describe);
        dp_date = (DatePicker) mContentView.findViewById(R.id.dp_date);

        Button mButton = (Button) mContentView.findViewById(R.id.button_add);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendinformation();
            }
        });

    }

    private void sendinformation() {
        Lost lost = new Lost();
        lost.setDescribe(et_describe.getText().toString());
        lost.setPhone(et_phone.getText().toString());
        lost.setTitle(et_title.getText().toString());
        lost.setTime(dp_date.getYear() + "-" + (dp_date.getMonth() + 1) + "-" + dp_date.getDayOfMonth());
        lost.save(getActivity(), new SaveListener() {
            @Override
            public void onSuccess() {
                Toast.makeText(getActivity(), "失物信息添加成功", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(int i, String s) {
                Toast.makeText(getActivity(), "失物信息添加失败", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
