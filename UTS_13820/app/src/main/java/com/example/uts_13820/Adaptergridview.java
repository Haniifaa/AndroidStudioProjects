package com.example.uts_13820;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptergridview extends RecyclerView.Adapter<Adaptergridview.myViewHolder>{
    ArrayList<MenuModel> modelArrayList;
    Context context;

    public Adaptergridview(ArrayList<MenuModel> modelArrayList, Context context) {
        this.modelArrayList = modelArrayList;
        this.context = context;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.format_menu_grid,parent,false);

        return new Adaptergridview.myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.cnamabarang.setText(modelArrayList.get(position).namabarang);
        holder.ckodebarang.setText(modelArrayList.get(position).kodebarang);
        holder.chargabarang.setText(modelArrayList.get(position).hargabarang);
        holder.csatuanbarang.setText(modelArrayList.get(position).satuanbarang);
        holder.gambarbarang.setImageResource(modelArrayList.get(position).gambarbarang);
    }

    @Override
    public int getItemCount() {

        return modelArrayList.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        TextView cnamabarang,ckodebarang, chargabarang,csatuanbarang;
        ImageView gambarbarang;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            cnamabarang=itemView.findViewById(R.id.nm_alat);
            ckodebarang=itemView.findViewById(R.id.kode_alat);
            chargabarang=itemView.findViewById(R.id.harga_alat);
            csatuanbarang=itemView.findViewById(R.id.satuan_alat);
            gambarbarang=itemView.findViewById(R.id.foto_alat);

        }
    }
}
