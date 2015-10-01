package com.carker.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.carker.bean.MyEntity;
import com.carker.myapplication.R;

import java.util.List;

/**
 * Created by carker on 2015/9/30.
 */
public class MyGridViewAdapter extends RecyclerView.Adapter implements View.OnClickListener{
    List<MyEntity> list;
    private OnRecyclerViewItemClickListener mOnItemClickListener = null;
    public MyGridViewAdapter(List<MyEntity> list){
        this.list=list;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_right_item,parent,false);
        MyViewholder hoder=new MyViewholder(view);
        view.setOnClickListener(this);
        return hoder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewholder viewholder= (MyViewholder) holder;
//        viewholder.content.setText(list.get(position).getContent());
        viewholder.content.setText(list.get(position).getTitle());
        holder.itemView.setTag(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onClick(View v) {
        if(mOnItemClickListener!=null){
            mOnItemClickListener.onItemClick(v,(MyEntity)v.getTag());
        }
    }
    public void setOnItemClickListener(OnRecyclerViewItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }
    class MyViewholder extends  RecyclerView.ViewHolder{
        ImageView imageView;
        TextView content;
        public MyViewholder(View itemView) {
            super(itemView);
            imageView= (ImageView) itemView.findViewById(R.id.right_title);
            content= (TextView) itemView.findViewById(R.id.right_mes);
        }
    }
    public static interface OnRecyclerViewItemClickListener {
        void onItemClick(View view , MyEntity data);
    }
}
