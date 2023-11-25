package com.example.list_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class detail_menu_makanan extends AppCompatActivity {
    TextView namamenu, hrgmenu, satmenu, totmenu;
    EditText jmlpesan;
    String xnama="namamenu";
    String tnama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu_makanan);
        namamenu=findViewById(R.id.nm_menu);
        Bundle bundle=getIntent().getExtras();
        tnama=bundle.getString(xnama);
        namamenu.setText(tnama);
    }
}