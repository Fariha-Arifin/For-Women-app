package com.example.asus.forwomen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class ReviewActivity extends AppCompatActivity {

    EditText name;
    ImageButton upload;
    CheckBox b1,b2,b3,b4,b5,b6,b7,b8;
    Button post,apost;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.setTitle("Review");

        name = (EditText) findViewById(R.id.et_name);
        upload = (ImageButton) findViewById(R.id.btn_upload);
        b1 = (CheckBox) findViewById(R.id.box1);
        b2 = (CheckBox) findViewById(R.id.box2);
        b3 = (CheckBox) findViewById(R.id.box3);
        b4 = (CheckBox) findViewById(R.id.box4);
        b5 = (CheckBox) findViewById(R.id.box5);
        b6 = (CheckBox) findViewById(R.id.box6);
        b7 = (CheckBox) findViewById(R.id.box7);
        b8 = (CheckBox) findViewById(R.id.box8);
        post = (Button) findViewById(R.id.btn_post);
        apost = (Button) findViewById(R.id.btn_apost);

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkValidation()) {
                   //upload photo from file
                }
                else {
                    Toast.makeText(ReviewActivity.this, "Fill category name Field", Toast.LENGTH_SHORT).show();
                }

            }
        });
        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //write code here
            }
        });
        apost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //write code here
            }
        });


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    private boolean checkValidation() {
        if (isEmpty(name) )
            return false;

        return true;
    }

    private boolean isEmpty(EditText etText) {
        return etText.getText().toString().trim().length() == 0;
    }
}
