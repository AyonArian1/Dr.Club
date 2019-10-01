package com.example.ragnar.drclub;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.view.View;

public class Hospital extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        CardView mIbnsinaCard = (CardView) findViewById(R.id.first_card_view);
        mIbnsinaCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Hospital.this,Ibnsina.class));
            }
        });
        CardView mMagOsmaniCard = (CardView) findViewById(R.id.sec_card_view);
        mMagOsmaniCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Hospital.this,MagOsmani.class));
            }
        });
        CardView mMtadoraCard = (CardView) findViewById(R.id.third_card_view);
        mMtadoraCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Hospital.this,MtAdora.class));
            }
        });
        CardView mRagibCard = (CardView) findViewById(R.id.forth_card_view);
        mRagibCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Hospital.this,RagibRabeya.class));
            }
        });
    }
}
