package com.example.tempatumum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailTempat extends AppCompatActivity {
    ImageView gambartempat_masuk;
    TextView nama_tempat_masuk, ket_tempat_masuk;

    String nm_kunci="namabuah";
    String ket_kunci="keter";
    int gambartempat;

    String namabuahe;
    String ketbuahe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tempat);
        gambartempat_masuk=findViewById(R.id.gambarterima);
        nama_tempat_masuk=findViewById(R.id.nmtempat);
        ket_tempat_masuk=findViewById(R.id.ket_buah);

        Bundle bundle=getIntent().getExtras();

        gambartempat=bundle.getInt(String.valueOf("gambartempat"));
        gambartempat_masuk.setImageResource(gambartempat);

        namabuahe=bundle.getString("namatempat");
        ketbuahe= bundle.getString("keter");


        nama_tempat_masuk.setText(namabuahe);
        ket_tempat_masuk.setText(ketbuahe);

    }
}