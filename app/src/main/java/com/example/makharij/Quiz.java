package com.example.makharij;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz extends AppCompatActivity {

    String[] answers = {"a", "a", "a", "a", "a"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    public void submit(View view) {



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