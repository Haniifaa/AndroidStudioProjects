package com.example.uts_13820;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.ArrayList;

public class AdapterMenuku extends RecyclerView.Adapter<AdapterMenuku.myViewHolder>{

    ArrayList<MenuModel> modelArrayList;
    Context context;

    public AdapterMenuku(ArrayList<MenuModel> modelArrayList, Context context) {
        this.modelArrayList = modelArrayList;
        this.context = context;
    }

    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.format_menuku,parent,false);
        return new AdapterMenuku.myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.cnamabarang.setText(modelArrayList.get(position).namabarang);
        holder.ckodebarang.setText(modelArrayList.get(position).kodebarang);
        holder.chargaMenu.setText(modelArrayList.get(position).hargabarang);
        holder.csatuanMenu.setText(modelArrayList.get(position).satuanbarang);

        holder.gambarMenu.setImageResource(modelArrayList.get(position).gambarbarang);
        holder.crview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,detail_menu_makanan.class);
                intent.putExtra("namabarang",modelArrayList.get(position).namabarang);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {

        return modelArrayList.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {

        TextView cnamabarang,ckodebarang,chargaMenu,csatuanMenu;
        ImageView gambarMenu;
        CardView crview;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            cnamabarang=itemView.findViewById(R.id.nm_alat);
            ckodebarang=itemView.findViewById(R.id.kode_alat);
            chargaMenu=itemView.findViewById(R.id.harga_alat);
            csatuanMenu=itemView.findViewById(R.id.satuan_alat);
            gambarMenu=itemView.findViewById(R.id.foto_alat);
            crview=itemView.findViewById(R.id.cardview01);

        }
    }

}