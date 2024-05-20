package com.example.tugasday011;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton ibSearch = findViewById(R.id.ibSearch);
        ibSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });

        ImageButton ibUnggah = findViewById(R.id.ibUnggah);
        ibUnggah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, UnggahActivity.class);
                startActivity(intent);
            }
        });

        ImageButton ibReels = findViewById(R.id.ibReelss);
        ibReels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ReelsActivity.class);
                startActivity(intent);
            }
        });

        ImageButton ibAkun = findViewById(R.id.ibProfil);
        ibAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AkunigActivity.class);
                startActivity(intent);
            }
        });
    }
}