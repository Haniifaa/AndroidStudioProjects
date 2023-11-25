package com.example.entrydata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class entry_data extends AppCompatActivity {
    EditText ckode,cnama,csatuan,charga,ckota;
    Button btnsave,btnview;
    databasehelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry_data);
/*
        ckode=findViewById(R.id.xkode);
        cnama=findViewById(R.id.xnama);
        csatuan=findViewById(R.id.xsatuan);
        charga=findViewById(R.id.xharga);
        ckota=findViewById(R.id.xkota);*/

        ckode=findViewById(R.id.xkode);
        cnama=findViewById(R.id.xnama);
        csatuan=findViewById(R.id.xsatuan);
        charga=findViewById(R.id.xharga);
        ckota=findViewById(R.id.xkota);

        btnsave=findViewById(R.id.save);
        btnview=findViewById(R.id.batal);
        db= new databasehelper(this);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String xkode=ckode.getText().toString();
                String xnama=cnama.getText().toString();
                String xsatuan=csatuan.getText().toString();
                String xharga=charga.getText().toString();
                String xkota=ckota.getText().toString();
                boolean hasil= db.input_data(xkode,xnama,xsatuan,xharga,xkota);
                if(hasil)
                {
                    Toast.makeText(entry_data.this,"Data Tersimpan",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}