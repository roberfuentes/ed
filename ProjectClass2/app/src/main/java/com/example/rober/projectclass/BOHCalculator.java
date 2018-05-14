package com.example.rober.projectclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class BOHCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bohcalculator);

        Spinner dropdownList = (Spinner)findViewById(R.id.dropdownList);
        ArrayAdapter<String> myList = new ArrayAdapter<>(BOHCalculator.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myList.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdownList.setAdapter(myList);


    }

    public void goBackMenu(View v){
        startActivity(new Intent(BOHCalculator.this, MenuPrincipal.class));
    }


    public void showResult(View v){
        TextView labelResult = (TextView)findViewById(R.id.labelResult);
        Spinner dropdownList = (Spinner)findViewById((R.id.dropdownList));
        EditText fieldValue = (EditText)findViewById(R.id.fieldValue);
        String value = fieldValue.getText().toString();
        int fieldValueDone = Integer.parseInt(value);

        if(dropdownList.getSelectedItem().equals("Binary")){

            labelResult.setText("The user value " + fieldValue.getText() + " to binary is " + Integer.toBinaryString(fieldValueDone));

        }
        if(dropdownList.getSelectedItem().equals("Octal")){

            labelResult.setText("The user value " + fieldValue.getText() + "to octal is " + Integer.toOctalString(fieldValueDone));
        }
        if(dropdownList.getSelectedItem().equals("Hexadecimal")){

            labelResult.setText("The user value " + fieldValue.getText() + "to hexadecimal is " + Integer.toHexString(fieldValueDone));
        }else if(dropdownList.getSelectedItem().equals("All")){
            labelResult.setText("The user value " + fieldValue.getText() + " to binary is " + Integer.toBinaryString(fieldValueDone) + "\n" + "The user value " + fieldValue.getText() + " to octal is " + Integer.toOctalString(fieldValueDone) + "\n" + "The user value " + fieldValue.getText() + " to hexadecimal is " + Integer.toHexString(fieldValueDone));
        }



    }

}
