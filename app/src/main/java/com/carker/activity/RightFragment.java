package com.carker.activity;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.carker.adapter.MyGridViewAdapter;
import com.carker.bean.MyEntity;
import com.carker.myapplication.R;

import java.util.ArrayList;
import java.util.List;

import de.greenrobot.event.EventBus;

public class RightFragment extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager gridManager;
//    private TextView title;
    MyGridViewAdapter adaper;
    List<MyEntity> list;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(MyEntity data){
        list=new ArrayList<MyEntity>();
        if(data!=null) {
//            title.setText(data.getTitle());
        for(int i=0;i<30;i++){
            list.add(data);
        }
            adaper=new MyGridViewAdapter(list);
            recyclerView.setAdapter(adaper);
            adaper.setOnItemClickListener(new MyGridViewAdapter.OnRecyclerViewItemClickListener() {
                @Override
                public void onItemClick(View view, MyEntity data) {
                    Toast.makeText(getActivity(),data.getTitle(),Toast.LENGTH_SHORT).show();
                }
            });

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_right, container, false);
        recyclerView= (RecyclerView) view.findViewById(R.id.gridview);
        gridManager=new GridLayoutManager(getActivity(),3);
        recyclerView.setLayoutManager(gridManager);
//        title= (TextView) view.findViewById(R.id.title);
        return view;
     }

//    @Override
//    public void onDestroyView() {
//        super.onDestroyView();
//        Fragment parentFragment = getParentFragment();
//        FragmentManager manager;
//        if (parentFragment != null) {
//            // If parent is another fragment, then this fragment is nested
//            manager = parentFragment.getChildFragmentManager();
//        } else {
//            // This fragment is placed into activity
//            manager = getActivity().getSupportFragmentManager();
//        }
//        manager.beginTransaction().remove(this).commitAllowingStateLoss();
//
//    }

}
