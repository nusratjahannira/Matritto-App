package com.myapp.pregnancyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    private EditText nametext,passwordtext;
    private Button butn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nametext = (EditText) findViewById(R.id.usernameId);
        passwordtext =(EditText) findViewById(R.id.passwordId);
        butn = (Button) findViewById( R.id.login_btn_Id);
        butn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=nametext.getText().toString();
                String password = passwordtext.getText().toString();
                if (name.equals("Admin") && password.equals("12345")){
                    Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);

                }

            }
        });

    }
}
