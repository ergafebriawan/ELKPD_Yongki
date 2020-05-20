package com.example.e_lkpd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private LinearLayout btnMulai, btnProfile, btnKD, btnPetunjuk, btnKeluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMulai = (LinearLayout) findViewById(R.id.btnMulai);
        btnProfile = (LinearLayout) findViewById(R.id.btnProfile);
        btnKD = (LinearLayout) findViewById(R.id.btnKD);
        btnPetunjuk = (LinearLayout) findViewById(R.id.btnPetunjuk);
        btnKeluar = (LinearLayout) findViewById(R.id.btnKeluar);

        btnMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iMulai = new Intent(MainActivity.this, Soal1.class);
                Toast.makeText(MainActivity.this, "Soal Dimulai", Toast.LENGTH_SHORT).show();
                startActivity(iMulai);
                finish();
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Profile.class);
                startActivity(i);

            }
        });

        btnKD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iKD = new Intent(MainActivity.this, KIKD.class);
                startActivity(iKD);
            }
        });

        btnPetunjuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iPetunjuk = new Intent(MainActivity.this, Petunjuk.class);
                startActivity(iPetunjuk);
            }
        });

        btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }
}
