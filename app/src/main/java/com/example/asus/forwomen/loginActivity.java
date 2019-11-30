package com.example.asus.forwomen;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {
    EditText etUserName;
    EditText etPass;

    TextView signup;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String ft = preferences.getString("firstTime" , "yes");

        if(ft.equals("No")){
            startActivity(new Intent(loginActivity.this,MenuActivity.class));
        }

        etUserName = (EditText) findViewById(R.id.input_email);
        etPass = (EditText) findViewById(R.id.input_password);
        signup = (TextView) findViewById(R.id.link_signup);

        btnLogin = (Button) findViewById(R.id.btn_login);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(checkValidation()){

                    String username = etUserName.getText().toString();
                    String password = etPass.getText().toString();

                    SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    String pass = preferences.getString(username , "null");

                    if(pass.equals(password)){

                        SharedPreferences preferencess = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                        SharedPreferences.Editor editor = preferencess.edit();
                        editor.putString("firstTime", "No");
                        editor.commit();
                        startActivity(new Intent(loginActivity.this,MenuActivity.class));
                    }
                    else {
                        Toast.makeText(loginActivity.this, "Incorrect Login", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(loginActivity.this, "Fill all Fields", Toast.LENGTH_SHORT).show();

                }

            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(loginActivity.this,MenuActivity.class));
            }
        });



    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_about:
                // About option clicked.
                return true;
            case R.id.action_feedback:
                // Exit option clicked.
                return true;
            case R.id.action_logout:
                // Exit option clicked.
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private boolean checkValidation() {
        if (isEmpty(etPass) || isEmpty(etUserName))
            return false;

        return true;
    }

    private boolean isEmpty(EditText etText) {
        return etText.getText().toString().trim().length() == 0;
    }


}
