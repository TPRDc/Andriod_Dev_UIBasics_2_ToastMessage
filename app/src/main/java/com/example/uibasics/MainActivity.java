package com.example.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnHello) {
            //Toast message
            Toast.makeText(this, "Hello Button Clicked", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello =findViewById(R.id.btnHello);
        btnHello.setOnClickListener(this);
    }
}