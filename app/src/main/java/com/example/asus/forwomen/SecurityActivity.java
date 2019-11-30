package com.example.asus.forwomen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;

public class SecurityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.setTitle("Security");

    }

    public void onEmergency(View view) {
        // startActivity(new Intent(Service_and_BusinessActivity.this, ReviewActivity.class));

    }


    public void onFamily(View view) {
       // startActivity(new Intent(SecurityActivity.this, ServiceActivity.class));

    }
    public void onFriend(View view) {
        //startActivity(new Intent(Service_and_BusinessActivity.this, BusinessActivity.class));

    }
    public void onPolice(View view) {
        // startActivity(new Intent(Service_and_BusinessActivity.this, ReviewActivity.class));

    }
    public void onLocation(View view) {
        // startActivity(new Intent(Service_and_BusinessActivity.this, ReviewActivity.class));

    }

    public void onEdit1(View view) {
        // startActivity(new Intent(Service_and_BusinessActivity.this, ReviewActivity.class));

    }
    public void onEdit2(View view) {
        // startActivity(new Intent(Service_and_BusinessActivity.this, ReviewActivity.class));

    }
    public void onEdit3(View view) {
        // startActivity(new Intent(Service_and_BusinessActivity.this, ReviewActivity.class));

    }
    public void onEdit4(View view) {
        // startActivity(new Intent(Service_and_BusinessActivity.this, ReviewActivity.class));

    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
