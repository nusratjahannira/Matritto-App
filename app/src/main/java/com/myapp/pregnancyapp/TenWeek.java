package com.myapp.pregnancyapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TenWeek extends AppCompatActivity {
    private Button b10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten_week);
        b10 =(Button)findViewById(R.id.next10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next10Activity();
            }
        });
    }
    public void tenButton(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/yydAMq8SsiE"));
        startActivity(intent);

    }

    public void next10Activity(){
        Intent intent = new Intent(this,ElevenWeek.class);
        startActivity(intent);
    }

}

