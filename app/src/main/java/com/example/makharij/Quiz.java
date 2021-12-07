package com.example.makharij;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Quiz extends AppCompatActivity {

    String[] answers = {"", "", "", "", ""};
    int[] questionsNumbers = {-1, -1, -1, -1, -1};
    TextView txt1;
    TextView txt2;
    TextView txt3;
    TextView txt4;
    TextView txt5;

    String[][] data = {
            {"أ ہ","Halqiyah"},
            {"ع ح", "Halqiyah"},
            {"غ خ", "Halqiyah"},
            {"ق", "Lahatiyah"},
            {"ک", "Lahatiyah"},
            {"ج ش ى", "Shajariyah-Haafiyah"},
            {"ض", "Shajariyah-Haafiyah"},
            {"ل", "Tarfiyah"},
            {"ن", "Tarfiyah"},
            {"ر", "Tarfiyah"},
    };

    public int returnRandomInt(){

        Random rand = new Random();

        boolean found = true;
        int searchedValue = -1;

        while (found){
            searchedValue = rand.nextInt(10);
            for(int x : questionsNumbers){
                if(x == searchedValue){
                    found = false;
                    break;
                }
            }
            if(found == true)
                break;
            else
                found = true;
        }

        return searchedValue;
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String question = " these arabic words are: ";

        txt1 = findViewById(R.id.question1);
        txt2 = findViewById(R.id.question2);
        txt3 = findViewById(R.id.question3);
        txt4 = findViewById(R.id.question4);
        txt5 = findViewById(R.id.question5);

        int temp;

        temp = returnRandomInt();
        questionsNumbers[0] = temp;
        txt1.setText(data[temp][0] + question);

        temp = returnRandomInt();
        questionsNumbers[1] = temp;
        txt2.setText(data[temp][0] + question);

        temp = returnRandomInt();
        questionsNumbers[2] = temp;
        txt3.setText(data[temp][0] + question);

        temp = returnRandomInt();
        questionsNumbers[3] = temp;
        txt4.setText(data[temp][0] + question);

        temp = returnRandomInt();
        questionsNumbers[4] = temp;
        txt5.setText(data[temp][0] + question);

    }

    public void submit(View view) {

        int score=0;
        String temp = "";
        for(int i=0; i<5; i++) {
            temp = data[questionsNumbers[i]][1];
            if (answers[i].equals(temp))
                score++;
        }

        // starting background task to update product
        Intent intent=new Intent(Quiz.this, ResultScreen.class);
        intent.putExtra("value", String.valueOf(score));  // removes this line make no exception :(
        startActivity(intent);

    }

    public void group1(View view) {

        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        RadioButton button = findViewById(view.getId());

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton11:
                if (checked)
                    answers[0] =  String.valueOf(button.getText());
                    break;
            case R.id.radioButton12:
                if (checked)
                    answers[0] =  String.valueOf(button.getText());

                    break;
            case R.id.radioButton13:
                if (checked)
                    answers[0] =  String.valueOf(button.getText());

                    break;
            case R.id.radioButton14:
                if (checked)
                    answers[0] =  String.valueOf(button.getText());

                break;
        }
    }

    public void group2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        RadioButton button = findViewById(view.getId());

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton21:
                if (checked)
                    answers[1] =  String.valueOf(button.getText());
                    break;
            case R.id.radioButton22:
                if (checked)
                    answers[1] =  String.valueOf(button.getText());

                    break;
            case R.id.radioButton23:
                if (checked)
                    answers[1] =  String.valueOf(button.getText());

                    break;
            case R.id.radioButton24:
                if (checked)
                    answers[1] =  String.valueOf(button.getText());

                    break;
        }
    }

    public void group3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        RadioButton button = findViewById(view.getId());

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton31:
                if (checked)
                    answers[2] =  String.valueOf(button.getText());

                    break;
            case R.id.radioButton32:
                if (checked)
                    answers[2] =  String.valueOf(button.getText());

                    break;
            case R.id.radioButton33:
                if (checked)
                    answers[2] =  String.valueOf(button.getText());

                    break;

            case R.id.radioButton34:
                if (checked)
                    answers[2] =  String.valueOf(button.getText());

                    break;
        }
    }

    public void group4(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        RadioButton button = findViewById(view.getId());

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton41:
                if (checked)
                    answers[3] =  String.valueOf(button.getText());

                    break;
            case R.id.radioButton42:
                if (checked)
                    answers[3] =  String.valueOf(button.getText());

                    break;
            case R.id.radioButton43:
                if (checked)
                    answers[3] =  String.valueOf(button.getText());

                    break;
            case R.id.radioButton44:
                if (checked)
                    answers[3] =  String.valueOf(button.getText());

                    break;
        }
    }
    public void group5(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        RadioButton button = findViewById(view.getId());

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton51:
                if (checked)
                    answers[4] =  String.valueOf(button.getText());

                    break;
            case R.id.radioButton52:
                if (checked)
                    answers[4] =  String.valueOf(button.getText());

                    break;
            case R.id.radioButton53:
                if (checked)
                    answers[4] =  String.valueOf(button.getText());

                    break;
            case R.id.radioButton54:
                if (checked)
                    answers[4] =  String.valueOf(button.getText());

                    break;
        }
    }
}