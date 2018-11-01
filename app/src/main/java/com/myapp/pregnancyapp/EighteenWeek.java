package com.myapp.pregnancyapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EighteenWeek extends AppCompatActivity {
    private Button b18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighteen_week);
        b18 =(Button)findViewById(R.id.next18);
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next18Activity();
            }
        });
    }
    public void eighteenButton(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/dVoWzJIw8Pc"));
        startActivity(intent);

    }

    public void next18Activity(){
        Intent intent = new Intent(this,NineteenWeek.class);
        startActivity(intent);

    }
}
