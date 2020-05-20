package com.example.e_lkpd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Soal5 extends AppCompatActivity {

    private TextView txtSoal, txtSkor, numSoal;
    private RadioGroup pilihanJawaban;
    private RadioButton jawaban1, jawaban2, jawaban3, jawaban4;
    private Button submit;
    private  WebView video;
    private String jawaban, getScore;
    private int skor;

    kumpulanSoal soal = new kumpulanSoal();
    contentAndAnswers CA = new contentAndAnswers();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal5);

        txtSoal = (TextView)findViewById(R.id.soal);
        txtSkor = (TextView)findViewById(R.id.skor);
        numSoal = (TextView)findViewById(R.id.numSoal);
        pilihanJawaban = (RadioGroup)findViewById(R.id.pilihanJawaban);
        jawaban1 = (RadioButton)findViewById(R.id.jawaban1);
        jawaban2 = (RadioButton)findViewById(R.id.jawaban2);
        jawaban3 = (RadioButton)findViewById(R.id.jawaban3);
        jawaban4 = (RadioButton)findViewById(R.id.jawaban4);
        submit = (Button)findViewById(R.id.btnSubmit);
        video = (WebView) findViewById(R.id.video);

        CA.setVideo(video, soal.getLink(1));

        Bundle data = getIntent().getExtras();
        getScore = data.getString("CurrentScore");
        skor = Integer.parseInt(getScore);
        txtSkor.setText(String.valueOf(skor));
        CA.setContent(4, numSoal, txtSoal, pilihanJawaban, jawaban1, jawaban2, jawaban3, jawaban4);
        jawaban = soal.getJawabanBenar(4);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!jawaban1.isChecked() && !jawaban2.isChecked() && !jawaban3.isChecked() && !jawaban4.isChecked()){
                    Toast.makeText(Soal5.this, "Silahkan pilih jawaban dulu!", Toast.LENGTH_SHORT).show();
                }else{
                    CA.cekJawaban(Soal5.this, jawaban, jawaban1, jawaban2, jawaban3, jawaban4);
                    Intent i = new Intent(Soal5.this, Soal6.class);
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
