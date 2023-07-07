package com.py.mycafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class orderplaced extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderplaced);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.msg);

        TextView textView = findViewById(R.id.textView4);
        textView.setText(message);



    }
}