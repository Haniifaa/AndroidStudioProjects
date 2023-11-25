package com.example.tempatumum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class maintempat extends AppCompatActivity {
    ListView Listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintempat);

        String tempatumum[]={"Bandara", "Stasiun","Bank","Cafe","Perpustakaan","Bioskop","Toko Buku",
                "Pom Bensin","Rumah Sakit","Kebun Binatang"};
        int gambar_tempatumum[]={R.drawable.airport, R.drawable.trainstation,R.drawable.bank,R.drawable.cafe,R.drawable.library,
                R.drawable.cinema,R.drawable.bookstore,R.drawable.gasstation,R.drawable.hospital,R.drawable.zoo};

        String keterangan[]={"Tempat untuk pesawat terbang dan mendarat",
                "Tempat untuk pemberhentian dan keberangkatan kereta",
                "tempat untuk menyimpan dan mengambil uang",
                "tempat untuk bersantai seperti meminum kopi",
                "tempat untuk meminjam dan mengembalikan buku.Terdapat banyak buku yang dapat dipinjamkan",
                "tempat untuk menonton film",
                "tempat untuk membeli buku",
                "tempat untuk mengisi bensin",
                "tempat untuk merawat orang sakit",
                "tempat untuk melihat macam-macam binatang"};

        Listview=findViewById(R.id.listtempatumum);
        AdapterTempat adapterTempat=new AdapterTempat(this,tempatumum,gambar_tempatumum,keterangan);
        Listview.setAdapter(adapterTempat);
        Listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nm_tempat=tempatumum[position].toString();
                int gbr_tempat=gambar_tempatumum[position];
                String ket=keterangan[position].toString();

                //Toast.makeText(Maintempatumum.this,""+gbr_tempat, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(maintempat.this,DetailTempat.class);
                intent.putExtra("namatempat",nm_tempat);
                intent.putExtra("gambartempat",gbr_tempat);
                intent.putExtra("keter",ket);
                startActivity(intent);

            }
        });
    }
}