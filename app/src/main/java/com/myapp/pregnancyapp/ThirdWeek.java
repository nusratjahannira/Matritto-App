package com.myapp.pregnancyapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdWeek extends AppCompatActivity {
    private Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_week);

        b3 =(Button)findViewById(R.id.next2);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next2Activity();
            }
        });
    }
    public void ThirdButton(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/ddabRDhKhNI"));
        startActivity(intent);

    }

    public void next2Activity(){
        Intent intent = new Intent(this,ForthWeek.class);
        startActivity(intent);
    }

}
