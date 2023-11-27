package com.example.elsol;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private List<Integer> imagenes = List.of(R.drawable.corona_solar,R.drawable.erupcionsolar,R.drawable.espiculas,R.drawable.filamentos,R.drawable.magnetosfera,R.drawable.manchasolar);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.recyclerView);
        rv.setLayoutManager(new GridLayoutManager(this,2));
        rv.setAdapter(new SolarAdapter(imagenes));

        //me gustan los enanos

    }
}