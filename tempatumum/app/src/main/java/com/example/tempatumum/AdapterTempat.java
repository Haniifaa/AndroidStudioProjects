package com.example.tempatumum;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AdapterTempat extends ArrayAdapter {
    String tempatumum[];
    String keterangan[];
    int gambar_tempatumum[];
    Activity activity;


    public AdapterTempat(maintempat activity, String[] tempatumum, int[] gambar_tempatumum, String[] keterangan) {
        super(activity, R.layout.list_item,tempatumum);
        this.tempatumum = tempatumum;
        this.keterangan = keterangan;
        this.gambar_tempatumum = gambar_tempatumum;
        this.activity = activity;
    }


    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        LayoutInflater inflater=activity.getLayoutInflater();
        View v=inflater.inflate(R.layout.list_item,null);

        ImageView gambare;
        TextView nama_tempat;

        gambare=v.findViewById(R.id.gambar_tempatumum);
        nama_tempat=v.findViewById(R.id.tempatumum);

        gambare.setImageResource(gambar_tempatumum[position]);
        nama_tempat.setText(tempatumum[position]);
        return v;
    }
}
