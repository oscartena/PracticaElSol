package com.example.elsol;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private List<SolarItem> imagenes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagenes = new ArrayList<>();
        imagenes.add(new SolarItem("Corona Solar",R.drawable.corona_solar));
        imagenes.add(new SolarItem("Erupción Solar",R.drawable.erupcionsolar));
        imagenes.add(new SolarItem("Espículas",R.drawable.espiculas));
        imagenes.add(new SolarItem("Filamentos",R.drawable.filamentos));
        imagenes.add(new SolarItem("Magnetosfera",R.drawable.magnetosfera));
        imagenes.add(new SolarItem("Mancha Solar",R.drawable.manchasolar));

        rv = findViewById(R.id.recyclerView);
        rv.setLayoutManager(new GridLayoutManager(this,2));
        rv.setAdapter(new SolarAdapter(imagenes));


    }
}