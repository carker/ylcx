package com.carker.activity;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.carker.myapplication.OnTabReselectListener;
import com.carker.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements OnTabReselectListener{
    private View view;
    private LeftFragment  leftFragment;
    private RightFragment rightFragment;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    private void setDefaultFragment()
    {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        //if null
        leftFragment = new LeftFragment();

        rightFragment=new RightFragment();
        transaction.replace(R.id.framelayout, leftFragment);
        transaction.replace(R.id.rframelayout, rightFragment);
        transaction.commit();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_first, container, false);
        if (view != null) {
            ViewGroup parent = (ViewGroup) view.getParent();
            if (parent != null)
                parent.removeView(view);
        }

            view = inflater.inflate(R.layout.layout_layou, container, false);
            setDefaultFragment();
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
////        manager.beginTransaction().remove(this).commitAllowingStateLoss();
//        manager.beginTransaction().remove(this).commit();
//
//    }

    @Override
    public void onTabReselect() {
        Toast.makeText(getActivity().getApplicationContext(), "First", Toast.LENGTH_SHORT).show();
    }
}

