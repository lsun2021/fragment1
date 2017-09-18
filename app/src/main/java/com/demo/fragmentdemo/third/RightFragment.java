package com.demo.fragmentdemo.third;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.demo.fragmentdemo.R;


/**
 * Created by ${momoThree} on 2017/9/15.
 * Title:
 */

public class RightFragment extends Fragment {
    private static final String TAG = "RightFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.right_fragment,container,false);
        return  view;
    }

}
