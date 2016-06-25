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
    private List<Item> listaItems;
    private static final int MAX_RESULTS = 10;

    /**
     * SINGLETON
     */
    private static RepoLaberintos instance;

    private RepoLaberintos() {
        laberintos = new ArrayList<Laberinto>();
        listaItems = new ArrayList<Item>();
    }

    private List<Item> inicializarItems() {

        List<Item> items = new ArrayList<Item>();

        Item martillo = new Item("Martillo");
        Item llaveCocina = new Item("Llave de la cocina");
        Item pala = new Item("Pala");
        Item cuchillo = new Item("Cuchillo");
        Item pistola = new Item("Pistola");
        Item llaveEntradaPrision = new Item("Llave");
        Item bisturi = new Item("Bisturi");
        Item tuboGas = new Item("Tubo de gas");
        Item llaveLabo = new Item("Llave del laboratorio");
        Item palanca = new Item("Palanca");
        Item destornillador = new Item("Destornillador");

        items.add(martillo);
        items.add(llaveCocina);
        items.add(pala);
        items.add(cuchillo);
        items.add(pistola);
        items.add(llaveEntradaPrision);
        items.add(bisturi);
        items.add(tuboGas);
        items.add(llaveLabo);
        items.add(palanca);
        items.add(destornillador);

        return items;

    }

    public static RepoLaberintos getInstance() {
        if (instance == null) {
            instance = new RepoLaberintos();
            instance.init();
        }
        return instance;
    }

    private void init() {

        RepoLaberintos.getInstance().agregarLaberinto(new Laberinto("Casa abandonada", "Una casa construida en 1910. La leyenda cuenta que alli moran los espiritus de la familia Ripper.", R.drawable.casa));
        RepoLaberintos.getInstance().agregarLaberinto(new Laberinto("Hospital", "El Hospital de la ciudad. No solo deberas encontrar la salida de este laberintos, sino que deberas evitar a los enfermos contagiosos. Es recomendable tenes experiencia en resolucion de laberintos para jugar este nivel.", R.drawable.hospital));
        RepoLaberintos.getInstance().agregarLaberinto(new Laberinto("Estacion de bomberos", "Estacion de Bomberos de la Ciudad de Buenos Aires. Apresurate a encontrar la salida antes de caer en llamas!!", R.drawable.bomberos));
        RepoLaberintos.getInstance().agregarLaberinto(new Laberinto("Prision", "PRISION BREAK", R.drawable.prision));
        RepoLaberintos.getInstance().agregarLaberinto(new Laberinto("Museo", "Una noche en el museo", R.drawable.museo));
        RepoLaberintos.getInstance().agregarItem(new Item("Pala"));
        RepoLaberintos.getInstance().agregarItem(new Item("Pico"));
    }

    public void agregarLaberinto(Laberinto laberinto) {
        laberinto.setId(getMaximoId());
        laberintos.add(laberinto);
    }

    public void agregarItem(Item item) {
        item.setId(getMaximoId());
        listaItems.add(item);
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

    public List<Item> getListaItems(String nombre, int max) {
        Iterator<Item> it = listaItems.iterator();
        List<Item> result = new ArrayList<Item>();
        while (it.hasNext() && max > 0) {
            Item item = it.next();
            max--;
            if (nombre == null || item.getNombre().toUpperCase().contains(nombre.toUpperCase())) {
                result.add(item);
            }
        }
        return result;
    }
}
