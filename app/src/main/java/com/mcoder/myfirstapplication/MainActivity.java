package com.mcoder.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TV;
    Button BTN1 , BTN2,BTN3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TV = findViewById(R.id.textview);
        BTN1 = findViewById(R.id.btn_1);
        BTN2 = findViewById(R.id.btn_2);
        BTN3 = findViewById(R.id.btn_3);

        BTN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Click State

                TV.setText("Button 1 is clicked");



            }
        });

        BTN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TV.setText(getString(R.string.btn2_click));
            }
        });

        BTN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TV.setText("Button 3 is Clicked");
            }
        });

    }
}