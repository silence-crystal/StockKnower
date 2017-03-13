package com.example.czz.stockknower.activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.czz.stockknower.R;

public class VersionActivity extends Activity implements View.OnClickListener{
    private TextView tv_checkversion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_version);
        tv_checkversion = (TextView) findViewById(R.id.tv_checkversion);
        tv_checkversion.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"当前已经是最新版本了",Toast.LENGTH_SHORT).show();
    }
}
