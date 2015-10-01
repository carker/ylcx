package com.carker.myapplication;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

import com.carker.Utils.ApiHttpClient;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity implements TabHost.OnTabChangeListener,View.OnTouchListener{
    MyFragmentTabHost mTabhost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ApiHttpClient.getBook();
//        ApiHttpClient.getBookClassify();
//        ApiHttpClient.getBook(1);
//        ApiHttpClient.getBookList("1", 1, 5);
//        ApiHttpClient.getHsopitalList("0", 1, 20);
//        ApiHttpClient.getHsopitalInformation(1);
//        ApiHttpClient.getHsopitalLocation(116.405, 39.90, 1, 5);
//        ApiHttpClient.getHsopitalInformation("复旦大学附属华山医院");
        //error
//        ApiHttpClient.getCity();
//        ApiHttpClient.getHsopitalFeature(1);
        initVIew();
    }

    private void initVIew() {
        mTabhost= (MyFragmentTabHost) findViewById(android.R.id.tabhost);
        mTabhost.setup(this,getSupportFragmentManager(),R.id.realtabcontent);
        if (android.os.Build.VERSION.SDK_INT > 10) {
            mTabhost.getTabWidget().setShowDividers(0);
        }

        initTabs();
        mTabhost.setCurrentTab(0);
        mTabhost.setOnTabChangedListener(this);
    }

    private void initTabs() {
        MyTab tabs[]=MyTab.values();
        final int length=tabs.length;
        for(int i=0;i<length;i++){
            MyTab tab= tabs[i];
            TabHost.TabSpec tabSpec=mTabhost.newTabSpec(getString(tab.getResName()));
            View indicator = LayoutInflater.from(getApplicationContext())
                    .inflate(R.layout.tab_indicator, null);
            TextView title = (TextView) indicator.findViewById(R.id.tab_title);
            Drawable drawable = this.getResources().getDrawable(
                    tab.getResIcon());
            title.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null,
                    null);
            title.setText(tab.getResName());
            tabSpec.setIndicator(indicator);
            tabSpec.setContent(new TabHost.TabContentFactory() {
                @Override
                public View createTabContent(String tag) {
                    return new View(MainActivity.this);
                }
            });
            mTabhost.addTab(tabSpec, tab.getClz(), null);
            mTabhost.getTabWidget().getChildAt(i).setOnTouchListener(this);
        }
    }
    private Fragment getCurrentFragment() {
        return getSupportFragmentManager().findFragmentByTag(
                mTabhost.getCurrentTabTag());
    }

    @Override
    public void onTabChanged(String tabId) {
        final int size = mTabhost.getTabWidget().getTabCount();
        for (int i = 0; i < size; i++) {
            View v = mTabhost.getTabWidget().getChildAt(i);
            if (i == mTabhost.getCurrentTab()) {
                v.setSelected(true);
            } else {
                v.setSelected(false);
            }
        }

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        boolean consumed = false;
        // use getTabHost().getCurrentTabView to decide if the current tab is
        // touched again
        if (event.getAction() == MotionEvent.ACTION_DOWN
                && v.equals(mTabhost.getCurrentTabView())) {
            // use getTabHost().getCurrentView() to get a handle to the view
            // which is displayed in the tab - and to get this views context
            Fragment currentFragment = getCurrentFragment();
            if (currentFragment != null
                    && currentFragment instanceof OnTabReselectListener) {
                OnTabReselectListener listener = (OnTabReselectListener) currentFragment;
                listener.onTabReselect();
                consumed = true;
            }
        }
        return consumed;
    }
}
