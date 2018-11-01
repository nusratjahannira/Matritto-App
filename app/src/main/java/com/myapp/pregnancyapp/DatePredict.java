package com.myapp.pregnancyapp;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class DatePredict extends AppCompatActivity implements View.OnClickListener {
    TextView textview3;
    DatePickerDialog datePickerDialog;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_predict);
        textview3 = (TextView)findViewById(R.id.textView3);
        button1 =(Button)findViewById(R.id.button1);

        button1.setOnClickListener(this);

    }

    public void onClick(View v) {


    DatePicker datePicker = new DatePicker(this);
    final int currentDay, currentMonth , currentYear ;
    currentDay = (datePicker.getDayOfMonth());
    currentMonth = (datePicker.getMonth());
    currentYear = (datePicker.getYear());

    datePickerDialog = new DatePickerDialog(this,


            new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                    int day = dayOfMonth +7 ;
                    int mon = month + 10;
                    int yrr = year ;

                    if( mon>3 ) {
                        yrr = year + 1;
                    }
                    if(day>30) {
                        day = day - 30;
                    }
                    if(mon >12) {

                        mon = mon - 12;
                    }


                    textview3.setText((day)+"  -  "+(mon)+"  -  "+(yrr));


                }
            },currentYear,currentMonth,currentDay);

    datePickerDialog.show();
    }
}

