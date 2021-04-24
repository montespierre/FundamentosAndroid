package com.weimont.fundamentosandoird;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Context: Es una clase que pide resolucion de preferencia de la aplicaion y de pantalla
        // This le pasa la propia clase donde nos encontramos
        TextView miTexto = new TextView(this);

        // Establecer el texto
        miTexto.setText("Mi primera aplicacion");

        // Que vista va a vizualizar la actividad
        setContentView(miTexto);
    }
}