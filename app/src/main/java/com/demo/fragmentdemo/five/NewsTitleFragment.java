package com.demo.fragmentdemo.five;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.demo.fragmentdemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ${momoThree} on 2017/9/15.
 * Title:
 */

public class NewsTitleFragment  extends Fragment {
    private static final String TAG = "NewsTitleFragment";
    private  boolean isTwoPan;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.news_title_flags,container,false);
        RecyclerView newsTitleRecycler= (RecyclerView) view.findViewById(R.id.news_title_recycler_view);
        newsTitleRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        NewsAdapter adapter=new NewsAdapter(getNews());
        newsTitleRecycler.setAdapter(adapter);
        return  view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(getActivity().findViewById(R.id.news_content_layout)!=null){
             isTwoPan=true;
        }else{
            isTwoPan=false;
        }
    }

    private  List<News>  getNews(){
        List<News> newsList=new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            News news=new News();
            news.setTitle("标题"+i);
            news.setContent("内容"+i);
            newsList.add(news);
        }
        return  newsList;
    }

    class NewsAdapter  extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

        private List<News> mNewsList;

        public NewsAdapter(List<News> mNewsList) {
            this.mNewsList = mNewsList;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item,parent,false);
            final ViewHolder holder=new ViewHolder(view);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    News news=mNewsList.get(holder.getAdapterPosition());
                    if(isTwoPan){
                        //双页模式
                        NewsContentFragment newsContentFragment= (NewsContentFragment) getFragmentManager().findFragmentById(R.id.news_content_fragment);
                        newsContentFragment.refresh(news.getTitle(),news.getContent());
                    }else{
                        //单页模式直接启动MainActivity3
                        NewsContentActivity.actionStart(getActivity() , news.getTitle(),news.getContent());

                    }
                }
            });
            return holder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            News news=mNewsList.get(position);
            holder.newsTitleText.setText(news.getTitle());
        }

        @Override
        public int getItemCount() {
            return mNewsList.size();
        }


        class ViewHolder extends  RecyclerView.ViewHolder{
            TextView newsTitleText;

            public ViewHolder(View itemView) {
                super(itemView);
                newsTitleText= (TextView) itemView.findViewById(R.id.news_title);
            }
        }
    }

}
