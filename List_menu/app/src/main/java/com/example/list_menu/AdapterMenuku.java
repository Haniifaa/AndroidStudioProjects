package com.example.list_menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterMenuku extends RecyclerView.Adapter<AdapterMenuku.myViewHolder>{

    ArrayList<Menumodel> modelArrayList;
    Context context;

    public AdapterMenuku(ArrayList<Menumodel> modelArrayList, Context context) {
        this.modelArrayList = modelArrayList;
        this.context = context;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.format_menuku,parent,false);
        return new AdapterMenuku.myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {
        holder.cnamaMenu.setText(modelArrayList.get(position).namaMenu);
        holder.chargaMenu.setText(modelArrayList.get(position).hargaMenu);
        holder.csatuanMenu.setText(modelArrayList.get(position).satuanMenu);
        holder.gambarMenu.setImageResource(modelArrayList.get(position).gambarMenu);

    }

    @Override
    public int getItemCount() {

        return modelArrayList.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        TextView cnamaMenu,chargaMenu,csatuanMenu;
        ImageView gambarMenu;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            cnamaMenu=itemView.findViewById(R.id.nm_menu);
            chargaMenu=itemView.findViewById(R.id.harga_menu);
            csatuanMenu=itemView.findViewById(R.id.satuan_menu);
            gambarMenu=itemView.findViewById(R.id.foto_menu);

        }
    }

}
