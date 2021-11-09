package com.example.makharij;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void learning(View view) {
        Intent fp=new Intent(getApplicationContext(),Learning.class);
        startActivity(fp);
    }

    public void quiz(View view) {
        Intent fp=new Intent(getApplicationContext(),Quiz.class);
        startActivity(fp);
    }

    public void repo(View view) {
        String url = "https://github.com/adeelsaleem-se/Makharij";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}