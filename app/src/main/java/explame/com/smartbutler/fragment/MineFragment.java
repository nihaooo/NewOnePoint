package explame.com.smartbutler.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import explame.com.smartbutler.R;

/**
 * Created by www10 on 2017/4/18.
 */

public class MineFragment extends BaseFragment {

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mine_layout,container,false);
        return view;
    }
}
