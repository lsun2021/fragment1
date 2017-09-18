package com.demo.fragmentdemo.second;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.demo.fragmentdemo.R;

/**
 * Created by ${momoThree} on 2017/9/18.
 * Title:
 */

public class RightFragment2  extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return  inflater.inflate(R.layout.right_fragment_2,container,false);
    }
}
