package com.weimont.fundamentosandoird;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    public int contador;

    TextView textoResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoResultado = findViewById(R.id.contadorTexto);

        contador = 0;


    }

    public void incrementaContador(View vista){
        contador++;
        textoResultado.setText(Integer.toString(contador));


    }

    public void restaContador(View vista){
        contador = contador -1;

        if(contador < 0){
            CheckBox negativos = findViewById(R.id.negativos);
            if(! negativos.isChecked()){
                contador = 0;
            }
        }

        textoResultado.setText(Integer.toString(contador));


    }

    public void resetearContador(View vista){
        EditText numero_reset = findViewById(R.id.n_reseteo);

       try {
           contador = Integer.parseInt(numero_reset.getText().toString());
        }catch (Exception e){
           contador = 0;

        }


        numero_reset.setText("");

        textoResultado.setText(Integer.toString(contador));



    }





}