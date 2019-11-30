package com.example.asus.forwomen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BusinessActivity extends AppCompatActivity {

    EditText category;
    EditText location;
    EditText details;
    Button friend;
    View r_friend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.setTitle("Business");

        friend = (Button) findViewById(R.id.btn_friend);
        r_friend = findViewById(R.id.result_friend);
        category = (EditText) findViewById(R.id.et_category);
        location = (EditText) findViewById(R.id.et_location);
        details = (EditText) findViewById(R.id.et_detail);

        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkValidation()) {
                    r_friend.setVisibility(View.VISIBLE);
                    //companion.setVisibility(View.GONE);
                }
                else {
                    Toast.makeText(BusinessActivity.this, "Fill all Fields", Toast.LENGTH_SHORT).show();
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
        if (isEmpty(category) || isEmpty(location) || isEmpty(details))
            return false;

        return true;
    }

    private boolean isEmpty(EditText etText) {
        return etText.getText().toString().trim().length() == 0;
    }
}
