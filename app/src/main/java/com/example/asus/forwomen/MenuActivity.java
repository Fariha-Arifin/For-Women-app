package com.example.asus.forwomen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        this.setTitle("Women helper");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void onTransport(View view) {
        startActivity(new Intent(MenuActivity.this, TransportActivity.class));

    }
    public void onHealth(View view) {
        startActivity(new Intent(MenuActivity.this, HealthActivity.class));

    }
    public void onBusiness(View view) {
        startActivity(new Intent(MenuActivity.this, Service_and_BusinessActivity.class));

    }
    public void onCommunity(View view) {
        startActivity(new Intent(MenuActivity.this, CommunityActivity.class));

    }
    public void onSecurity(View view) {
        startActivity(new Intent(MenuActivity.this, SecurityActivity.class));

    }
    public void onComplain(View view) {
        startActivity(new Intent(MenuActivity.this, Complain_and_AdviceActivity.class));

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



}