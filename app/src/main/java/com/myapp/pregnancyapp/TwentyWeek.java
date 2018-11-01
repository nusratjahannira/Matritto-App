package com.myapp.pregnancyapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TwentyWeek extends AppCompatActivity {
    private Button b20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twenty_week);

        b20 =(Button)findViewById(R.id.next20);
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next20Activity();
            }
        });
    }
    public void twentyButton(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/tTQ1NaYH4TI"));
        startActivity(intent);

    }

    public void next20Activity(){
        Intent intent = new Intent(this,TwentyoneWeek.class);
        startActivity(intent);

    }
}
