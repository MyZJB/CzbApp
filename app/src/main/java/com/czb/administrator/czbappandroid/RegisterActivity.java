package com.czb.administrator.czbappandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.czb.administrator.czbappandroid.login.LoginActivity;

public class RegisterActivity extends AppCompatActivity {

    private TextView mTvExitLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mTvExitLogin=findViewById(R.id.tv_exitlogin);
        mTvExitLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
