package com.example.ragnar.drclub;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Gastroenterologist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastroenterologist);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
