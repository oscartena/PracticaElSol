package com.example.elsol;

public class SolarItem {
    private String nombre;
    private int idImagen;

    public SolarItem(String nombre, int idImagen) {
        this.nombre = nombre;
        this.idImagen = idImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdImagen() {
        return idImagen;
    }
}
