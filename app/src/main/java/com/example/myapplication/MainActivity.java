package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void oNClick(View view) {
        EditText resul1 = findViewById(R.id.resulnumber1);
        String Resul1 = resul1.getText().toString();
        EditText resul2 = findViewById(R.id.resulNumber2);
        String Resul2 = resul1.getText().toString();
        Intent intent = new Intent(this, Main.class);

        intent.putExtra("resul1", Resul1);
        intent.putExtra("resul2", Resul2);
        startActivity(intent);
        Snackbar.make(view, "Ответы сохранены!", Snackbar.LENGTH_LONG)
                .show();


    }


}