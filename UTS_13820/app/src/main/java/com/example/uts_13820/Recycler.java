package com.example.uts_13820;

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

public class Recycler extends AppCompatActivity {
    ArrayList<MenuModel> modelArrayList=new ArrayList<>();
    RecyclerView recyclerView_menu;

    int gambarbrg[]={R.drawable.stetoskop,R.drawable.termometer,R.drawable.kursiroda,R.drawable.oksigenmedis,R.drawable.xray,R.drawable.infus,R.drawable.palurefleks,R.drawable.ventilator,R.drawable.plester,R.drawable.mikroskop,R.drawable.guntingbedah,R.drawable.jarum};
    String nmbrg[]={"Stetoskop","Termometer","Kursi Roda","Oksigen Medis","Xray","Infus","Palu Refleks","Ventilator","Plester",
            "Mikroskop", "Gunting bedah","Jarum Suntik"};
    String kodebrg[]={"01","02","03","04","05","06","0  7","08","09","10","11","12"};
    String satuan[]={"buah","buah","buah","buah","buah","buah","buah","buah","buah","buah","buah","buah"};
    String hrg[]={"1500000","15000","900000","450000","2000000","15000","30000","100000000","10000","1100000","200000","3000"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recyclerView_menu=findViewById(R.id.recyclerview);
        bacaDataMenu();
        tampilkan_Listview();
        /*AdapterMenuku adapterMenuku=new AdapterMenuku(modelArrayList,this);
        recyclerView_menu.setAdapter(adapterMenuku);
        recyclerView_menu.setLayoutManager(new LinearLayoutManager(Recycler.this));*/
    }

    private void bacaDataMenu(){
        for(int i=0;i<nmbrg.length;i++){
            modelArrayList.add(new MenuModel(nmbrg[i],kodebrg[i],hrg[i],satuan[i],gambarbrg[i]));
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
        recyclerView_menu.setLayoutManager(new LinearLayoutManager(Recycler.this));

    }
    private void tampilkan_gridview(){
        Adaptergridview adaptergridview=new Adaptergridview(modelArrayList,this);
        recyclerView_menu.setAdapter(adaptergridview);
        recyclerView_menu.setLayoutManager(new GridLayoutManager(Recycler.this,2) );

    }
}