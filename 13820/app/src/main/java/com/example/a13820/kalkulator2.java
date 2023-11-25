package com.example.a13820;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class kalkulator2 extends AppCompatActivity {
    Button ang0,ang1,ang2,ang3,ang4,ang5,ang6,ang7,ang8,ang9,btntambah,btnkali,btnbagi,btnkurang,samadengan;
    EditText hasile;
    public float angka1,angka2;
    String operasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator2);

        ang2=findViewById(R.id.ang02);
        ang0=findViewById(R.id.ang0);
        ang1=findViewById(R.id.ang01);
        ang3=findViewById(R.id.ang03);
        ang4=findViewById(R.id.ang04);
        ang5=findViewById(R.id.ang05);
        ang6=findViewById(R.id.ang06);
        ang7=findViewById(R.id.ang07);
        ang8=findViewById(R.id.ang08);
        ang9=findViewById(R.id.ang09);

        btntambah=findViewById(R.id.tambah);
        btnkali=findViewById(R.id.kali);
        btnbagi=findViewById(R.id.bagi);
        btnkurang=findViewById(R.id.kurang);
        samadengan=findViewById(R.id.samadengan);


        hasile=findViewById(R.id.wadah);
    }
    public void nomernol(View view){
        hasile.setText(hasile.getText().toString()+"0");
    }
    public void nomersatu(View view){
        hasile.setText(hasile.getText().toString()+"1");
    }
    public void nomerdua(View view){
        hasile.setText(hasile.getText().toString()+"2");
    }
    public void nomertiga(View view){
        hasile.setText(hasile.getText().toString()+"3");
    }
    public void nomerempat(View view){
        hasile.setText(hasile.getText().toString()+"4");
    }
    public void nomerlima(View view){
        hasile.setText(hasile.getText().toString()+"5");
    }
    public void nomerenam(View view){
        hasile.setText(hasile.getText().toString()+"6");
    }
    public void nomertujuh(View view){
        hasile.setText(hasile.getText().toString()+"7");
    }
    public void nomerdelapan(View view){
        hasile.setText(hasile.getText().toString()+"8");
    }
    public void nomersembilan(View view){
        hasile.setText(hasile.getText().toString()+"9");
    }

    public void tambahkan(View view) {
        angka1 = Float.parseFloat(hasile.getText().toString());
        hasile.setText("");
    }





    public void kurangkan(View view) {
        angka1 = Float.parseFloat(hasile.getText().toString());
        hasile.setText("");
    }

    public void kalikan(View view) {
        angka1 = Float.parseFloat(hasile.getText().toString());
        hasile.setText("");
    }

    public void bagikan(View view) {
        angka1 = Float.parseFloat(hasile.getText().toString());
        hasile.setText("");
    }
    public void samadengan(View view) {
        angka2=Float.parseFloat(hasile.getText().toString());
        hasile.setText(Float.toString(angka1+angka2));



    }

    public void clear(View view) {

    }
}