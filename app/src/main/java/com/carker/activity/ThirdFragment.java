package com.carker.activity;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.carker.myapplication.OnTabReselectListener;
import com.carker.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragment extends Fragment implements OnTabReselectListener {


    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }


    @Override
    public void onTabReselect() {
        Toast.makeText(getActivity().getApplicationContext(), "Third", Toast.LENGTH_SHORT).show();
    }
}
