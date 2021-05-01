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

        btn1 = (Button) findViewById(R.id.btnClaseAnonima);
        btn2 = (Button) findViewById(R.id.btnImplements);

        btn2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId() == btn2.getId()){
            Toast.makeText(getApplicationContext(), "Desde el implements", Toast.LENGTH_LONG).show();
        }

        if(v.getId() == R.id.btnXml){
            Toast.makeText(getApplicationContext(), "Desde el xml", Toast.LENGTH_LONG).show();
        }

        if(v.getId() == R.id.btnClaseAnonima){
            Toast.makeText(getApplicationContext(), "Desde clase anonima", Toast.LENGTH_LONG).show();
        }


    }
}