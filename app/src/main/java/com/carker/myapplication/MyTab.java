package com.carker.myapplication;

import com.carker.activity.FirstFragment;
import com.carker.activity.ForthFragment;
import com.carker.activity.SecondFragment;
import com.carker.activity.ThirdFragment;

/**
 * Created by carker on 2015/9/30.
 */
public enum MyTab {
    First(FirstFragment.class, 0,R.drawable.tab_icon_new,R.string.first),
    Second(SecondFragment.class, 1,R.drawable.tab_icon_new,R.string.second),
    Third(ThirdFragment.class, 2,R.drawable.tab_icon_new,R.string.third),
    Forth(ForthFragment.class, 3,R.drawable.tab_icon_new,R.string.forth);

    private int idx;
    private int resName;
    private int resIcon;
    private Class<?> clz;


    private MyTab(Class<?> clz, int idx, int resIcon, int resName) {
        this.clz = clz;
        this.idx = idx;
        this.resIcon = resIcon;
        this.resName = resName;
    }

    public Class<?> getClz() {
        return clz;
    }

    public void setClz(Class<?> clz) {
        this.clz = clz;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getResIcon() {
        return resIcon;
    }

    public void setResIcon(int resIcon) {
        this.resIcon = resIcon;
    }

    public int  getResName() {
        return resName;
    }

    public void setResName(int resName) {
        this.resName = resName;
    }
}
