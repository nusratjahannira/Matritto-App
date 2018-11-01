package com.myapp.pregnancyapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ElevenWeek extends AppCompatActivity {
    private Button b11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleven_week);
        b11 =(Button)findViewById(R.id.next11);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next11Activity();
            }
        });
    }
    public void elevenButton(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/-58GtjhGCuA"));
        startActivity(intent);

    }

    public void next11Activity(){
        Intent intent = new Intent(this,TwelveWeek.class);
        startActivity(intent);
    }
    
}
