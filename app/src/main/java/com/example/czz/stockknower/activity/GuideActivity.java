package com.example.czz.stockknower.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.example.czz.stockknower.R;
import com.example.czz.stockknower.adapter.GuideAdapter;
import com.example.czz.stockknower.utils.CloseAllActivitys;

import java.util.ArrayList;
import java.util.List;

public class GuideActivity extends Activity {
    private ViewPager vp_guide;
    private ImageView iv_point1;
    private ImageView iv_point2;
    private ImageView iv_point3;
    private List<ImageView> pointList;
    private List<View> viewList;
    private View viewOne;
    private View viewTwo;
    private View viewThree;
    private SharedPreferences sp;
    private LayoutInflater inflater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        CloseAllActivitys.list.add(this);
        inflater = LayoutInflater.from(this);
        sp = getSharedPreferences("sp",MODE_PRIVATE);
        int number = sp.getInt("first",0);
        if (number==0){
            initView();
            initPoint();
            initViewPager();
        }else if (number==1){
            Intent intent = new Intent(this,FlashActivity.class);
            startActivity(intent);
        }



    }

    private void initViewPager() {
        vp_guide = (ViewPager) findViewById(R.id.vp_guide);
        GuideAdapter adapter = new GuideAdapter(viewList);
        vp_guide.setAdapter(adapter);
        for (int i=0;i<pointList.size();i++){
            pointList.get(i).setAlpha(0.5f);
        }
        pointList.get(0).setAlpha(1f);
        vp_guide.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i=0;i<pointList.size();i++){
                    pointList.get(i).setAlpha(0.5f);
                }
                pointList.get(position).setAlpha(1f);

                if (position==2){
                    Intent intent = new Intent(GuideActivity.this,FlashActivity.class);
                    startActivity(intent);
                    SharedPreferences.Editor editor = sp.edit();
                    editor.putInt("first",1);
                    editor.commit();
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initView() {
        viewList = new ArrayList<>();
        viewOne = inflater.inflate(R.layout.guide_one,null);
        viewTwo = inflater.inflate(R.layout.guide_two,null);
        viewThree = inflater.inflate(R.layout.guide_three,null);
        viewList.add(viewOne);
        viewList.add(viewTwo);
        viewList.add(viewThree);
    }

    private void initPoint() {
        iv_point1 = (ImageView) findViewById(R.id.iv_point1);
        iv_point2 = (ImageView) findViewById(R.id.iv_point2);
        iv_point3 = (ImageView) findViewById(R.id.iv_point3);
        pointList = new ArrayList<>();
        pointList.add(iv_point1);
        pointList.add(iv_point2);
        pointList.add(iv_point3);
    }
}
