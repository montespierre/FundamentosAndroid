package com.weimont.fundamentosandoird;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //btn1 = (Button) findViewById(R.id.btnClaseAnonima);

       // btn2 = (Button) findViewById(R.id.btnImplements);
        // btn2.setOnClickListener(this);



    }

    public void eventoBoton(View view) {
        Toast.makeText(getApplicationContext(), "Desde el XML", Toast.LENGTH_LONG).show();
    }
}