package com.myapp.pregnancyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;

import android.widget.Button;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btn1 = (Button)findViewById(R.id.button1);

        Button btn2 = (Button)findViewById(R.id.button2) ;

        Button btn3 = (Button)findViewById(R.id.button3);



        btn1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),FirstTrimester.class);

                startActivity(intent);

            }

        });



        btn2.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),SecondTrimester.class);

                startActivity(intent);



            }

        });



        btn3.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),ThirdTrimester.class);

                startActivity(intent);



            }

        });

    }
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()== android.R.id.home) {
            super.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
