package com.myapp.pregnancyapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SixthWeek extends AppCompatActivity {
    private Button b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_week);
        b6 =(Button)findViewById(R.id.next6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next6Activity();
            }
        });
    }
    public void sixthButton(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/Cr-CmUa2ZMM"));
        startActivity(intent);

    }

    public void next6Activity(){
        Intent intent = new Intent(this,SevenWeek.class);
        startActivity(intent);
    }
}

