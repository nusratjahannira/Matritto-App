package com.myapp.pregnancyapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button prepregnancyButton,doctorSuggestionButton,foodValueButton,babyGrowthButton,
            medicineAlarmButton,spaceButton;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        prepregnancyButton = ( Button ) findViewById(R.id.pre_pregnancyId);
        doctorSuggestionButton = ( Button ) findViewById(R.id.doctor_suggestId);
        foodValueButton = ( Button ) findViewById(R.id.food_valueId);
        babyGrowthButton = ( Button ) findViewById(R.id.baby_growthId);
        medicineAlarmButton = ( Button ) findViewById(R.id.medicine_alarmId);
        spaceButton =(Button) findViewById(R.id.spaceId);

        prepregnancyButton.setOnClickListener(this);
       // doctorSuggestionButton.setOnClickListener(this);
        foodValueButton.setOnClickListener(this);
        babyGrowthButton.setOnClickListener(this);
        medicineAlarmButton.setOnClickListener(this);
        spaceButton.setOnClickListener(this);
//        doctorSuggestionButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(),DrsSuggestn.class);
//                startActivity(intent);
//                }
//        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.navigation_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.shareId){
            Intent intent =new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String subject = "Pregnancy Related App";
            String body = "This app is very helpful.Any pregnant women can use this .\n com.myapp.pregnancyapp";
            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,body);

            startActivity(Intent.createChooser(intent,"share with"));

        }
        if (item.getItemId() == R.id.feedbackId){
            Intent intent = new Intent(getApplicationContext(),FeedbackActivity.class);
            startActivity(intent);
        }
        if (item.getItemId() == R.id.AboutusId){
            Intent intent = new Intent(getApplicationContext(),AboutActivity.class);
            startActivity(intent);
        }
        if (item.getItemId() == R.id.homeId){
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {


        if (v.getId()== R.id.pre_pregnancyId){
            intent = new Intent(MainActivity.this,DatePredict.class);
            intent.putExtra("name","prepregnancy");
            startActivity(intent);

        }

        if (v.getId()== R.id.food_valueId){
            intent = new Intent(MainActivity.this,FoodActivity.class);
            intent.putExtra("name","food");
            startActivity(intent);

        }if (v.getId()== R.id.baby_growthId){
            intent = new Intent(MainActivity.this,BabyGrowth.class);
            intent.putExtra("name","baby");
            startActivity(intent);

        }if (v.getId()== R.id.medicine_alarmId){
            intent = new Intent(MainActivity.this,AlarmActivity.class);
            intent.putExtra("name","alarm");
            startActivity(intent);

        }if (v.getId()== R.id.spaceId) {
            intent = new Intent(MainActivity.this, LikesActivity.class);
            intent.putExtra("name", "space");
            startActivity(intent);
        }



    }
    public void Suggest (View v)
    {
        Intent intent = new Intent(getApplicationContext(),DrsSuggestn2.class);
                startActivity(intent);

    }

}
