package com.example.czz.stockknower.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.czz.stockknower.R;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import java.util.ArrayList;
import java.util.List;

public class StockFragment extends Fragment {
    private FragmentPagerItemAdapter adapter;
    private List<String> titleList;
    private FragmentPagerItems.Creator creator;
    private ViewPager vp_market;
    private View mainView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mainView = inflater.inflate(R.layout.fragment_stock,null);
        initData();
        initPager();
        return mainView;
    }

    private void initData() {
        creator = FragmentPagerItems.with(getActivity());
        titleList = new ArrayList<>();
        titleList.add("上海股市");
        titleList.add("深圳股市");
        titleList.add("香港股市");
        titleList.add("美国股市");
        for (int i=0;i<titleList.size();i++){
            creator.add(titleList.get(i),ReadStockFragment.class);
        }
    }

    private void initPager() {
        vp_market = (ViewPager) mainView.findViewById(R.id.vp_market);
        adapter = new FragmentPagerItemAdapter(getFragmentManager(),creator.create());
        vp_market.setAdapter(adapter);
        SmartTabLayout smartTabLayout = (SmartTabLayout) mainView.findViewById(R.id.smartTabLayout);
        smartTabLayout.setViewPager(vp_market);
    }

}
