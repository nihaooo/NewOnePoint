package explame.com.smartbutler.fragment;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.listener.FindListener;
import explame.com.smartbutler.BeanBmob.Lost;
import explame.com.smartbutler.R;
import explame.com.smartbutler.adapter.LostAdapter;

/**
 * Created by www10 on 2017/4/18.
 */

public class MessageFragment extends BaseFragment {

    private SwipeRefreshLayout swipeRefresh;
    private LostAdapter mAdapter;
    private List<Lost> mLostList;

    private View mContentView;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mContentView = inflater.inflate(R.layout.fragment_message_layout,container,false);
        return mContentView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mLostList = new ArrayList<>();//数据源
        mAdapter = new LostAdapter(getActivity(), mLostList);
        View list =  mContentView.findViewById(R.id.swip_refresh);
        final ListView listList = (ListView) list.findViewById(R.id.lv_main);
//        final ListView listList = (ListView) mContentView.findViewById(R.id.lv_main);
        listList.setAdapter(mAdapter);
        listList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        Button mButton = (Button) mContentView.findViewById(R.id.button_add);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //操作Fragment
                ThingsFragment thingsFragment = new ThingsFragment();
                android.app.FragmentManager fm = getFragmentManager();
                FragmentTransaction tx = fm.beginTransaction();
                tx.replace(R.id.content_layout,thingsFragment,"Things");
                tx.addToBackStack(null);
                tx.commit();
            }
        });

        findfreshCache();//读取Cache data

        swipeRefresh = (SwipeRefreshLayout) mContentView.findViewById(R.id.swip_refresh);
        swipeRefresh.setColorSchemeResources(android.R.color.holo_blue_light, android.R.color.holo_red_light, android.R.color.holo_orange_light, android.R.color.holo_green_light);
        swipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshList();
                listList.setAdapter(mAdapter);
            }
        });
    }
    //onCreate
    private void findfreshCache() {
        BmobQuery<Lost> query = new BmobQuery<Lost>();
        query.setCachePolicy(BmobQuery.CachePolicy.CACHE_ELSE_NETWORK);
        query.findObjects(getActivity(), new FindListener<Lost>() {
            @Override
            public void onSuccess(List<Lost> list) {
                mLostList.clear();
                mLostList.addAll(list);//添加进数据源
                mAdapter.notifyDataSetChanged();
            }

            @Override
            public void onError(int i, String s) {
            }
        });
    }

    private void refreshList() {
        BmobQuery<Lost> query = new BmobQuery<Lost>();
        query.order("-createdAt");
        query.setCachePolicy(BmobQuery.CachePolicy.NETWORK_ELSE_CACHE);
        query.findObjects(getActivity(), new FindListener<Lost>() {
            @Override
            public void onSuccess(List<Lost> list) {
                mLostList.clear();
                mLostList.addAll(list);//添加进数据源
                mAdapter.notifyDataSetChanged();
                Toast.makeText(getActivity(), "刷新成功", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(int i, String s) {
                Toast.makeText(getActivity(), "刷新失败", Toast.LENGTH_SHORT).show();
            }
        });
        swipeRefresh.setRefreshing(false);
    }
}
