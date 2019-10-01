package com.example.ragnar.drclub;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;

public class Department extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CardView gynoCardView = (CardView)findViewById(R.id.gyno_card_view);
        gynoCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Department.this,Gynecologist.class));
            }
        });

        CardView cardioCardView = (CardView)findViewById(R.id.cardio_card_view);
        cardioCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Department.this,Cardiologist.class));
            }
        });

        CardView neuroCardView = (CardView)findViewById(R.id.neuro_card_view);
        neuroCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Department.this,Neurologist.class));
            }
        });

        CardView ophtalCardView = (CardView)findViewById(R.id.ophtal_card_view);
        ophtalCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Department.this,Ophthalmologist.class));
            }
        });

        CardView gastroCardView = (CardView)findViewById(R.id.gastro_card_view);
        gastroCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Department.this,Gastroenterologist.class));
            }
        });
        CardView orthoCardView = (CardView)findViewById(R.id.ortho_card_view);
        orthoCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Department.this,Orthopedic.class));
            }
        });
    }
}
