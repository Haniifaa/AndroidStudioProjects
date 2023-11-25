package com.example.uts_13820;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class detail_menu_makanan extends AppCompatActivity {
    TextView namabarang, kodebarang, hargabarang, satuanbarang, totalbarang;
    ImageView gambarnya;
    EditText jmlpesan;
    Button simpan;

    int gambare;
    String xnama="namabarang";
    String tnama;
    String xkode="kodebarang";
    String tkode;
    String xhrg="hargabarang";
    String thrg;
    String xsat="satuanbarang";
    String tsat;
    String xtotal="totalbarang";
    String ttot;

    private Array Bundler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu_makanan);


        gambarnya=findViewById(R.id.foto_alat);

        Bundle bundle=getIntent().getExtras();

        gambare=bundle.getInt(String.valueOf("gambare"));
        gambarnya.setImageResource(gambare);

        namabarang=findViewById(R.id.nm_alat);
        tnama=bundle.getString(xnama);
        namabarang.setText(tnama);

        kodebarang=findViewById(R.id.kode_alat);
        tkode=bundle.getString(xkode);
        kodebarang.setText(tkode);
/*
        hargabarang=findViewById(R.id.harga_alat);
        thrg=bundle.getString(xhrg);
        hargabarang.setText(thrg);

        satuanbarang=findViewById(R.id.satuan_alat);
        tsat=bundle.getString(xsat);
        satuanbarang.setText(tsat);

        totalbarang=findViewById(R.id.total_pesan);
        ttot=bundle.getString(xtotal);
        totalbarang.setText(ttot);

        totalbarang=findViewById(R.id.total_pesan);
        simpan=findViewById(R.id.kirimkan);*/


        jmlpesan=findViewById(R.id.jml_pesan);
        //totalbarang.addTextChangedListener(new jmlpesan(totalbarang));
        jmlpesan.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void afterTextChanged(Editable editable) {

                int total,jml=0,harga=0;
                if(!jmlpesan.getText().toString().isEmpty()){
                    jml= Integer.parseInt(jmlpesan.getText().toString());
                    harga=Integer.parseInt(hargabarang.getText().toString());
                }

                total=(int) (jml*harga);
                totalbarang.setText(Integer.toString(total));
            }
        });

        /*simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nama = namabarang.getText().toString().trim();
                String harga = hargabarang.getText().toString().trim();
                String jumlah = jmlpesan.getText().toString().trim();
                String total = totalbarang.getText().toString().trim();
                if(namabarang.getText().toString().isEmpty() || hargabarang.getText().toString().isEmpty() || jmlpesan.getText().toString().isEmpty() || totalbarang.getText().toString().isEmpty()){
                    Toast.makeText(detail_menu_makanan.this, "Please fill in completely", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(detail_menu_makanan.this, Menyimpan.class);
                    intent.putExtra("namabarang", nama);
                    intent.putExtra("hargabarang", harga);
                    intent.putExtra("jmlpesan",jumlah);
                    intent.putExtra("totalbarang", total);
                    startActivity(intent);
                }

            }
        });*/

    }
}