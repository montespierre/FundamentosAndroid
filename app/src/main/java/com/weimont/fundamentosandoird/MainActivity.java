package com.weimont.fundamentosandoird;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

    public int contador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;


    }

    public void incrementaContador(View vista){
        contador++;
        mostrarResultado();

    }

    public void restaContador(View vista){
        contador --;
        mostrarResultado();

    }

    public void resetearContador(View vista){
        contador = 0;
        mostrarResultado();


    }

    public void mostrarResultado(){
        TextView tvContadorPulsaciones;

        // vincual el codigo en java del TV a TV de layout
        tvContadorPulsaciones = findViewById(R.id.contadorTexto);
        tvContadorPulsaciones.setText(Integer.toString(contador));

    }
}