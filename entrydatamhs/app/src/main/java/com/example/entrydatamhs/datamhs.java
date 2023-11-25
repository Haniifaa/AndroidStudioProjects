package com.example.entrydatamhs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class datamhs extends AppCompatActivity {
    EditText ntugas,ptugas,nUts,pUts,nUas,pUas,namamhs,nimmhs,nAkhir,nHuruf,nPredikat;
    Button simpan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datamhs);

        ntugas=findViewById(R.id.ntugas);
        ptugas=findViewById(R.id.prsntgs);
        nUts=findViewById(R.id.nuts);
        pUts=findViewById(R.id.prsnuts);
        nUas=findViewById(R.id.nuas);
        pUas=findViewById(R.id.prsnuas);
        namamhs=findViewById(R.id.nmmhs);
        nAkhir = findViewById(R.id.nakhir);
        nHuruf = findViewById(R.id.nhuruf);
        nPredikat = findViewById(R.id.predikat);
        nimmhs = findViewById(R.id.nim);
        simpan = findViewById(R.id.kirim);


        ptugas.addTextChangedListener(new nAkhir(ptugas));
        pUts.addTextChangedListener(new nAkhir(pUts));
        pUas.addTextChangedListener(new nAkhir(pUas));

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nim = nimmhs.getText().toString().trim();
                String nama = namamhs.getText().toString().trim();
                String akhir = nAkhir.getText().toString().trim();
                String huruf = nHuruf.getText().toString().trim();
                String predikat = nPredikat.getText().toString().trim();
                if(nimmhs.getText().toString().isEmpty() || namamhs.getText().toString().isEmpty() || ntugas.getText().toString().isEmpty() || nUts.getText().toString().isEmpty() || nUas.getText().toString().isEmpty()){
                    Toast.makeText(datamhs.this, "Please fill in completely", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(datamhs.this, MainActivity2.class);
                    intent.putExtra("nim", nim);
                    intent.putExtra("nama", nama);
                    intent.putExtra("akhir", akhir);
                    intent.putExtra("huruf", huruf);
                    intent.putExtra("predikat", predikat);
                    startActivity(intent);
                }

            }
        });

        ntugas.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                float nilaiTugas,pointugas,nilaiuts,poinuts,nilaiuas,poinuas;
                if(ntugas.getText().toString().isEmpty()){
                    nilaiTugas=0;
                }else{
                    nilaiTugas=Float.parseFloat(ntugas.getText().toString());
                }
                pointugas=(float) (0.3*nilaiTugas);
                ptugas.setText(Float.toString(pointugas));

            }
        });

        nUts.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                float nilaiUTS, pointUTS;
                if (nUts.getText().toString().isEmpty()) {
                    nilaiUTS = 0;
                } else {
                    nilaiUTS = Float.parseFloat(nUts.getText().toString());
                }
                pointUTS = (float) (0.35 * nilaiUTS);
                pUts.setText(Float.toString(pointUTS));
            }
        });

        nUas.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                float nilaiUAS, pointUAS;
                if (nUas.getText().toString().isEmpty()) {
                    nilaiUAS = 0;
                } else {
                    nilaiUAS = Float.parseFloat(nUas.getText().toString());
                }
                pointUAS = (float) (0.35 * nilaiUAS);
                pUas.setText(Float.toString(pointUAS));
            }
        });

    }

    private class nAkhir implements TextWatcher {

        private View view;

        private nAkhir(View view) {
            this.view = view;
        }
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

        public void afterTextChanged(Editable editable) {
            float tgs, uts, uas, na;
            String nh,np;
            if (ntugas.getText().toString().isEmpty() || nUts.getText().toString().isEmpty() || nUas.getText().toString().isEmpty()) {
                tgs = 0; uts = 0; uas = 0;
            } else {
                tgs = Float.parseFloat(ptugas.getText().toString());
                uts = Float.parseFloat(pUts.getText().toString());
                uas = Float.parseFloat(pUas.getText().toString());
            }
            na = (float) (tgs + uts + uas);
            nAkhir.setText(Float.toString(na));

            if (na >= 85) {
                nh = "A"; np = "Istimewa";
            } else if (na >= 80) {
                nh = "AB"; np = "Sangat Baik";
            } else if (na >= 70) {
                nh = "B"; np = "Baik";
            } else if (na >= 65) {
                nh = "BC"; np = "Cukup Baik";
            } else if (na >= 60) {
                nh = "C"; np = "Cukup";
            } else if (na >= 40) {
                nh = "D"; np = "Kurang";
            } else {
                nh = "E"; np = "Sangat Kurang";
            }
            nHuruf.setText(nh);
            nPredikat.setText(np);
        }
    }

}