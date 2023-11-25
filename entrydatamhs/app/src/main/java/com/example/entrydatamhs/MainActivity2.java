package com.example.entrydatamhs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView nama, nim, akhir, huruf, predikat;
    Button exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nim = findViewById(R.id.nim);
        nama = findViewById(R.id.nama);
        akhir = findViewById(R.id.akhir);
        huruf = findViewById(R.id.huruf);
        predikat = findViewById(R.id.predikat);
        exit = findViewById(R.id.keluar);

        Intent intent = getIntent();
        nim.setText(intent.getStringExtra("nim"));
        nama.setText(intent.getStringExtra("nama"));
        akhir.setText(intent.getStringExtra("akhir"));
        huruf.setText(intent.getStringExtra("huruf"));
        predikat.setText(intent.getStringExtra("predikat"));

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, datamhs.class);
                startActivity(intent);
            }
        });
    }
}