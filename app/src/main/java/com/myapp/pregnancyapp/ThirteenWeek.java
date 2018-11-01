package com.myapp.pregnancyapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirteenWeek extends AppCompatActivity {
    private Button b13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteen_week);
        b13 =(Button)findViewById(R.id.next13);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next13Activity();
            }
        });
    }
    public void thirteenButton(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/Mcwjimbew9Q"));
        startActivity(intent);

    }

    public void next13Activity(){
        Intent intent = new Intent(this,ForteenWeek.class);
        startActivity(intent);
    }

}
