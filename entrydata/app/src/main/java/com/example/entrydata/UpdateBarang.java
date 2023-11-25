package com.example.entrydata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateBarang extends AppCompatActivity implements View.OnClickListener{
    EditText ekode,enama,esatuan,eharga,ekota;
    Button tombolupdate,tomboldelete,tombolview;
    databasehelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_barang);

        /*ekode=findViewById(R.id.xkode);
        enama=findViewById(R.id.xnama);
        esatuan=findViewById(R.id.xsatuan);
        eharga=findViewById(R.id.xharga);
        ekota=findViewById(R.id.xkota);*/
        ekode=findViewById(R.id.xkode);
        enama=findViewById(R.id.xnama);
        esatuan=findViewById(R.id.xsatuan);
        eharga=findViewById(R.id.xharga);
        ekota=findViewById(R.id.xkota);
        tombolupdate=findViewById(R.id.btnupdate);
        tomboldelete=findViewById(R.id.btndelete);
        tombolview=findViewById(R.id.btnview);

        tombolupdate.setOnClickListener(this);
        tomboldelete.setOnClickListener(this);
        tombolview.setOnClickListener(this);

        Bundle bundle=getIntent().getExtras();
        ekode.setText(bundle.getString("kodene"));
        enama.setText(bundle.getString("namane"));
        esatuan.setText(bundle.getString("satuane"));
        eharga.setText(bundle.getString("hargane"));
        ekota.setText(bundle.getString("kotane"));

        db=new databasehelper(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btnupdate) {
            String xkode=ekode.getText().toString();
            String xnama=enama.getText().toString();
            String xsatuan=esatuan.getText().toString();
            String xharga=eharga.getText().toString();
            String xkota=ekota.getText().toString();

            boolean oke=db.update_data(xkode,xnama,xsatuan,xharga,xkota);
            if(oke){
                Toast.makeText(UpdateBarang.this, "UPDATE DATA SUKSES",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(UpdateBarang.this,baca_sqlite.class);
                startActivity(intent);
            } else{
                Toast.makeText(UpdateBarang.this, "UPDATE DATA TIDAK BERHASIL",Toast.LENGTH_LONG).show();
            }
            Intent intent=new Intent(UpdateBarang.this,baca_sqlite.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.btndelete){
            String xkode=ekode.getText().toString();
            boolean okedeh=db.hapus_databarang(xkode);
            if(okedeh){

                Toast.makeText(UpdateBarang.this, "DELETE DATA SUKSES", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(UpdateBarang.this,baca_sqlite.class);
                startActivity(intent);
            }
            else{
                Toast.makeText(UpdateBarang.this, "DELETE DATA TIDAK BERHASIL",Toast.LENGTH_LONG).show();
            }
            Intent intent=new Intent(UpdateBarang.this,baca_sqlite.class);
            startActivity(intent);
        }
        else{
            Intent intent=new Intent(UpdateBarang.this,baca_sqlite.class);
            startActivity(intent);

        }
    }
}