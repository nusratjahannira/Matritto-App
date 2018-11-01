package com.myapp.pregnancyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {
    private TextView aboutUs,Developer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        aboutUs =findViewById(R.id.AboutusId);
        Developer = findViewById(R.id.DeveloperId);
    }
}
