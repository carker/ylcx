package com.carker.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import com.carker.bean.MyEntity;
import com.carker.myapplication.R;

import java.util.List;

/**
 * Created by carker on 2015/9/29.
 */
public class MyRecycleAdapter extends RecyclerView.Adapter implements View.OnClickListener{
    private List<MyEntity> list;
    private OnRecyclerViewItemClickListener mOnItemClickListener = null;
    public MyRecycleAdapter(List<MyEntity> list){
        this.list=list;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_item,viewGroup,false);
        ViewHolder holder=new ViewHolder(view);
       view.setOnClickListener(this);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ViewHolder holder= (ViewHolder) viewHolder;
            holder.textView.setText(list.get(i).getTitle());
        holder.textTwo.setText(list.get(i).getIndex());
//        holder.textThree.setText(list.get(i).getContent());
        holder.textThree.setText(list.get(i).getTitle());
            holder.itemView.setTag(list.get(i));
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
    class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView,textTwo,textThree;
        public ViewHolder(View itemView) {
            super(itemView);
            textView= (TextView) itemView.findViewById(R.id.text);
            textTwo= (TextView) itemView.findViewById(R.id.text_two);
            textThree=(TextView)itemView.findViewById(R.id.text_three);

        }


    }


    //define interface
    public static interface OnRecyclerViewItemClickListener {
        void onItemClick(View view , MyEntity data);
    }

}
