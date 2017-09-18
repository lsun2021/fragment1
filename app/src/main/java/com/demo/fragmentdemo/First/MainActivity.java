package com.demo.fragmentdemo.First;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.demo.fragmentdemo.R;


/**
 *fragment的简单用法   布局文件 android ：name  引用Fragment
 */
public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


}
