package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
            String value = getIntent().getStringExtra("LA_CLAVE_QUE_YO_QUIERA");

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView3);
        textView.setText(value);
    }
}
