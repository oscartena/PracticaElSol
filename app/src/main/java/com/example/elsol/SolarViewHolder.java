package com.example.elsol;

import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

public class SolarViewHolder extends RecyclerView.ViewHolder{
    protected ImageView imageView;
    protected Toolbar toolbar;
    public SolarViewHolder(View itemView) {
        super(itemView);
        this.imageView = itemView.findViewById(R.id.imageView);
        this.toolbar = itemView.findViewById(R.id.toolbarItem);

    }
}
