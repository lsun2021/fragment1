package com.demo.fragmentdemo.four;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.demo.fragmentdemo.R;

/**
 * Created by ${momoThree} on 2017/9/18.
 * Title:
 *
 * 在layout文件下新建一个activity_main4文件
 * 在layout_sw600dp下也建这样一个文件，当屏幕大于600的时候，就会显示双页
 *
 */

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
}
