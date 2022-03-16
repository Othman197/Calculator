package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText a1 = findViewById(R.id.a1);
        EditText a2 = findViewById(R.id.a2);
        TextView a3 = findViewById(R.id.a3);
        Button a4 = findViewById(R.id.a4);

        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(a1.getText().toString());
                int b = Integer.parseInt(a2.getText().toString());

                int c = a+b;
               a3.setText(c+"");
            }
        });

    }
}