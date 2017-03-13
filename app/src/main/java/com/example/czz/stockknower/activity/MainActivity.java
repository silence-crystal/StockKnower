package com.example.czz.stockknower.activity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.czz.stockknower.R;
import com.example.czz.stockknower.fragment.MineFragment;
import com.example.czz.stockknower.fragment.QueryFragment;
import com.example.czz.stockknower.fragment.StockFragment;
import com.example.czz.stockknower.utils.CloseAllActivitys;

import cn.bmob.v3.Bmob;

public class MainActivity extends FragmentActivity implements View.OnClickListener{
    private Fragment stockFragment,queryFragment,mineFragment,currentFragment;
    private TextView tv_stock,tv_query,tv_mine;
    private FragmentManager manager;
    private FragmentTransaction transaction;
    private Drawable stockTop,queryTop,mineTop;
    private long time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CloseAllActivitys.list.add(this);
        Bmob.initialize(this,"e80bbbbaf06b28f4f2486871f49f73fa");
        initFragment();
        initBottomBar();
    }

    private void initBottomBar() {
        tv_stock = (TextView) findViewById(R.id.tv_stock);
        tv_query = (TextView) findViewById(R.id.tv_query);
        tv_mine = (TextView) findViewById(R.id.tv_mine);
        tv_stock.setOnClickListener(this);
        tv_query.setOnClickListener(this);
        tv_mine.setOnClickListener(this);
        Drawable stockTop = ContextCompat.getDrawable(this,R.mipmap.stock_blue);
        tv_stock.setCompoundDrawablesWithIntrinsicBounds(null,stockTop,null,null);
        tv_stock.setTextColor(ContextCompat.getColor(this, R.color.icon_blue));

    }

    private void initFragment() {
        stockFragment = new StockFragment();
        queryFragment = new QueryFragment();
        mineFragment = new MineFragment();
        manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();
        transaction.add(R.id.fl_content,stockFragment,stockFragment.getClass().getName());
        transaction.commit();
        currentFragment = stockFragment;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_stock:
                changeFragment(stockFragment);
                stockTop = ContextCompat.getDrawable(this, R.mipmap.stock_blue);
                tv_stock.setCompoundDrawablesWithIntrinsicBounds(null,stockTop,null,null);
                tv_stock.setTextColor(ContextCompat.getColor(this, R.color.icon_blue));
                queryTop = ContextCompat.getDrawable(this, R.mipmap.query);
                tv_query.setCompoundDrawablesWithIntrinsicBounds(null,queryTop,null,null);
                tv_query.setTextColor(ContextCompat.getColor(this, R.color.black));
                mineTop = ContextCompat.getDrawable(this, R.mipmap.mine);
                tv_mine.setCompoundDrawablesWithIntrinsicBounds(null,mineTop,null,null);
                tv_mine.setTextColor(ContextCompat.getColor(this, R.color.black));
                break;
            case R.id.tv_query:
                changeFragment(queryFragment);
                stockTop = ContextCompat.getDrawable(this, R.mipmap.stock);
                tv_stock.setCompoundDrawablesWithIntrinsicBounds(null,stockTop,null,null);
                tv_stock.setTextColor(ContextCompat.getColor(this, R.color.black));
                queryTop = ContextCompat.getDrawable(this, R.mipmap.query_blue);
                tv_query.setCompoundDrawablesWithIntrinsicBounds(null,queryTop,null,null);
                tv_query.setTextColor(ContextCompat.getColor(this, R.color.icon_blue));
                mineTop = ContextCompat.getDrawable(this, R.mipmap.mine);
                tv_mine.setCompoundDrawablesWithIntrinsicBounds(null,mineTop,null,null);
                tv_mine.setTextColor(ContextCompat.getColor(this, R.color.black));
                break;
            case R.id.tv_mine:
                changeFragment(mineFragment);
                stockTop = ContextCompat.getDrawable(this, R.mipmap.stock);
                tv_stock.setCompoundDrawablesWithIntrinsicBounds(null,stockTop,null,null);
                tv_stock.setTextColor(ContextCompat.getColor(this, R.color.black));
                queryTop = ContextCompat.getDrawable(this, R.mipmap.query);
                tv_query.setCompoundDrawablesWithIntrinsicBounds(null,queryTop,null,null);
                tv_query.setTextColor(ContextCompat.getColor(this, R.color.black));
                mineTop = ContextCompat.getDrawable(this, R.mipmap.mine_blue);
                tv_mine.setCompoundDrawablesWithIntrinsicBounds(null,mineTop,null,null);
                tv_mine.setTextColor(ContextCompat.getColor(this, R.color.icon_blue));
                break;
        }
    }

    public void changeFragment(Fragment fragment){
        manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();
        if (currentFragment==fragment){
            return;
        }
        if (manager.findFragmentByTag(fragment.getClass().getName())==null){
            transaction.add(R.id.fl_content,fragment,fragment.getClass().getName());
        }
        transaction.hide(currentFragment);
        transaction.show(fragment);
        transaction.commit();
        currentFragment = fragment;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (System.currentTimeMillis()-time<2000){
            CloseAllActivitys.closeAllActivity();
        }else {
            time = System.currentTimeMillis();
            Toast.makeText(MainActivity.this,"再按一次退出本程序",Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
