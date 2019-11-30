package com.example.asus.forwomen;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

        Handler handler;
        String s = "Women helper";
        TextView tvSplashText;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);

            tvSplashText = (TextView) findViewById(R.id.tv_splash);
            handler = new Handler();
            handler.post(splashRunnable);
        }

        Runnable splashRunnable = new Runnable() {
            int i = 0;
            String str ="";


            @Override
            public void run() {
                if (i < s.length()) {
                    str = str.concat(s.charAt(i) + "");
                    tvSplashText.setText(str);
                    i++;
                    handler.postDelayed(this, 150);
                } else {

                    SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    String ft = preferences.getString("firstTime" , "yes");
                    if(ft.equals("No")){
                        startActivity(new Intent(SplashActivity.this,MenuActivity.class));
                    }
                    else {
                        startActivity(new Intent(SplashActivity.this, loginActivity.class));
                    }

                }
            }
        };
}
