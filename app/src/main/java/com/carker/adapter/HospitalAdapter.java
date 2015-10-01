package com.carker.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.carker.bean.HospitalEntity;
import com.carker.myapplication.R;

import java.util.List;

/**
 * Created by carker on 2015/9/28.
 */
public class HospitalAdapter extends BaseAdapter {
    private Context context;
    private List<HospitalEntity> list;
    private LayoutInflater inflater;

    public HospitalAdapter(Context context,List<HospitalEntity> list){
        this.context=context;
        this.list=list;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    class ViewHolder{
        TextView tvTitle;
        TextView tvIndex;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            viewHolder=new ViewHolder();
            convertView=inflater.inflate(R.layout.hospital,null);
            viewHolder.tvTitle= (TextView) convertView.findViewById(R.id.hostipal_title);
            viewHolder.tvIndex= (TextView) convertView.findViewById(R.id.hostipal_content);
            convertView.setTag(viewHolder);
        }else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        viewHolder.tvTitle.setText(list.get(position).getHos_Ttitle());
        viewHolder.tvTitle.setTextSize(20);
        viewHolder.tvIndex.setText(list.get(position).getHos_content());
        viewHolder.tvIndex.setTextSize(20);
        return convertView;
    }
}
