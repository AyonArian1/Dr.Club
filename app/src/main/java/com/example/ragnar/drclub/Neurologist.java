package com.example.ragnar.drclub;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Neurologist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neurologist);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
