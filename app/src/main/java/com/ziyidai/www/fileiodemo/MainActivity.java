package com.ziyidai.www.fileiodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boolean succeses = FileUtils.writeFile("廖鹏辉好帅~~~\n",true);
        Toast.makeText(MainActivity.this,"是否成功:"+succeses,Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onStop() {
        super.onStop();
//        boolean succeses =    FileUtils.removeCache();
//        Toast.makeText(MainActivity.this,"是否移除成功:"+succeses,Toast.LENGTH_LONG).show();
    }
}
