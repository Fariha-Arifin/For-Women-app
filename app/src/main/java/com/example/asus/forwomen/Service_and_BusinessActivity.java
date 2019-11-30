package com.example.asus.forwomen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;

public class Service_and_BusinessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_and__business);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.setTitle("Service & Business");

    }

    public void onService(View view) {
        startActivity(new Intent(Service_and_BusinessActivity.this, ServiceActivity.class));

    }
    public void onBusi(View view) {
        startActivity(new Intent(Service_and_BusinessActivity.this, BusinessActivity.class));

    }
    public void onReview(View view) {
        startActivity(new Intent(Service_and_BusinessActivity.this, ReviewActivity.class));

    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
