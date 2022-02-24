package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText ET_Peso, ET_Altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ET_Peso = (EditText) findViewById(R.id.ET_Peso);
        ET_Altura = (EditText) findViewById(R.id.ET_Altura);
    }

    public void CalcularOnClick(View v) {
        try {
            double peso = Double.parseDouble(ET_Peso.getText().toString());
            double altura = Double.parseDouble(ET_Altura.getText().toString());

            Intent i = new Intent(this, MainActivity2.class);
            i.putExtra("peso", peso);
            i.putExtra("altura", altura);

            startActivity(i);
        } catch (Exception e) {
            Toast.makeText(this, "Error en el ingreso de datos", Toast.LENGTH_SHORT).show();
        }
    }

}