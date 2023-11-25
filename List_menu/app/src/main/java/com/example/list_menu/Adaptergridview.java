package com.example.list_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptergridview extends RecyclerView.Adapter<Adaptergridview.myViewHolder>{
        ArrayList<Menumodel> modelArrayList;
        Context context;

public Adaptergridview(ArrayList<Menumodel> modelArrayList, MainActivity mainActivity) {
        this.modelArrayList = this.modelArrayList;
        this.context = context;
        }

@Override
public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.format_menu_grid,parent,false);

        return new Adaptergridview.myViewHolder(view);
        }

@Override
public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
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
    TextView cnamaMenu, chargaMenu,csatuanMenu;
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
