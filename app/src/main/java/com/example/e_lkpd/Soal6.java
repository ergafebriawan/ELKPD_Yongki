package com.example.e_lkpd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Soal6 extends AppCompatActivity {

    private TextView txtSoal, txtSkor, numSoal;
    private RadioGroup pilihanJawaban;
    private RadioButton jawaban1, jawaban2, jawaban3, jawaban4;
    private Button submit;
    private String jawaban, getScore;
    private int skor;

    kumpulanSoal soal = new kumpulanSoal();
    contentAndAnswers CA = new contentAndAnswers();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal6);

        txtSoal = (TextView)findViewById(R.id.soal);
        txtSkor = (TextView)findViewById(R.id.skor);
        numSoal = (TextView)findViewById(R.id.numSoal);
        pilihanJawaban = (RadioGroup)findViewById(R.id.pilihanJawaban);
        jawaban1 = (RadioButton)findViewById(R.id.jawaban1);
        jawaban2 = (RadioButton)findViewById(R.id.jawaban2);
        jawaban3 = (RadioButton)findViewById(R.id.jawaban3);
        jawaban4 = (RadioButton)findViewById(R.id.jawaban4);
        submit = (Button)findViewById(R.id.btnSubmit);

        Bundle data = getIntent().getExtras();
        getScore = data.getString("CurrentScore");
        skor = Integer.parseInt(getScore);
        txtSkor.setText(String.valueOf(skor));
        CA.setContent(5, numSoal, txtSoal, pilihanJawaban, jawaban1, jawaban2, jawaban3, jawaban4);
        jawaban = soal.getJawabanBenar(5);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!jawaban1.isChecked() && !jawaban2.isChecked() && !jawaban3.isChecked() && !jawaban4.isChecked()){
                    Toast.makeText(Soal6.this, "Silahkan pilih jawaban dulu!", Toast.LENGTH_SHORT).show();
                }else{
                    CA.cekJawaban(Soal6.this, jawaban, jawaban1, jawaban2, jawaban3, jawaban4);
                    Intent i = new Intent(Soal6.this, Soal7.class);
                    skor += CA.hslSkor();
                    i.putExtra("CurrentScore", String.valueOf(skor));
                    startActivity(i);
                    finish();
                }
            }
        });
    }


    public void onBackPressed(){
        Toast.makeText(this, "Selesaikan kuis", Toast.LENGTH_SHORT).show();
    }
}
