package com.czb.administrator.czbappandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import com.czb.administrator.czbappandroid.gridview.MyCenterAdapter;

public class MyCenterActivity extends AppCompatActivity {

    private GridView mGvGenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_center);
        mGvGenter=findViewById(R.id.gv_genter);
        mGvGenter.setAdapter(new MyCenterAdapter(MyCenterActivity.this));
    }
}
