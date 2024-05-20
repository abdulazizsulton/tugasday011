package com.example.tugasday011;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ImageButton ibHome = findViewById(R.id.ibHome2);
        ibHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        ImageButton ibUnggah = findViewById(R.id.ibUnggah2);
        ibUnggah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchActivity.this, UnggahActivity.class);
                startActivity(intent);
            }
        });

        ImageButton ibReels = findViewById(R.id.ibReelss2);
        ibReels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchActivity.this, ReelsActivity.class);
                startActivity(intent);
            }
        });

        ImageButton ibAkun = findViewById(R.id.ibProfil2);
        ibAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchActivity.this, AkunigActivity.class);
                startActivity(intent);
            }
        });
    }
}