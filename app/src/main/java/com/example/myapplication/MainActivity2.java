package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView TxResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TxResultado = (TextView) findViewById(R.id.TV_Resultado);
        Intent i = getIntent();
        double altura = i.getDoubleExtra("altura",0);
        double peso = i.getDoubleExtra("peso",0);
        double IMC = (peso/Math.pow(altura,2));
        TxResultado.setText(String.valueOf(IMC));
    }
    public void volverOnClick(View v){
           super.onBackPressed();
    }
}