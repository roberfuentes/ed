package com.example.rober.projectclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class NormalCalculator extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_calculator);

    }

    public void goBackMenu(View v){
        startActivity(new Intent(NormalCalculator.this, MenuPrincipal.class));
    }

    public void btnPlusAction(View v){

        EditText fieldValue1 = (EditText)findViewById(R.id.fieldValue1);
        EditText fieldValue2 = (EditText)findViewById(R.id.fieldValue2);

        int fieldValue1Done = Integer.parseInt(fieldValue1.getText().toString());
        int fieldValue2Done = Integer.parseInt(fieldValue2.getText().toString());


        TextView viewResult = (TextView)findViewById(R.id.viewResult);
        int result = fieldValue1Done + fieldValue2Done;
        viewResult.setText(String.valueOf("Result: " + result));
    }

    public void btnMinusAction(View v){
        EditText fieldValue1 = (EditText)findViewById(R.id.fieldValue1);
        EditText fieldValue2 = (EditText)findViewById(R.id.fieldValue2);

        int fieldValue1Done = Integer.parseInt(fieldValue1.getText().toString());
        int fieldValue2Done = Integer.parseInt(fieldValue2.getText().toString());

        TextView viewResult = (TextView)findViewById(R.id.viewResult);
        int result = fieldValue1Done - fieldValue2Done;
        viewResult.setText(String.valueOf("Result: " + result));
    }

    public void btnProductAction(View v){
        EditText fieldValue1 = (EditText)findViewById(R.id.fieldValue1);
        EditText fieldValue2 = (EditText)findViewById(R.id.fieldValue2);

        int fieldValue1Done = Integer.parseInt(fieldValue1.getText().toString());
        int fieldValue2Done = Integer.parseInt(fieldValue2.getText().toString());

        TextView viewResult = (TextView)findViewById(R.id.viewResult);
        int result = fieldValue1Done * fieldValue2Done;
        viewResult.setText(String.valueOf("Result: " + result));
    }

    public void btnSlashAction(View v){
        EditText fieldValue1 = (EditText)findViewById(R.id.fieldValue1);
        EditText fieldValue2 = (EditText)findViewById(R.id.fieldValue2);

        int fieldValue1Done = Integer.parseInt(fieldValue1.getText().toString());
        int fieldValue2Done = Integer.parseInt(fieldValue2.getText().toString());

        TextView viewResult = (TextView)findViewById(R.id.viewResult);
        int result = fieldValue1Done / fieldValue2Done;
        viewResult.setText(String.valueOf("Result: " + result));
    }
}
