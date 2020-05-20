package com.example.e_lkpd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class hasilSkor extends AppCompatActivity {

    private TextView txtSkorHasil, txtComment;
    private Button btnUlangi, btnSelesai;
    private int skor, rangeNilai=70;
    private String getScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_skor);

        txtSkorHasil = (TextView)findViewById(R.id.txtSkorHasil);
        txtComment = (TextView)findViewById(R.id.txtComment);
        btnUlangi = (Button)findViewById(R.id.btnUlangi);
        btnSelesai = (Button)findViewById(R.id.btnSelesai);

        Bundle data = getIntent().getExtras();
        getScore = data.getString("CurrentScore");
        skor = Integer.parseInt(getScore);
        txtSkorHasil.setText(String.valueOf(skor));

        if(skor <= rangeNilai && skor >= 0){
            btnSelesai.setVisibility(View.INVISIBLE);
            txtComment.setText("Latihanmu belum mencapai");
        }else{
            btnSelesai.setVisibility(View.VISIBLE);
            txtComment.setText("Selamat Skormu sudah mencapai");
        }
        btnUlangi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent retry = new Intent(hasilSkor.this, Soal1.class);
                startActivity(retry);
                finish();
            }
        });

        btnSelesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent clear = new Intent(hasilSkor.this, MainActivity.class);
                startActivity(clear);
                finish();
            }
        });
    }

    public void onBackPressed(){
        Toast.makeText(this, "Pilih Opsi", Toast.LENGTH_SHORT).show();
    }
}
