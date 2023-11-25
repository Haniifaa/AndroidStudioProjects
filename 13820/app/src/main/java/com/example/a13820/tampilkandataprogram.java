package com.example.a13820;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class tampilkandataprogram extends AppCompatActivity {
    ListView wadahdata;
    String bhsprogram[]={"C++", "Java", "Delphi", "Python", "JavaScript", "Cobel", "C", "Ruby", "Kotlin", "Pascal", "PHP", "Visual Basic", "DLL"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilkandataprogram);

        wadahdata = findViewById(R.id.bhsprogram);

        ArrayAdapter arrayAdapter=new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, bhsprogram);
        wadahdata.setAdapter(arrayAdapter);

        wadahdata.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(tampilkandataprogram.this, "Anda memilih "+bhsprogram[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}