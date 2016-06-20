package com.example.esteban.gatoencerrado.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Esteban on 13/6/2016.
 */
public class Laberinto implements Serializable {
    Long id;
    String nombre;
    String descripcion;
    int path;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPath() {
        return path;
    }

    public void setPath(int path) {
        this.path = path;
    }

    public List<Item> getInventario() {
        return inventario;
    }

    public void setInventario(List<Item> inventario) {
        this.inventario = inventario;
    }

    public Laberinto(String nombre, int path) {
        this.id = new Random().nextLong();
        this.nombre = nombre;
        this.descripcion = "";
        this.path = path;
        this.inventario = new ArrayList<Item>();
    }

    public Laberinto(Long id, String nombre, String descripcion, int path, List<Item> inventario) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.path = path;
        this.inventario = inventario;
    }
}
