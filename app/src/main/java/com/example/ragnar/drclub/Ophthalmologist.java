package com.example.ragnar.drclub;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Ophthalmologist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ophthalmologist);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
