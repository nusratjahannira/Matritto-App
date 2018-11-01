package com.myapp.pregnancyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FeedbackActivity extends AppCompatActivity implements View.OnClickListener {
    private Button sendButton, clearButton;
    private EditText name_et, feedback_et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        sendButton = findViewById(R.id.sendId);
        clearButton = findViewById(R.id.clearId);

        name_et = findViewById(R.id.nameId);
        feedback_et = findViewById(R.id.FeedbacksendId);

        sendButton.setOnClickListener(this);
        clearButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        try {

            String name = name_et.getText().toString();
            String feedback = feedback_et.getText().toString();
            if (v.getId() == R.id.sendId) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");

                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"musfika.ananna2015@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback from app");

                intent.putExtra(Intent.EXTRA_TEXT, "Name : " + name + "\n Feedback :" + feedback);
                startActivity(Intent.createChooser(intent, "Feedback with"));

            } else if (v.getId() == R.id.clearId) {
                name_et.setText("");
                feedback_et.setText("");

            }
            if (v.getId() == R.id.FeedbacksendId) {

            }
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(),"Exception :"+e ,Toast.LENGTH_SHORT).show();

        }
    }
}
