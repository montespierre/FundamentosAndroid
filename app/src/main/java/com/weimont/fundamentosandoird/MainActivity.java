package com.weimont.fundamentosandoird;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //btn1 = (Button) findViewById(R.id.btnClaseAnonima);

        btn2 = (Button) findViewById(R.id.btnImplements);
        btn2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "Desde el implements", Toast.LENGTH_LONG).show();

    }
}