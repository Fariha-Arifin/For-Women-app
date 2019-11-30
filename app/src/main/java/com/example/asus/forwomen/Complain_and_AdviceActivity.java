package com.example.asus.forwomen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Complain_and_AdviceActivity extends AppCompatActivity {

    EditText tittle;
    EditText details;
    Button post,apost;
    View r_advice1,r_advice2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain_and__advice);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.setTitle("Social advice");

        tittle = (EditText) findViewById(R.id.et_1);
        details = (EditText) findViewById(R.id.et_2);
        apost = (Button) findViewById(R.id.btn_Apost);
        post = (Button) findViewById(R.id.btn_Post);
        r_advice1 = findViewById(R.id.result_advice1);
        r_advice2 = findViewById(R.id.result_advice2);

        apost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkValidation()) {
                    r_advice1.setVisibility(View.VISIBLE);
                    r_advice2.setVisibility(View.GONE);


                }
                else {
                    Toast.makeText(Complain_and_AdviceActivity.this, "Fill all Fields", Toast.LENGTH_SHORT).show();
                }

            }
        });

        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkValidation()) {
                    r_advice2.setVisibility(View.VISIBLE);
                    r_advice1.setVisibility(View.GONE);
                }
                else {
                    Toast.makeText(Complain_and_AdviceActivity.this, "Fill all Fields", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    public void onUploadimage(View view) {
        //startActivity(new Intent(MenuActivity.this, TransportActivity.class));

    }
    public void onUploadfile(View view) {
        //startActivity(new Intent(MenuActivity.this, TransportActivity.class));

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
