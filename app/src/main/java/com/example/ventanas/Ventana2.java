package com.example.ventanas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ventana2 extends AppCompatActivity {
    private TextView textRegresar;
    private Button regresar;
    private Bundle datos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);
        textRegresar=(TextView) findViewById(R.id.regresar1);
        datos=getIntent().getExtras();//Contruye todos los datos y los pasas de ventana en ventana
        textRegresar.setText(datos.getString("nom"));

    }
    public void regresar(View view){

        finish();
    }
}