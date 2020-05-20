package com.example.e_lkpd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Soal12 extends AppCompatActivity {

    private TextView txtSoal, txtSkor, numSoal;
    private Button submit;
    private EditText inJawabanEssay;
    private  WebView video;
    private String jawaban, getScore;
    private int skor;

    kumpulanSoal soal = new kumpulanSoal();
    contentAndAnswers CA = new contentAndAnswers();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal12);

        txtSkor = (TextView)findViewById(R.id.skor);
        txtSoal = (TextView)findViewById(R.id.soal);
        numSoal = (TextView)findViewById(R.id.numSoal);
        inJawabanEssay = (EditText)findViewById(R.id.jawabanEssay);
        submit = (Button)findViewById(R.id.btnSubmit);
        video = (WebView) findViewById(R.id.video);

        CA.setVideo(video, soal.getLink(3));

        getScore = getIntent().getExtras().getString("CurrentScore");
        skor = Integer.parseInt(getScore);
        txtSkor.setText(String.valueOf(skor));
        numSoal.setText("Soal 12");
        txtSoal.setText(soal.getSoal(11));

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inJawabanEssay.getText().toString().isEmpty()){
                    Toast.makeText(Soal12.this, "Isi dulu jawaban", Toast.LENGTH_SHORT).show();
                }else{
                    Intent i = new Intent(Soal12.this, Soal13.class);
                    skor += 4;
                    Toast.makeText(Soal12.this, "Jawaban diterima", Toast.LENGTH_SHORT).show();
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
