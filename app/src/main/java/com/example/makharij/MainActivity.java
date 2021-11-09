package com.example.makharij;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void learning(View view) {
        Intent fp=new Intent(getApplicationContext(),ResultScreen.class);
        startActivity(fp);
    }

    public void quiz(View view) {
        Intent fp=new Intent(getApplicationContext(),ResultScreen.class);
        startActivity(fp);
    }

    public void repo(View view) {

    }
}