package com.example.e_lkpd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class KIKD extends AppCompatActivity {

    TableLayout tableKD;

    kumpulanSoal soal = new kumpulanSoal();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k_i_k_d);
        tableKD = (TableLayout)this.findViewById(R.id.tableKD);
        int i = 0;

        while(i <= 12){
            TableRow row = (TableRow)getLayoutInflater().inflate(R.layout.table, null);
            ((TextView)row.findViewById(R.id.num)).setText(String.valueOf(soal.getkdki(i, 0)));
            ((TextView)row.findViewById(R.id.kd)).setText(String.valueOf(soal.getkdki(i, 1)));
            ((TextView)row.findViewById(R.id.ki)).setText(String.valueOf(soal.getkdki(i, 2)));
            tableKD.addView(row);
            i++;
        }
    }
}
