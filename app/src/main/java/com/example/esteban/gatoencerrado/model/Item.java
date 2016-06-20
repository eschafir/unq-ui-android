package com.example.esteban.gatoencerrado.model;

import java.io.Serializable;

/**
 * Created by Esteban on 18/6/2016.
 */
public class Item implements Serializable {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Item(String nombre) {
        this.nombre = nombre;
    }

}