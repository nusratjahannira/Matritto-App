package com.myapp.pregnancyapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForteenWeek extends AppCompatActivity {
    private Button b14;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forteen_week);
        b14 =(Button)findViewById(R.id.next14);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next14Activity();
            }
        });
    }
    public void forteenButton(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/iSTMRcLgUi4"));
        startActivity(intent);

    }

    public void next14Activity(){
        Intent intent = new Intent(this,FifteenWeek.class);
        startActivity(intent);
    }
}
