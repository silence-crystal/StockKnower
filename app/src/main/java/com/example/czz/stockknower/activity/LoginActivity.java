package com.example.czz.stockknower.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.czz.stockknower.R;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

public class LoginActivity extends Activity implements View.OnClickListener {
    private EditText et_login_username;
    private EditText et_login_password;
    private TextView tv_login;
    private TextView tv_turn_signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        et_login_username = (EditText) findViewById(R.id.et_login_username);
        et_login_password = (EditText) findViewById(R.id.et_login_password);
        tv_login = (TextView) findViewById(R.id.tv_login);
        tv_turn_signup = (TextView) findViewById(R.id.tv_turn_signup);

        tv_login.setOnClickListener(this);
        tv_turn_signup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_login:
                //bmob云登录
                BmobUser user = new BmobUser();
                user.setUsername(et_login_username.getText().toString());
                user.setPassword(et_login_password.getText().toString());
                user.login(new SaveListener<BmobUser>() {
                    @Override
                    public void done(BmobUser bmobUser, BmobException e) {
                        if (e==null){
                            Toast.makeText(LoginActivity.this,"登陆成功",Toast.LENGTH_SHORT).show();
                            finish();
                        }else {
                            Toast.makeText(LoginActivity.this,e.getMessage(),Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                break;
            case R.id.tv_turn_signup:
                Intent intent = new Intent(this,SignUpActivity.class);
                startActivity(intent);
                break;
        }
    }
}
