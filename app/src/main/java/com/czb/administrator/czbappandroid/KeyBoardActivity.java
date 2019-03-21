package com.czb.administrator.czbappandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.czb.administrator.czbappandroid.util.KeyboardUtil;


public class KeyBoardActivity extends AppCompatActivity {
    private KeyboardUtil keyboardUtil;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key_board);
        mEditText=findViewById(R.id.edit_text);
        mEditText.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(keyboardUtil==null){
                    keyboardUtil=new KeyboardUtil(KeyBoardActivity.this,mEditText);
                    keyboardUtil.hideSoftInputMethod();
                    keyboardUtil.showKeyboard();
                }else{
                    keyboardUtil.showKeyboard();
                }
                return false;
            }
        });

        mEditText.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {
                Log.i("字符变换后", "afterTextChanged");
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.i("字符变换前", s + "-" + start + "-" + count + "-" + after);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.i("字符变换中", s + "-" + "-" + start + "-" + before + "-" + count);
            }
        });


    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (keyboardUtil.isShow()) {
                keyboardUtil.hideKeyboard();
            } else {
                finish();
            }
        }
        return false;
    }
}
