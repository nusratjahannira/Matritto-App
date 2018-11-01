package com.myapp.pregnancyapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FifthWeek extends AppCompatActivity {
    private Button b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_week);

        b5 =(Button)findViewById(R.id.next5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next5Activity();
            }
        });
    }
    public void FifthButton(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/PkM2m5o3Cl0"));
        startActivity(intent);

    }

    public void next5Activity(){
        Intent intent = new Intent(this,SixthWeek.class);
        startActivity(intent);
    }

}
