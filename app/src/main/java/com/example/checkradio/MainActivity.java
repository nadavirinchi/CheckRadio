package com.example.checkradio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    CheckBox checkBox5;
    CheckBox checkBox6;
    CheckBox checkBox7;
    CheckBox checkBox8;

    SeekBar seekBar;
    RatingBar ratingBar;

    RadioGroup radioGroup;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox1 = findViewById(R.id.chkbx1);
        checkBox2 = findViewById(R.id.chkbx2);
        checkBox3 = findViewById(R.id.chkbx3);
        checkBox4 = findViewById(R.id.chkbx4);
        checkBox5 = findViewById(R.id.chkbx5);
        checkBox6 = findViewById(R.id.chkbx6);
        checkBox7 = findViewById(R.id.chkbx7);
        checkBox8 = findViewById(R.id.chkbx8);
        seekBar = findViewById(R.id.seekbar);
        ratingBar = findViewById(R.id.ratingbar);
        radioGroup = findViewById(R.id.radiogrp);
        radioButton1 = findViewById(R.id.radiobtn1);
        radioButton2 = findViewById(R.id.radiobtn2);
        radioButton3 = findViewById(R.id.radiobtn3);

        checkBox1.setOnCheckedChangeListener(MainActivity.this);
        checkBox2.setOnCheckedChangeListener(MainActivity.this);
        checkBox3.setOnCheckedChangeListener(MainActivity.this);
        checkBox4.setOnCheckedChangeListener(MainActivity.this);
        checkBox5.setOnCheckedChangeListener(MainActivity.this);
        checkBox6.setOnCheckedChangeListener(MainActivity.this);
        checkBox7.setOnCheckedChangeListener(MainActivity.this);
        checkBox8.setOnCheckedChangeListener(MainActivity.this);



    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        
    }
}