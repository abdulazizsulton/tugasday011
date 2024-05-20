package com.example.tugasday011;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AkunigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akunig);

        ImageButton ibHome = findViewById(R.id.ibHome4);
        ibHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AkunigActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        ImageButton ibSearch = findViewById(R.id.ibSearch4);
        ibSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AkunigActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });

        ImageButton ibUnggah = findViewById(R.id.ibUnggah4);
        ibUnggah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AkunigActivity.this, UnggahActivity.class);
                startActivity(intent);
            }
        });

        ImageButton ibReels = findViewById(R.id.ibReelss4);
        ibReels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AkunigActivity.this, ReelsActivity.class);
                startActivity(intent);
            }
        });
    }
}