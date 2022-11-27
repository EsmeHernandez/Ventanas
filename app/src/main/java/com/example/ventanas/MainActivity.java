package com.example.ventanas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView saludo;
    private EditText nombres;
    private Button OK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombres=(EditText)findViewById(R.id.nombre);

    }
    public void cambio(View view){
        Intent i=new Intent(this,Ventana2.class);
        i.putExtra("nom",nombres.getText().toString());

        startActivity(i);//correr la ventana con 'i' objeto que se construyo
    }
}