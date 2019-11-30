package com.example.asus.forwomen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class TransportActivity extends AppCompatActivity implements com.wdullaer.materialdatetimepicker.date.DatePickerDialog.OnDateSetListener {

    EditText from;
    EditText to;
    EditText date;
    Button details,find;
    View transport,companion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.setTitle("Transport");


        details = (Button) findViewById(R.id.btn_details);
        find = (Button) findViewById(R.id.btn_find);
        transport = findViewById(R.id.result_transport);
        companion = findViewById(R.id.result_companion);
        from = (EditText) findViewById(R.id.et_from);
        to = (EditText) findViewById(R.id.et_to);
        date = (EditText) findViewById(R.id.et_date);

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar now = Calendar.getInstance();
                com.wdullaer.materialdatetimepicker.date.DatePickerDialog dpd = com.wdullaer.materialdatetimepicker.date.DatePickerDialog.newInstance(
                        TransportActivity.this,
                        now.get(Calendar.YEAR),
                        now.get(Calendar.MONTH),
                        now.get(Calendar.DAY_OF_MONTH)
                );
                dpd.show(getFragmentManager(), "Datepickerdialog");
            }
        });



        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkValidation()) {
                    transport.setVisibility(View.VISIBLE);
                    companion.setVisibility(View.GONE);
                }
                else {
                    Toast.makeText(TransportActivity.this, "Fill all Fields", Toast.LENGTH_SHORT).show();
                }

            }
        });

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkValidation()) {
                    companion.setVisibility(View.VISIBLE);
                    transport.setVisibility(View.GONE);
                }
                else {
                    Toast.makeText(TransportActivity.this, "Fill all Fields", Toast.LENGTH_SHORT).show();
                }

            }
        });




    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onDateSet(com.wdullaer.materialdatetimepicker.date.DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
        String startDate = String.valueOf(year) + "-" + String.valueOf(monthOfYear) + "-" + String.valueOf(dayOfMonth);
        date.setText(startDate);
    }

    private boolean checkValidation() {
        if (isEmpty(from) || isEmpty(to) || isEmpty(date))
            return false;

        return true;
    }

    private boolean isEmpty(EditText etText) {
        return etText.getText().toString().trim().length() == 0;
    }
}