package com.example.esteban.gatoencerrado.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Esteban on 13/6/2016.
 */
public class Laberinto implements Serializable {
    Long id;
    String nombre;
    String path;
    List<Item> inventario;

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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<Item> getInventario() {
        return inventario;
    }

    public void setInventario(List<Item> inventario) {
        this.inventario = inventario;
    }

    public Laberinto(String nombre, String path, List<Item> inventario) {
        this.nombre = nombre;
        this.path = path;
        this.inventario = inventario;
    }


}
