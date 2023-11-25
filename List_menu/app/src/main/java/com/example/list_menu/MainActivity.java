package com.example.list_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Menumodel> modelArrayList=new ArrayList<>();
    RecyclerView recyclerView_menu;

    int fotoMenu[]={R.drawable.menu1,R.drawable.menu2,R.drawable.menu3,R.drawable.menu4,R.drawable.menu5,R.drawable.menu6,R.drawable.menu7,R.drawable.menu8,R.drawable.menu9};
    String nmMenu[]={"Nasi Goreng","Soto madura","Ayam Goreng","Nasi Kuning","Nasi Rames","Nasi Gudeng","Soto Kudus","Bakso"};
    String hrg[]={"14000","13000","15000","12000","14500","15000","12500","11000","15500"};
    String satMenu[]={"Piring","Mangkok","Ekor","Pincuk","Piring","Pincuk","Mangkok","Baskom","Mangkok"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView_menu=findViewById(R.id.recycleview);

        bacaDataMenu();
        tampilkan_Listview();
        AdapterMenuku AdapterMenuku=new AdapterMenuku(modelArrayList,this);
        recyclerView_menu.setAdapter(AdapterMenuku);
        recyclerView_menu.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }

    private void bacaDataMenu(){
        for(int i=0;i<nmMenu.length;i++){
            modelArrayList.add(new Menumodel(nmMenu[i],hrg[i],satMenu[i],fotoMenu[i]));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_pilihan,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.item1){
            tampilkan_Listview();
        }else{
            tampilkan_gridview();
        }
        return super.onOptionsItemSelected(item);


    }
    private void tampilkan_Listview(){
        AdapterMenuku adapterMenu=new AdapterMenuku(modelArrayList,this);
        recyclerView_menu.setAdapter(adapterMenu);
        recyclerView_menu.setLayoutManager(new LinearLayoutManager(MainActivity.this));

    }
    private void tampilkan_gridview(){
        Adaptergridview adaptergridview=new Adaptergridview(modelArrayList,this);
        recyclerView_menu.setAdapter(adaptergridview);
        recyclerView_menu.setLayoutManager(new GridLayoutManager(MainActivity.this,2) );

    }
}