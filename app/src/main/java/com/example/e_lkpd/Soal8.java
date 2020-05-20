package com.example.e_lkpd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Soal8 extends AppCompatActivity {

    private TextView txtSoal, txtSkor, numSoal, txtSoalBaris1, txtSoalBaris2, txtSoalBaris3, txtSoalBaris4, txtSoalBaris5;
    private Button submit;
    private String getScore;
    private CheckBox checkJasa1, checkBarang2, checkBarang3, checkJasa4, checkBarang5;
    private int skor;

    kumpulanSoal soal = new kumpulanSoal();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal8);

        txtSkor = (TextView)findViewById(R.id.skor);
        txtSoal = (TextView)findViewById(R.id.soalTable);
        numSoal = (TextView)findViewById(R.id.numSoal);
        submit = (Button)findViewById(R.id.btnSubmitTable);
        txtSoalBaris1 = (TextView) findViewById(R.id.soalBaris1);
        txtSoalBaris2 = (TextView) findViewById(R.id.soalBaris2);
        txtSoalBaris3 = (TextView) findViewById(R.id.soalBaris3);
        txtSoalBaris4 = (TextView) findViewById(R.id.soalBaris4);
        txtSoalBaris5 = (TextView) findViewById(R.id.soalBaris5);
        checkBarang2 = (CheckBox) findViewById(R.id.checkBarang2);
        checkBarang3 = (CheckBox) findViewById(R.id.checkBarang3);
        checkBarang5 = (CheckBox) findViewById(R.id.checkBarang5);
        checkJasa1 = (CheckBox) findViewById(R.id.checkJasa1);
        checkJasa4 = (CheckBox) findViewById(R.id.checkJasa4);

        getScore = getIntent().getExtras().getString("CurrentScore");
        skor = Integer.parseInt(getScore);
        txtSkor.setText(String.valueOf(skor));
        numSoal.setText("Soal 8");
        txtSoal.setText(soal.getSoal(7));

        txtSoalBaris1.setText(soal.getSoal8(0));
        txtSoalBaris2.setText(soal.getSoal8(1));
        txtSoalBaris3.setText(soal.getSoal8(2));
        txtSoalBaris4.setText(soal.getSoal8(3));
        txtSoalBaris5.setText(soal.getSoal8(4));

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cekJawabanTable();
                Intent i = new Intent(Soal8.this, Soal9.class);
                skor += 5;
                i.putExtra("CurrentScore", String.valueOf(skor));
                startActivity(i);
                finish();
            }
        });
    }

    public void cekJawabanTable(){
        int ygbenar = 0;
        if(checkJasa1.isChecked()){
            skor +=3;
            ygbenar +=1;
        }
        if(checkBarang2.isChecked()){
            skor +=3;
            ygbenar +=1;
        }
        if(checkBarang3.isChecked()){
            skor +=3;
            ygbenar +=1;
        }
        if(checkJasa4.isChecked()){
            skor +=3;
            ygbenar +=1;
        }
        if(checkBarang5.isChecked()){
            skor +=3;
            ygbenar +=1;
        }
        Toast.makeText(Soal8.this, "Benar "+ygbenar, Toast.LENGTH_SHORT).show();
    }

    public void onBackPressed(){
        Toast.makeText(this, "Selesaikan kuis", Toast.LENGTH_SHORT).show();
    }
}
