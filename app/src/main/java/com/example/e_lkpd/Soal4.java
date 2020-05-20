package com.example.e_lkpd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Soal4 extends AppCompatActivity {

    private TextView txtSoal4, txtSkor, numSoal, tokoh;
    private Button submit;
    private String getScore;
    private CheckBox pil1, pil2, pil3, pil4, pil5, pil6;
    private int skor, arr, x;
    private WebView video;

    kumpulanSoal soal = new kumpulanSoal();
    contentAndAnswers CA = new contentAndAnswers();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal4);

        txtSkor = (TextView)findViewById(R.id.skor);
        txtSoal4 = (TextView)findViewById(R.id.soal4);
        numSoal = (TextView)findViewById(R.id.numSoal);
        submit = (Button)findViewById(R.id.btnSubmit);
        tokoh = (TextView)findViewById(R.id.tokoh);
        pil1 = (CheckBox) findViewById(R.id.pil1);
        pil2 = (CheckBox) findViewById(R.id.pil2);
        pil3 = (CheckBox) findViewById(R.id.pil3);
        pil4 = (CheckBox) findViewById(R.id.pil4);
        pil5 = (CheckBox) findViewById(R.id.pil5);
        pil6 = (CheckBox) findViewById(R.id.pil6);
        video = (WebView) findViewById(R.id.video);

        CA.setVideo(video, soal.getLink(5));
        Bundle data = getIntent().getExtras();
        getScore = data.getString("CurrentScore");
        skor = Integer.parseInt(getScore);
        txtSkor.setText(String.valueOf(skor));

        numSoal.setText("Soal 4");
        txtSoal4.setText(soal.getSoal(3));

        content();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cekJawaban();
            }
        });
    }

    public void content(){

        arr = soal.tokoh.length;
        if (x >= arr){
            Intent i = new Intent(Soal4.this, Soal5.class);
            i.putExtra("CurrentScore", String.valueOf(skor));
            startActivity(i);
            finish();
        }else{
            tokoh.setText(soal.getTokoh(x));
            txtSkor.setText(String.valueOf(skor));
        }
        x++;
    }

    public void cekJawaban(){
        if(tokoh.getText().toString().equals(soal.getTokoh(0))){
            lihatCheck(pil2, pil4, pil6);
        }
        else if(tokoh.getText().toString().equals(soal.getTokoh(1))){
            lihatCheck(pil1, pil3, pil5);
        }
    }

    public void lihatCheck(CheckBox cb1, CheckBox cb2, CheckBox cb3){
        int ygbenar = 0;
        if(cb1.isChecked()){
            skor += 2;
            ygbenar +=1;
        }
        if(cb2.isChecked()){
            skor += 2;
            ygbenar +=1;
        }
        if(cb3.isChecked()){
            skor += 2;
            ygbenar +=1;
        }
        Toast.makeText(Soal4.this, "Benar "+ygbenar, Toast.LENGTH_SHORT).show();
        clear();
        content();
    }

    public void clear(){
        pil1.setChecked(false);
        pil2.setChecked(false);
        pil3.setChecked(false);
        pil4.setChecked(false);
        pil5.setChecked(false);
        pil6.setChecked(false);

    }

    public void onBackPressed(){
        Toast.makeText(this, "Selesaikan kuis", Toast.LENGTH_SHORT).show();
    }
}
