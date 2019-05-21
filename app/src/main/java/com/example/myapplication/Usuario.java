package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.R;

public class Usuario extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);


    }

    public void  Salir (View view){
        Intent salir = new Intent(Usuario.this, MainActivity.class);
        startActivity(salir);
    }

    public void  Registrarv (View view){
        Intent registrarv = new Intent(Usuario.this, Registrarv.class);
        startActivity(registrarv);
    }

    public void  Retirarv (View view){
        Intent retirarv = new Intent(Usuario.this, Retirarv.class);
        startActivity(retirarv);
    }

    public void  Buscarv (View view){
        Intent buscarv = new Intent(Usuario.this, Buscarv.class);
        startActivity(buscarv);
    }

}
