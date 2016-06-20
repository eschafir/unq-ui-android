package com.example.esteban.gatoencerrado.repo;

import com.example.esteban.gatoencerrado.R;
import com.example.esteban.gatoencerrado.model.Item;
import com.example.esteban.gatoencerrado.model.Laberinto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Esteban on 19/6/2016.
 */
public class RepoLaberintos {

    private List<Laberinto> laberintos;
    private static final int MAX_RESULTS = 10;

    /**
     * SINGLETON
     */
    private static RepoLaberintos instance;

    private RepoLaberintos() {
        laberintos = new ArrayList<Laberinto>();
    }

    public static RepoLaberintos getInstance() {
        if (instance == null) {
            instance = new RepoLaberintos();
            instance.init();
        }
        return instance;
    }

    private void init() {

        RepoLaberintos.getInstance().agregarLaberinto(new Laberinto("Casa abandonada", "Una casa construida en 1910. La leyenda cuenta que alli moran los espiritus de la familia Ripper.", R.drawable.casa, new ArrayList<Item>()));
        RepoLaberintos.getInstance().agregarLaberinto(new Laberinto("Hospital", "El Hospital de la ciudad. No solo deberas encontrar la salida de este laberintos, sino que deberas evitar a los enfermos contagiosos. Es recomendable tenes experiencia en resolucion de laberintos para jugar este nivel.", R.drawable.hospital, new ArrayList<Item>()));
//        RepoLaberintos.getInstance().agregarLaberinto(new Laberinto("Estacion de bomberos", "path", new ArrayList<Item>()));
//        RepoLaberintos.getInstance().agregarLaberinto(new Laberinto("Prision", "path", new ArrayList<Item>()));
//        RepoLaberintos.getInstance().agregarLaberinto(new Laberinto("Museo", "path", new ArrayList<Item>()));
//        RepoLaberintos.getInstance().agregarLaberinto(new Laberinto("Barrio", "path", new ArrayList<Item>()));
    }

    public void agregarLaberinto(Laberinto laberinto) {
        laberinto.setId(getMaximoId());
        laberintos.add(laberinto);
    }

    public Long getMaximoId() {
        return new Long(laberintos.size() + 1);
    }

    public List<Laberinto> getLaberintos(String nombre, int max) {
        Iterator<Laberinto> it = laberintos.iterator();
        List<Laberinto> result = new ArrayList<Laberinto>();
        while (it.hasNext() && max > 0) {
            Laberinto laberinto = it.next();
            max--;
            if (nombre == null || laberinto.getNombre().toUpperCase().contains(nombre.toUpperCase())) {
                result.add(laberinto);
            }
        }
        return result;
    }
}
