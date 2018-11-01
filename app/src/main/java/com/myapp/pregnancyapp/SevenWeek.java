package com.myapp.pregnancyapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SevenWeek extends AppCompatActivity {

    private Button b7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven_week);
        b7 =(Button)findViewById(R.id.next7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next7Activity();
            }
        });
    }
    public void sevenButton(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/vmmi8LWxqQs"));
        startActivity(intent);

    }

    public void next7Activity(){
        Intent intent = new Intent(this,EightWeek.class);
        startActivity(intent);
    }

}
