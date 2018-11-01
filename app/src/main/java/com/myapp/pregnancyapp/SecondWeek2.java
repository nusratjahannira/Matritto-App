package com.myapp.pregnancyapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondWeek2 extends AppCompatActivity {
    private Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_week2);

        b2 =(Button)findViewById(R.id.next1);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next1Activity();
            }
        });
    }
    public void SecondButton(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/hqp3B_bDIjQ"));
        startActivity(intent);

    }

    public void next1Activity(){
        Intent intent = new Intent(this,ThirdWeek.class);
        startActivity(intent);
    }
}
