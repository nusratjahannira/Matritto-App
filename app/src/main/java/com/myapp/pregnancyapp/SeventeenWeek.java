package com.myapp.pregnancyapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeventeenWeek extends AppCompatActivity {
    private Button b17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventeen_week);
        b17 =(Button)findViewById(R.id.next17);
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next17Activity();
            }
        });
    }
    public void seventeenButton(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/dp9pRnTe1OI"));
        startActivity(intent);

    }

    public void next17Activity(){
        Intent intent = new Intent(this,EighteenWeek.class);
        startActivity(intent);

    }
}
