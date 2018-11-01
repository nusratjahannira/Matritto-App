package com.myapp.pregnancyapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NineWeek extends AppCompatActivity {
    private Button b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine_week);
        b9 =(Button)findViewById(R.id.next9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next9Activity();
            }
        });
    }
    public void nineButton(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/TTNzitwEO6k"));
        startActivity(intent);

    }

    public void next9Activity(){
        Intent intent = new Intent(this,TenWeek.class);
        startActivity(intent);
    }

}

