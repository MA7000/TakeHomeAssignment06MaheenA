package com.example.schooner.takehomeassignment06_maheena;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView one = (TextView) findViewById(R.id.receipt);
        Intent intent = getIntent();
        String message = intent.getStringExtra(Key.STRING);
        one.setText(message);

    }
}
