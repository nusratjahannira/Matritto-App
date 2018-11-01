package com.myapp.pregnancyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DrsSuggestn2 extends AppCompatActivity {
    public View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drs_suggestn2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void riskButton(View view)
    {
        Intent intent=new Intent(getApplicationContext(),Pregnancy.class);
        startActivity(intent);

    }
    public void dontdobutton(View view)
    {
        Intent intent=new Intent(getApplicationContext(),DontDo2.class);
        startActivity(intent);

    }
    public void dobutton(View view)
    {
        Intent intent=new Intent(getApplicationContext(),DoPregnancy.class);
        startActivity(intent);

    }
    public void emergencybutton(View view)
    {
        Intent intent=new Intent(getApplicationContext(),EmergencyCall.class);
        startActivity(intent);

    }

}
