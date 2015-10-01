package com.carker.activity;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.carker.myapplication.OnTabReselectListener;
import com.carker.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ForthFragment extends Fragment implements OnTabReselectListener {


    public ForthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_forth, container, false);
    }


    @Override
    public void onTabReselect() {
        Toast.makeText(getActivity().getApplicationContext(), "Forth", Toast.LENGTH_SHORT).show();
    }
}
