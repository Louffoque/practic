package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView question= findViewById(R.id.question);
        TextView question2= findViewById(R.id.question2);

        Bundle arguments = getIntent().getExtras();

        if(arguments!=null){
            String resul1 = arguments.get("resul1").toString();
            question.setText( resul1 );
        }
        if(arguments!=null){
            String resul2 = arguments.get("resul2").toString();
            question2.setText( resul2 );
        }




    }
}