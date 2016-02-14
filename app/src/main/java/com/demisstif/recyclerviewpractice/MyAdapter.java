package com.demisstif.recyclerviewpractice;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by demisstif on 2016/2/14.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<MyData> datas;
    private Context context;
    private MyViewHolder myViewHolder;
    public MyAdapter(List<MyData> datas, Context context) {
        this.datas = datas;
        this.context = context;
    }

    /**
     * 这里用来获取item的布局的view
     *
     * 这里我犯了一个错，在下面的参数列表中我少写了一个false然后报了一个
     * The specified child already has a parent.
     * You must call removeView() on the child's parent first.
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(context).
                inflate(R.layout.item_layout, parent,false);
         myViewHolder = new MyViewHolder(itemLayoutView);
        return myViewHolder;
    }

    /**
     * 这个方法可以用来对viewholder的内容赋值，赋值后就可以改变view的显示，
     * 那么推论：todo这个viewholder的内容将显示出来
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MyData myData = datas.get(position);
        myViewHolder.textView.setText(myData.getMessageContent());

    }


    @Override
    public int getItemCount() {
        return datas.size();
    }

    /**
     * 自定义自己的viewholder
     * 1.viewholder是用来服用view的所以想好你的item中要包含哪些view
     * 将要包含的view设为成员变量
     * 2.构造器用来初始化你的item中包含的view，所以这里使用findviewbyid时需要传入一个layout的
     * view用其来找，就是你的item的layout布局，在oncreateviewholder中得到
     */
    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;


        public MyViewHolder(View itemView) {
            super(itemView);
             textView = (TextView) itemView.findViewById(R.id.item_text);
        }
    }
}
