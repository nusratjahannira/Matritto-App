package com.myapp.pregnancyapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ViewPlace2 extends AppCompatActivity {
    public View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_place2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void SeaButton(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=jccctfkjoX0&list=PLhRsu2C962I6xo8EZ7uK-tkTdyBpQgc_Y"));
        startActivity(intent);


    }
    public void HillButton(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=z84WEcKzDH4&list=PLhRsu2C962I632y-EDVzER07jQGat5BIl"));

        startActivity(intent);

    }


}
