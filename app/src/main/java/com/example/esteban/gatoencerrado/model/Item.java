package com.example.esteban.gatoencerrado.model;

import java.io.Serializable;
import java.util.Random;

/**
 * Created by Esteban on 18/6/2016.
 */
public class Item implements Serializable {

    Long id;
    private String nombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Item(String nombre) {
        this.id = new Random().nextLong();
        this.nombre = nombre;
    }

}