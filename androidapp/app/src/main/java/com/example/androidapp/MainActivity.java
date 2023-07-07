package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void send(View view){
        Toast.makeText(this, "sending your data", Toast.LENGTH_SHORT).show();
    }
    public void receive(View view){
        Toast.makeText(this, "receiving your data", Toast.LENGTH_SHORT).show();
    }
    public void delete(View view){
        Toast.makeText(this, "deleting your data", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}