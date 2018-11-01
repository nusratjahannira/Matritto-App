package com.myapp.pregnancyapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EightWeek extends AppCompatActivity {
    private Button b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight_week);
        b8 =(Button)findViewById(R.id.next8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next8Activity();
            }
        });
    }
    public void eightButton(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/xeYC2Z3TBOs"));
        startActivity(intent);

    }

    public void next8Activity(){
        Intent intent = new Intent(this,NineWeek.class);
        startActivity(intent);
    }


}
