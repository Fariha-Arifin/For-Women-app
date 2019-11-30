package com.example.asus.forwomen;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class CommunityActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;

    View viewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);
        this.setTitle("Women helper");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewResult = findViewById(R.id.layout_find_result);

        setupViewPager(viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTab();


    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter pagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFrag(new FragmentTransport(), "One");
        pagerAdapter.addFrag(new FragmentService(), "Two");
        pagerAdapter.addFrag(new FragmentBusiness() , "Three");
        pagerAdapter.addFrag(new FragmentGroup() , "Three");
        viewPager.setAdapter(pagerAdapter);

    }

    private void setupTab() {

        TextView groupTab = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        groupTab.setText("Group chat");
        tabLayout.getTabAt(0).setCustomView(groupTab);

        TextView todayTab = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        todayTab.setText("Transport");
        tabLayout.getTabAt(1).setCustomView(todayTab);


        TextView upcomingTab = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        upcomingTab.setText("Service");
        tabLayout.getTabAt(2).setCustomView(upcomingTab);


        TextView bigThingTab = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        bigThingTab.setText("Business");
        tabLayout.getTabAt(3).setCustomView(bigThingTab);

    }

    public void onGroup(View view) {
        //startActivity(new Intent(CommunityActivity.this, ServiceActivity.class));
        //write code here

    }
}
