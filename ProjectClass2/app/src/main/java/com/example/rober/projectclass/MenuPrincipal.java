package com.example.rober.projectclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    public void goNormalCalculator(View v){
        startActivity(new Intent(MenuPrincipal.this, NormalCalculator.class));
    }

    public void goBOHCalculator(View v){
        startActivity(new Intent(MenuPrincipal.this, BOHCalculator.class));
    }
}
