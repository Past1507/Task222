package com.example.task222;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;


public class PhotoActivity extends AppCompatActivity {
    private TextView txt;
    private int randNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        initActivity();
        randNum = new Random().nextInt(101);
        String text1 = getString(R.string.text,randNum);
        txt.setText(text1);
    }

    private void initActivity() {
        Button btnForward = findViewById(R.id.btnForward);
        txt = (TextView)findViewById(R.id.txt);

        btnForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(PhotoActivity.this,
                        PhotoActivity.class);
                startActivity(intent);
            }
        });

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}

