package com.example.e_lkpd;

import android.content.Context;
import android.content.Intent;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class contentAndAnswers {

    kumpulanSoal soal = new kumpulanSoal();
    private int skor;

    public void setContent(int x, TextView numSoal, TextView txtSoal, RadioGroup pilihanJawaban, RadioButton jawaban1, RadioButton jawaban2, RadioButton jawaban3, RadioButton jawaban4){
        pilihanJawaban.clearCheck();
        txtSoal.setText(soal.getSoal(x));
        jawaban1.setText(soal.getPilihanGanda1(x));
        jawaban2.setText(soal.getPilihanGanda2(x));
        jawaban3.setText(soal.getPilihanGanda3(x));
        jawaban4.setText(soal.getPilihanGanda4(x));
        numSoal.setText("Soal "+String.valueOf(x+1));
    }

    public void setVideo(WebView video, String kode_youtube){
        video.setWebViewClient(new WebViewClient());
        video.setWebChromeClient(new WebChromeClient());
        video.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        video.getSettings().setJavaScriptEnabled(true);
        video.getSettings().setPluginState(WebSettings.PluginState.ON);
        video.getSettings().setDefaultFontSize(18);

        String kodeHTML = "<head></head><body>" +
                "<iframe width=\"340\" height=\"230\" src=\"https://www.youtube.com/embed/" +
                kode_youtube +
                "\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>" +
                "</body>";
        video.loadData(kodeHTML,"text/html; charset=utf-8",null);
    }

    public int hslSkor(){
        return skor;
    }

    public void cekJawaban( Context thisclass, String jawaban, RadioButton jawaban1, RadioButton jawaban2, RadioButton jawaban3, RadioButton jawaban4){
        if(jawaban1.isChecked()){
            if(jawaban1.getText().toString().equals(jawaban)){
                skor =+ 5;
                Toast.makeText(thisclass, "Jawaban Benar ", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(thisclass, "Jawaban Salah", Toast.LENGTH_SHORT).show();
            }
        }else if(jawaban2.isChecked()){
            if(jawaban2.getText().toString().equals(jawaban)){
                skor =+ 5;
                Toast.makeText(thisclass, "Jawaban Benar", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(thisclass, "Jawaban Salah", Toast.LENGTH_SHORT).show();
            }
        }else if(jawaban3.isChecked()){
            if(jawaban3.getText().toString().equals(jawaban)){
                skor =+ 5;
                Toast.makeText(thisclass, "Jawaban Benar", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(thisclass, "Jawaban Salah", Toast.LENGTH_SHORT).show();
            }
        }else if(jawaban4.isChecked()){
            if(jawaban4.getText().toString().equals(jawaban)){
                skor =+ 5;
                Toast.makeText(thisclass, "Jawaban Benar", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(thisclass, "Jawaban Salah", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
