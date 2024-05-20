package com.example.tugasday011;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ReelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reels);

        ImageButton ibHome = findViewById(R.id.ibHome3);
        ibHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReelsActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        ImageButton ibSearch = findViewById(R.id.ibSearch3);
        ibSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReelsActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });

        ImageButton ibUnggah = findViewById(R.id.ibUnggah3);
        ibUnggah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReelsActivity.this, UnggahActivity.class);
                startActivity(intent);
            }
        });

        ImageButton ibAkun = findViewById(R.id.ibProfil3);
        ibAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReelsActivity.this, AkunigActivity.class);
                startActivity(intent);
            }
        });
    }
}