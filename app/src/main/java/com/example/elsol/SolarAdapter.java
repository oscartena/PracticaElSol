package com.example.elsol;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SolarAdapter extends RecyclerView.Adapter<SolarViewHolder>{
    private List<Integer> imagenes;

    public SolarAdapter(List<Integer> imagenes) {
        this.imagenes = imagenes;
    }

    @NonNull
    @Override
    public SolarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new SolarViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull SolarViewHolder holder, int position) {
        Resources res = holder.itemView.getContext().getResources();
        String nombre = res.getResourceEntryName(imagenes.get(position));
        int idImagen = imagenes.get(position);
        holder.imageView.setImageResource(idImagen);

        Toolbar toolbar = holder.itemView.findViewById(R.id.toolbarItem);
        toolbar.setTitle(nombre);
    }

    @Override
    public int getItemCount() {
        return imagenes.size();
    }
}
