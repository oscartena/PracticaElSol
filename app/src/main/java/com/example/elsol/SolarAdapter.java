package com.example.elsol;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SolarAdapter extends RecyclerView.Adapter<SolarViewHolder>{
    private List<SolarItem> imagenes;

    public SolarAdapter(List<SolarItem> imagenes) {
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
        SolarItem item = imagenes.get(position);
        holder.imageView.setImageResource(item.getIdImagen());

        Toolbar toolbar = holder.itemView.findViewById(R.id.toolbarItem);
        toolbar.setTitle(item.getNombre());

        toolbar.inflateMenu(R.menu.menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int posicion = holder.getAdapterPosition();
                if (posicion != RecyclerView.NO_POSITION){
                    int id = item.getItemId();
                    if (id == R.id.action_copy){
                            SolarItem solarItem = imagenes.get(posicion);
                            imagenes.add(posicion, solarItem);
                        notifyItemInserted(posicion);
                        return true;
                    }else if (id == R.id.action_delete){
                            imagenes.remove(posicion);
                            notifyItemRemoved(posicion);
                            return true;
                    }
                }
                return false;
            }
        });


    }

    @Override
    public int getItemCount() {
        return imagenes.size();
    }
}
