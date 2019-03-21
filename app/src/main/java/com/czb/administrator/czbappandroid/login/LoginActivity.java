package com.czb.administrator.czbappandroid.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.czb.administrator.czbappandroid.IndexActivity;
import com.czb.administrator.czbappandroid.R;
import com.czb.administrator.czbappandroid.RegisterActivity;

public class LoginActivity extends AppCompatActivity {

    private Button mBtnLogin;
    private EditText mEtUserName,mEtPassWord;
    private TextView mTvMsg,mTvRegister,mTvForgetPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mBtnLogin=findViewById(R.id.btn_login);
        mEtUserName=findViewById(R.id.et_username);
        mEtPassWord=findViewById(R.id.et_password);
        mTvMsg=findViewById(R.id.tv_msg);
        mTvRegister=findViewById(R.id.tv_register);
        mTvForgetPwd=findViewById(R.id.tv_forgetPwd);
        /*Drawable drawable=getResources().getDrawable(R.drawable.input_icon_accounts);
        drawable.setBounds(0,0,50,55);//第一0是距左边距离，第二0是距上边距离，30、35分别是长宽
        mEtUserName.setCompoundDrawables(drawable,null,null,null);//只放左边*/

        mBtnLogin.setOnClickListener(new OnClickListener());
        mTvRegister.setOnClickListener(new OnClickListener());
    }

    class  OnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent=null;
            switch (view.getId()){
                case R.id.btn_login:
                    intent=new Intent(LoginActivity.this,IndexActivity.class);
                    break;
                case  R.id.tv_forgetPwd:
                    break;
                case  R.id.tv_register:
                    intent=new Intent(LoginActivity.this, RegisterActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
