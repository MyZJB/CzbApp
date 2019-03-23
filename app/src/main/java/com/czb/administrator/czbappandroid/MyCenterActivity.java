package com.czb.administrator.czbappandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import com.czb.administrator.czbappandroid.gridview.MyCenterAdapter;

public class MyCenterActivity extends AppCompatActivity {

    private GridView mGvGenter;
    private ImageView MyData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_center);
        mGvGenter=findViewById(R.id.gv_genter);
        mGvGenter.setAdapter(new MyCenterAdapter(MyCenterActivity.this));
        MyData=findViewById(R.id.iv_mydata);
        MyData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MyCenterActivity.this,MyDataActivity.class);
                startActivity(intent);
            }
        });

    }
}
