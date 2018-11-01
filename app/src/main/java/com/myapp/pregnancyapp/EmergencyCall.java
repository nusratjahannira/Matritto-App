package com.myapp.pregnancyapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class EmergencyCall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_call);
        ImageButton btn1 = (ImageButton) findViewById(R.id.imageButton1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent = callintent.setData(Uri.parse("tel:01988155254"));
                if (ActivityCompat.checkSelfPermission(EmergencyCall.this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity(callintent);
            }
        });
        ImageButton btn2 = (ImageButton) findViewById(R.id.imageButton2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent = callintent.setData(Uri.parse("tel:01681936818"));
                if (ActivityCompat.checkSelfPermission(EmergencyCall.this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity(callintent);
            }
        });

    }
}
