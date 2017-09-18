package com.demo.fragmentdemo.third;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.demo.fragmentdemo.R;


/**
 * Created by ${momoThree} on 2017/9/18.
 * Title:适配平板和手机
 * 在layout文件下新建一个activity_main3.xml
 * 在layout_larger文件下也新建一个activity_main3.xml.
 * 这样就可以看到单页模式和双页模式了
 */

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }



}
