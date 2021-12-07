package com.example.makharij;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent intent;
        switch (item.getItemId()) {
            case R.id.learn:
                 intent = new Intent(this, Learning.class);
                startActivity(intent);
            case R.id.quiz:
                 intent = new Intent(this, Quiz.class);
                startActivity(intent);
            default:

                return super.onOptionsItemSelected(item);
        }
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