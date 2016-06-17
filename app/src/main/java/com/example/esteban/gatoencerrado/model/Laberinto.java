package com.example.esteban.gatoencerrado.model;

import java.util.List;

/**
 * Created by Esteban on 13/6/2016.
 */
public class Laberinto {
    private String nombre;
    private String path;
   // private List<Item> inventario;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getPath(){
        return path;
    }

    public void setPath(String path){
        this.path = path;
    }

//    public List<Item> getInventario(){
//        return inventario;
//    }

//    public void setInventario(List<Item> inventario){
//        this.inventario = inventario;
//    }

    public Laberinto(String nombre, String path){
        this.nombre = nombre;
        this.path = path;
       // this.inventario = inventario;
    }




}
