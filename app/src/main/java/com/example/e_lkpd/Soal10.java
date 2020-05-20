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

public class Soal10 extends AppCompatActivity {

    private TextView txtSoal, txtSkor, numSoal;
    private Button submit;
    private EditText ans1_1, ans1_2, ans2_1, ans2_2, ans3_1, ans3_2, ans4_1, ans4_2, ans5_1, ans5_2, ans6_1, ans6_2;
    private  WebView video;
    private String getScore;
    private int skor;

    kumpulanSoal soal = new kumpulanSoal();
    contentAndAnswers CA = new contentAndAnswers();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal10);

        txtSkor = (TextView)findViewById(R.id.skor);
        txtSoal = (TextView)findViewById(R.id.soalTable);
        numSoal = (TextView)findViewById(R.id.numSoal);
        submit = (Button)findViewById(R.id.btnSubmit);
        ans1_1 = (EditText) findViewById(R.id.ans1_1);
        ans1_2 = (EditText) findViewById(R.id.ans1_2);
        ans2_1 = (EditText) findViewById(R.id.ans2_1);
        ans2_2 = (EditText) findViewById(R.id.ans2_2);
        ans3_1 = (EditText) findViewById(R.id.ans3_1);
        ans3_2 = (EditText) findViewById(R.id.ans3_2);
        ans4_1 = (EditText) findViewById(R.id.ans4_1);
        ans4_2 = (EditText) findViewById(R.id.ans4_2);
        ans5_1 = (EditText) findViewById(R.id.ans5_1);
        ans5_2 = (EditText) findViewById(R.id.ans5_2);
        ans6_1 = (EditText) findViewById(R.id.ans6_1);
        ans6_2 = (EditText) findViewById(R.id.ans6_2);
        video = (WebView) findViewById(R.id.video);

        CA.setVideo(video, soal.getLink(2));

        Bundle data = getIntent().getExtras();
        getScore = data.getString("CurrentScore");
        skor = Integer.parseInt(getScore);
        txtSkor.setText(String.valueOf(skor));
        numSoal.setText("Saol 10");
        txtSoal.setText(soal.getSoal(9));

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cekJawabanessay();
                Intent i = new Intent(Soal10.this, Soal11.class);
                skor += 5;
                i.putExtra("CurrentScore", String.valueOf(skor));
                startActivity(i);
                finish();
            }
        });
    }

    public void cekJawabanessay(){
        int ygbenar=0;
        if(ans1_1.getText().toString().equals(soal.getAnswers10(0))){
            skor += 2;
            ygbenar += 1;
        }
        if(ans1_2.getText().toString().equals(soal.getAnswers10(1))){
            skor += 2;
            ygbenar += 1;
        }
        if(ans2_1.getText().toString().equals(soal.getAnswers10(2))){
            skor += 2;
            ygbenar += 1;
        }
        if(ans2_2.getText().toString().equals(soal.getAnswers10(3))){
            skor += 2;
            ygbenar += 1;
        }
        if(ans3_1.getText().toString().equals(soal.getAnswers10(4))){
            skor += 2;
            ygbenar += 1;
        }
        if(ans3_2.getText().toString().equals(soal.getAnswers10(5))){
            skor += 2;
            ygbenar += 1;
        }
        if(ans4_1.getText().toString().equals(soal.getAnswers10(6))){
            skor += 2;
            ygbenar += 1;
        }
        if(ans4_2.getText().toString().equals(soal.getAnswers10(7))){
            skor += 2;
            ygbenar += 1;
        }
        if(ans5_1.getText().toString().equals(soal.getAnswers10(8))){
            skor += 2;
            ygbenar += 1;
        }
        if(ans5_2.getText().toString().equals(soal.getAnswers10(9))){
            skor += 2;
            ygbenar += 1;
        }
        if(ans6_1.getText().toString().equals(soal.getAnswers10(10))){
            skor += 2;
            ygbenar += 1;
        }
        if(ans6_2.getText().toString().equals(soal.getAnswers10(11))){
            skor += 2;
            ygbenar += 1;
        }
        Toast.makeText(Soal10.this, "Benar "+ygbenar, Toast.LENGTH_SHORT).show();
    }

    public void onBackPressed(){
        Toast.makeText(this, "Selesaikan kuis", Toast.LENGTH_SHORT).show();
    }
}
