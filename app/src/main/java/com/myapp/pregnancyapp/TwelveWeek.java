package com.myapp.pregnancyapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TwelveWeek extends AppCompatActivity {
    private Button b12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelve_week);
        b12 =(Button)findViewById(R.id.next12);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next12Activity();
            }
        });
    }
    public void twelveButton(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/H9tMRKd0PBM"));
        startActivity(intent);

    }

    public void next12Activity(){
        Intent intent = new Intent(this,ThirteenWeek.class);
        startActivity(intent);
    }

}
