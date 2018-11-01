package com.myapp.pregnancyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.myapp.pregnancyapp.R.id.image_viewId;

public class InfoActivity extends AppCompatActivity {
    private ImageView imageview ;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        imageview = (ImageView) findViewById(R.id.image_viewId);
        textView =(TextView) findViewById(R.id.textId);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            String pregnancy = bundle.getString("name");
            showDetails(pregnancy);
        }

    }
    void showDetails(String pregnancy){
        if (pregnancy.equals("prepregnancy")){
            imageview.setImageResource(R.drawable.awarness);
            textView.setText(R.string.awareness_text);
        }if (pregnancy.equals("doctors_suggestion")){
            imageview.setImageResource(R.drawable.awarness);
            textView.setText(R.string.awareness_text);
        }if (pregnancy.equals("food")){
            imageview.setImageResource(R.drawable.food);
            textView.setText(R.string.food_text);
        }if (pregnancy.equals("baby")){
            imageview.setImageResource(R.drawable.awarness);
            textView.setText(R.string.awareness_text);
        }if (pregnancy.equals("alarm")){
            imageview.setImageResource(R.drawable.awarness);
            textView.setText(R.string.awareness_text);
        }if (pregnancy.equals("space")){
            imageview.setImageResource(R.drawable.awarness);
            textView.setText(R.string.awareness_text);
        }

    }

}