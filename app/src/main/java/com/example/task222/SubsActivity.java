package com.example.task222;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SubsActivity extends AppCompatActivity {

    private EditText inputUserEdText;
    private EditText inputEmailEdText;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subs);
        inputUserEdText= (EditText)findViewById(R.id.inputUserText);
        inputEmailEdText= (EditText)findViewById(R.id.inputEmailText);
        resultText = (TextView)findViewById(R.id.resultText);
    }

    public void clickOnBtnOk (View btnOk) {
        String userName = inputUserEdText.getText().toString();
        String mailTitle = inputEmailEdText.getText().toString();
        resultText.setText(getString(R.string.subText, userName, mailTitle));
    }

    public void clickOnBtnClear (View btnOk) {
        inputUserEdText.setText("");
        inputEmailEdText.setText("");
        resultText.setText("");
    }
}
