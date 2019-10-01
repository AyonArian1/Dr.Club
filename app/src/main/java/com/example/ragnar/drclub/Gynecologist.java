package com.example.ragnar.drclub;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Gynecologist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gynecologist);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
