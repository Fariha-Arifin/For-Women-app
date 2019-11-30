package com.example.asus.forwomen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

public class HealthActivity extends AppCompatActivity {

    EditText tittle;
    EditText details;
    Button solution,chat;
    View r_solution;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.setTitle("Health");

        tittle = (EditText) findViewById(R.id.et_tittle);
        details = (EditText) findViewById(R.id.et_details);
        solution = (Button) findViewById(R.id.btn_solution);
        chat = (Button) findViewById(R.id.btn_chat);
        r_solution = findViewById(R.id.result_solution);

        solution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkValidation()) {
                    r_solution.setVisibility(View.VISIBLE);

                }
                else {
                    Toast.makeText(HealthActivity.this, "Fill all Fields", Toast.LENGTH_SHORT).show();
                }

            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkValidation()) {
                   // startActivity(new Intent(HealthActivity.this, CommunityActivity.class));
                }
                else {
                    Toast.makeText(HealthActivity.this, "Fill all Fields", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private boolean checkValidation() {
        if (isEmpty(tittle) || isEmpty(details) )
            return false;

        return true;
    }

    private boolean isEmpty(EditText etText) {
        return etText.getText().toString().trim().length() == 0;
    }
}
