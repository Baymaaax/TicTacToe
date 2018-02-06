package com.example.nyt.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText etPhone, etPwd;
    Button btnLogin, btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etPhone = (EditText) findViewById(R.id.et_phone);
        etPwd = (EditText) findViewById(R.id.et_pwd);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnRegister = (Button) findViewById(R.id.btn_register);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etPhone.getText().toString().equals("13912345678")) {
                    Toast.makeText(LoginActivity.this, "用户不存在！", Toast.LENGTH_LONG).show();
                } else if (!etPwd.getText().toString().equals("123456")) {
                    Toast.makeText(LoginActivity.this, "密码错误！", Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    LoginActivity.this.finish();
                }
            }
        });


    }
}
