package com.carker.activity;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.carker.Utils.DividerItemDecoration;
import com.carker.adapter.MyRecycleAdapter;
import com.carker.bean.Event;
import com.carker.bean.MyEntity;
import com.carker.myapplication.R;

import de.greenrobot.event.EventBus;

public class LeftFragment extends Fragment implements AdapterView.OnItemClickListener{
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    MyRecycleAdapter adapter;
    MyEntity entity;
    private RightFragment rightFragment;
    public LeftFragment() {
        // Required empty public constructor
    }
    private void setDefaultFragment()
    {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        rightFragment = new RightFragment();
//        rightFragment=new RightFragment();
        transaction.replace(R.id.rframelayout, rightFragment);
        transaction.commit();
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        entity=new MyEntity();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_left, container, false);
//        setDefaultFragment();
        recyclerView= (RecyclerView) view.findViewById(R.id.my_recycler_view);
        layoutManager=new LinearLayoutManager(getActivity());
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL_LIST));
        recyclerView.setLayoutManager(layoutManager);

//        adapter=new MyRecycleAdapter(entity.list);
//        recyclerView.setAdapter(adapter);
//        adapter.setOnItemClickListener(new MyRecycleAdapter.OnRecyclerViewItemClickListener() {
//            @Override
//            public void onItemClick(View view, MyEntity data) {
//                EventBus.getDefault().post(data);
//            }
//        });
        return view;
    }
//?????????????
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i("info", "onViewcreate()");
        Event.ItemEvent event = new Event.ItemEvent(MyEntity.list);
        EventBus.getDefault().post(event);
    }

    public void onEventMainThread(Event.ItemEvent event){
//        adapter=new MyRecycleAdapter(entity.list);
        adapter=new MyRecycleAdapter(event.getDatas());
        recyclerView.setAdapter(adapter);
        MyEntity my=event.getDatas().get(0);
        EventBus.getDefault().post(my);
        adapter.setOnItemClickListener(new MyRecycleAdapter.OnRecyclerViewItemClickListener() {
            @Override
            public void onItemClick(View view, MyEntity data) {
                EventBus.getDefault().post(data);
            }
        });

    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }


}
