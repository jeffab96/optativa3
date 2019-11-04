package com.optativa.optativa3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
String n1 = "jeff";
String c1="jeff1";
String n2 = "fab";
String c2 = "fab1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void siguiente(View view){
        if(n1.equals("w")){
            Intent siguiente = new Intent(this, Opciones.class);
            startActivity(siguiente);
        }

    }


}
