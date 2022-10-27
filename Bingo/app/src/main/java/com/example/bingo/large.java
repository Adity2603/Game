package com.example.bingo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class large extends AppCompatActivity {

    TextView number;
    Button generate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_large);
        getSupportActionBar().hide();

        number = findViewById(R.id.number);
        generate = findViewById(R.id.generate);

        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int val = random.nextInt(1000);
                number.setText(Integer.toString(val));
            }
        });

    }
}