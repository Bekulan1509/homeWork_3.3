package com.example.homework_33;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OperationActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
String op;
int val;
String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operation);
        textView = findViewById(R.id.textView);

        Intent intent = getIntent();
        if (intent!=null){
           text = intent.getStringExtra(MainActivity.KEY);
            textView.setText(text);
        }


        Button buttonDevide = findViewById(R.id.devide);
        Button buttonMultiply2 = findViewById(R.id.multiply2);
        Button buttonPlus = findViewById(R.id.plus);
        Button buttonMinus = findViewById(R.id.minus);

        buttonDevide.setOnClickListener(this);
        buttonMultiply2.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.devide:
             val =Integer.parseInt(text);
                textView.append("/");
                
                break;
        }
    }
}
