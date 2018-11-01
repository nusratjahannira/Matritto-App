package com.myapp.pregnancyapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BabyGrowth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby_growth);


        Button btton1 = (Button)findViewById(R.id.button1Id);
        btton1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),FirstWeek.class);

                startActivity(intent);

            }

        });

    }
}
