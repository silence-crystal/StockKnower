package com.example.czz.stockknower.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.czz.stockknower.R;
import com.example.czz.stockknower.utils.CloseAllActivitys;

import java.util.Timer;
import java.util.TimerTask;

public class FlashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);
        CloseAllActivitys.list.add(this);
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(FlashActivity.this,MainActivity.class);
                startActivity(intent);

            }
        };
        timer.schedule(task,1500);
    }
}
