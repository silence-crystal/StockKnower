package com.example.czz.stockknower.fragment;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.czz.stockknower.R;
import com.example.czz.stockknower.activity.AboutUsActivity;
import com.example.czz.stockknower.activity.CollectionActivity;
import com.example.czz.stockknower.activity.LoginActivity;
import com.example.czz.stockknower.activity.VersionActivity;
import com.example.czz.stockknower.adapter.GridAdapter;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.ArrayList;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobUser;

public class MineFragment extends Fragment implements View.OnClickListener,AdapterView.OnItemClickListener{
    private View mView;
    private TextView tv_username;
    private TextView tv_login;
    private RoundedImageView im_head;
    private RelativeLayout rl_collection;
    private RelativeLayout rl_aboutus;
    private RelativeLayout rl_version;
    private View contentView;
    private GridView gridView;
    private ArrayList<Integer> list;
    private GridAdapter adapter;
    private PopupWindow popupWindow;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_mine, null);
        initView();
        return mView;
    }

    private void initView() {
        tv_username = (TextView) mView.findViewById(R.id.tv_username);
        tv_login = (TextView) mView.findViewById(R.id.tv_login);
        rl_collection = (RelativeLayout) mView.findViewById(R.id.rl_collection);
        rl_aboutus = (RelativeLayout) mView.findViewById(R.id.rl_aboutus);
        rl_version = (RelativeLayout) mView.findViewById(R.id.rl_version);
        im_head = (RoundedImageView) mView.findViewById(R.id.img_head);

        tv_login.setOnClickListener(this);
        im_head.setOnClickListener(this);
        rl_collection.setOnClickListener(this);
        rl_aboutus.setOnClickListener(this);
        rl_version.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_login://登录按钮
                BmobUser user = BmobUser.getCurrentUser();
                if (user!=null){
                    //注销
                    BmobUser.logOut();
                    changeLoginView();
                }else {
                    Intent loginIntent = new Intent(getActivity(), LoginActivity.class);
                    startActivity(loginIntent);
                }
                break;
            case R.id.img_head://头像
                BmobUser user1 = BmobUser.getCurrentUser();
                if (user1==null){
                    Intent loginIntent = new Intent(getActivity(), LoginActivity.class);
                    startActivity(loginIntent);
                }else {
                    showPop();
                }
                break;
            case R.id.rl_collection://我的收藏
                Intent collectionIntent = new Intent(getActivity(), CollectionActivity.class);
                startActivity(collectionIntent);
                break;
            case R.id.rl_aboutus://关于我们
                Intent aboutUsIntent = new Intent(getActivity(), AboutUsActivity.class);
                startActivity(aboutUsIntent);
                break;
            case R.id.rl_version://版本号
                Intent versionIntent = new Intent(getActivity(), VersionActivity.class);
                startActivity(versionIntent);
                break;
        }
    }

    private void showPop() {
        contentView = LayoutInflater.from(getActivity()).inflate(R.layout.popview,null);
        gridView = (GridView) contentView.findViewById(R.id.grid_head);
        addData();
        adapter = new GridAdapter(getActivity());
        adapter.setList(list);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(this);
        popupWindow = new PopupWindow(contentView,
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        popupWindow.setOutsideTouchable(true);
        popupWindow.setAnimationStyle(R.style.pop_view_style);
        gridView.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getKeyCode()==KeyEvent.KEYCODE_BACK){
                    if (popupWindow!=null && popupWindow.isShowing()){
                        popupWindow.dismiss();
                        return true;
                    }
                }
                return false;
            }
        });
        popupWindow.showAtLocation(contentView, Gravity.BOTTOM,0,0);
    }

    private void addData() {
        list = new ArrayList<>();
        list.add(R.mipmap.user_head);
        list.add(R.mipmap.user_head1);
        list.add(R.mipmap.user_head2);
        list.add(R.mipmap.user_head3);
        list.add(R.mipmap.user_head4);
        list.add(R.mipmap.user_head5);
        list.add(R.mipmap.user_head6);
        list.add(R.mipmap.user_head7);

    }

    @Override
    public void onResume() {
        super.onResume();
        changeLoginView();
    }

    private void changeLoginView() {
        BmobUser user = BmobUser.getCurrentUser();
        if (user!=null){
            tv_login.setText("注销");
            im_head.setImageResource(R.mipmap.user_head);
            tv_username.setText(user.getUsername());
        }else {
            tv_login.setText("登录");
            im_head.setImageResource(R.mipmap.head);
            tv_username.setText("请先登录");
        }
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        im_head.setImageResource(list.get(position));
        popupWindow.dismiss();
    }
}
