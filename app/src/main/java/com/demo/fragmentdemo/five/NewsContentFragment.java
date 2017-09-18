package com.demo.fragmentdemo.five;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.demo.fragmentdemo.R;

/**
 * Created by ${momoThree} on 2017/9/15.
 * Title:
 */

public class NewsContentFragment extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.news_content_frag, container,false);
        return view;
    }


    public  void  refresh(String newsTitle,String newsContent){
        View  vislayout=view.findViewById(R.id.vis_layout);
        vislayout.setVisibility(View.VISIBLE);
        TextView title= (TextView) view.findViewById(R.id.news_title_2);
        TextView  content= (TextView) view.findViewById(R.id.news_content_2);
        if(newsTitle==null||newsContent ==null){
            title.setText("标题1");
            content.setText("内容1");
        }else{
            title.setText(newsTitle);
            content.setText(newsContent);
        }

    }




}
