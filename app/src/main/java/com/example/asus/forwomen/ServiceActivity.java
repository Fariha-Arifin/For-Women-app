package com.example.asus.forwomen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ServiceActivity extends AppCompatActivity {

    EditText area;
    EditText destination;
    Button colig,review;
    View r_review;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.setTitle("Service");

        area = (EditText) findViewById(R.id.et_area);
        destination = (EditText) findViewById(R.id.et_destination);
        review = (Button) findViewById(R.id.btn_review);
        colig = (Button) findViewById(R.id.btn_colig);
        r_review = findViewById(R.id.result_review);

        review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkValidation()) {
                    r_review.setVisibility(View.VISIBLE);

                }
                else {
                    Toast.makeText(ServiceActivity.this, "Fill all Fields", Toast.LENGTH_SHORT).show();
                }

            }
        });

        colig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkValidation()) {
                    // startActivity(new Intent(HealthActivity.this, CommunityActivity.class));
                }
                else {
                    Toast.makeText(ServiceActivity.this, "Fill all Fields", Toast.LENGTH_SHORT).show();
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
        if (isEmpty(area) || isEmpty(destination) )
            return false;

        return true;
    }

    private boolean isEmpty(EditText etText) {
        return etText.getText().toString().trim().length() == 0;
    }
}
