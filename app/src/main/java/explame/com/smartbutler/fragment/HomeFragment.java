package explame.com.smartbutler.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import explame.com.smartbutler.R;

/**
 * Created by www10 on 2017/4/18.
 */

public class HomeFragment extends BaseFragment {

    private View mContentView;
    private ListView mListView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mContentView = inflater.inflate(R.layout.fragment_home_layout, container, false);
        initView();
        return mContentView;
    }

    private void initView() {
        mListView = (ListView) mContentView.findViewById(R.id.list_view);
        //启动Loading动画
    }
}
