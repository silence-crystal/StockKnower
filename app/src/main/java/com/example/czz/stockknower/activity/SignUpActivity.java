package com.example.czz.stockknower.activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.czz.stockknower.R;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

public class SignUpActivity extends Activity implements View.OnClickListener {
    private EditText et_signup_username;
    private EditText et_signup_password;
    private EditText et_signup_surepass;
    private TextView tv_signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initView();
    }

    private void initView() {
        et_signup_username = (EditText) findViewById(R.id.et_signup_username);
        et_signup_password = (EditText) findViewById(R.id.et_signup_password);
        et_signup_surepass = (EditText) findViewById(R.id.et_signup_surepass);
        tv_signup = (TextView) findViewById(R.id.tv_sign_up);

        tv_signup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_sign_up:
                //判断两次密码是否一致
                if (et_signup_password.getText().toString().equals(et_signup_surepass.getText().toString())){
                    //bmob注册
                    BmobUser user = new BmobUser();
                    user.setUsername(et_signup_username.getText().toString());
                    user.setPassword(et_signup_password.getText().toString());
                    user.signUp(new SaveListener<BmobUser>() {
                        @Override
                        public void done(BmobUser bmobUser, BmobException e) {
                            if (e==null){
                                Toast.makeText(SignUpActivity.this,"注册成功"+bmobUser.toString(),Toast.LENGTH_SHORT).show();
                                finish();
                            }else {
                                Toast.makeText(SignUpActivity.this,e.getMessage(),Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }else {
                    Toast.makeText(this,"两次密码输入不一致，请重新输入",Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
