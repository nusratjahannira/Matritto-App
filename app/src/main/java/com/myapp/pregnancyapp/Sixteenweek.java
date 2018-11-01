package com.myapp.pregnancyapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sixteenweek extends AppCompatActivity {

    private Button b16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixteenweek);
        b16 =(Button)findViewById(R.id.next16);
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next16Activity();
            }
        });
    }
    public void sixteenButton(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/JAnj0gi3NrQ"));
        startActivity(intent);

    }

    public void next16Activity(){
        Intent intent = new Intent(this,SeventeenWeek.class);
        startActivity(intent);

    }
}
