package com.example.a13820;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dashboardmenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboardmenu);
    }
        public void tampildatane(View view){
            Intent intent = new Intent(dashboardmenu.this, tampilkandataprogram.class);
            startActivity(intent);
        }

}