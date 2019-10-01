package com.example.ragnar.drclub;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Cardiologist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardiologist);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
