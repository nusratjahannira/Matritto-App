package com.myapp.pregnancyapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class LikesActivity extends AppCompatActivity {
    public View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_likes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    public void FbButton(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/236073603586604/?ref=br_rs"));
        startActivity(intent);


    }
    public void Musicbutton(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=kxkwnBX6LGg&list=PLhRsu2C962I5oUuiHWwllN38mKaOxvzwA"));

        startActivity(intent);

    }
    public void VRbutton(View view)
    {
        Intent intent=new Intent(getApplicationContext(),ViewPlace2.class);
        startActivity(intent);

    }
}
