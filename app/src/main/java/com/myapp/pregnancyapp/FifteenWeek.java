package com.myapp.pregnancyapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FifteenWeek extends AppCompatActivity {
    private Button b15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifteen_week);
        b15 =(Button)findViewById(R.id.next15);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next15Activity();
            }
        });
    }
    public void fifteenButton(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/sCibtxumCQU"));
        startActivity(intent);

    }

    public void next15Activity(){
        Intent intent = new Intent(this,Sixteenweek.class);
        startActivity(intent);
    }
}
