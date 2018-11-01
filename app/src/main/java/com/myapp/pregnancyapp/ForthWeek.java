package com.myapp.pregnancyapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForthWeek extends AppCompatActivity {
    private Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth_week);
        b4 =(Button)findViewById(R.id.next3);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next3Activity();
            }
        });
    }
    public void forthButton(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/fIZBqRlIqJc"));
        startActivity(intent);

    }

    public void next3Activity(){
        Intent intent = new Intent(this,FifthWeek.class);
        startActivity(intent);
    }

}
