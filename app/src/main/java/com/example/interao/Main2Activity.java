package com.example.interao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String Curso = intent.getStringExtra(MainActivity.EXTRA_TEXT);

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(Curso);

    }
}
