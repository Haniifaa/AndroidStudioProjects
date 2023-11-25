package com.example.uts_13820;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Menyimpan extends AppCompatActivity {
    TextView nama, harga, jumlah, total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menyimpan);


        nama = findViewById(R.id.nama);
        harga = findViewById(R.id.harga);
        jumlah = findViewById(R.id.jumlah);
        total = findViewById(R.id.total);


        Intent intent = getIntent();

        nama.setText(intent.getStringExtra("nama"));
        harga.setText(intent.getStringExtra("harga"));
        jumlah.setText(intent.getStringExtra("jumlah"));
        total.setText(intent.getStringExtra("total"));
    }
}