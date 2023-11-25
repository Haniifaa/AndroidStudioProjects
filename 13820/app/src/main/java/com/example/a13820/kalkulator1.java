package com.example.a13820;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class kalkulator1 extends AppCompatActivity {
    EditText ang01,ang02;
    Button btntambah,btnkali,btnkurang,btnbagi;
    TextView hasiloperasi;
    int tampung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator1);

        ang01=findViewById(R.id.angka1);
        ang02=findViewById(R.id.angka2);


        btntambah=findViewById(R.id.tambah);
        btnkali=findViewById(R.id.kali);
        btnbagi=findViewById(R.id.bagi);
        btnkurang=findViewById(R.id.kurang);

        //tombol berikut

        hasiloperasi=findViewById(R.id.hasiloperasi);

        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka01=Integer.parseInt(ang01.getText().toString());
                int angka02=Integer.parseInt(ang02.getText().toString());
                tampung=(angka01+angka02);
                hasiloperasi.setText(Integer.toString(tampung));
            }
        });
        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka01=Integer.parseInt(ang01.getText().toString());
                int angka02=Integer.parseInt(ang02.getText().toString());
                tampung=(angka01*angka02);
                hasiloperasi.setText(Integer.toString(tampung));
            }
        });
        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka01=Integer.parseInt(ang01.getText().toString());
                int angka02=Integer.parseInt(ang02.getText().toString());
                tampung=(angka01/angka02);
                hasiloperasi.setText(Integer.toString(tampung));
            }
        });
        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka01=Integer.parseInt(ang01.getText().toString());
                int angka02=Integer.parseInt(ang02.getText().toString());
                tampung=(angka01-angka02);
                hasiloperasi.setText(Integer.toString(tampung));
            }
        });
    }
}