package com.myapp.pregnancyapp;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.DialogFragment;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TimePicker;

import java.util.ArrayList;
import java.util.Calendar;

public class AlarmActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener {
    Button add_button,btn_set_time;
    EditText edit_text1;
    ListView lv;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;
    NotificationHelper mNotificationHelper;
    String msg;

    int h,m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        add_button = findViewById(R.id.add_button_layout);
        btn_set_time = findViewById(R.id.btn_set_time_layout);
        edit_text1 =  findViewById(R.id.et1);
        mNotificationHelper = new NotificationHelper(this);
        lv = findViewById(R.id.lv1);
        arrayList = new ArrayList <String>();
        adapter = new ArrayAdapter <String>(AlarmActivity.this,android.R.layout.simple_list_item_1,arrayList);
        lv.setAdapter(adapter);



        btn_set_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.support.v4.app.DialogFragment timepicker = new TimePickerFragment();
                timepicker.show(getSupportFragmentManager(),"time picker");

            }
        });


        add_button.setOnClickListener(new View.OnClickListener() {   // BUTTON CLICK ON CLICK LISTENER
            @Override
            public void onClick(View v) {

                msg =  edit_text1.getText().toString();
                arrayList.add("Reminder name :"+ msg+"  " + "  " +"Time : "+ h + " "+":"+" "+ m );

            }
        });


    }


    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

        //textView1.setText(" Hour :"+ hourOfDay + "Minute :" + minute);
        h = hourOfDay;
        m = minute;
        // arrayList.add("Reminder name :"+ msg+"  " + "  " +"Reminder  time : "+ h + " "+":"+" "+ m );


        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY,hourOfDay);
        c.set(Calendar.MINUTE,minute);
        c.set(Calendar.SECOND,0);

        startAlarm(c);

    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    public void startAlarm(Calendar c){

        AlarmManager alarmManager = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(this,Alarm.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this,1,intent,0);
        if(c.before(Calendar.getInstance())){
            c.add(Calendar.DATE,1);
        }

        alarmManager.setExact(AlarmManager.RTC_WAKEUP,c.getTimeInMillis(),pendingIntent);


    }


}
