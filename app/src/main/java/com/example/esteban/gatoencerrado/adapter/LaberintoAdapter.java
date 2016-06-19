package com.example.esteban.gatoencerrado.adapter;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.example.esteban.gatoencerrado.R;
import com.example.esteban.gatoencerrado.model.Laberinto;

import java.util.List;

/**
 * Created by Esteban on 19/6/2016.
 */
public class LaberintoAdapter extends ArrayAdapter<Laberinto> {
    public LaberintoAdapter(Context context, List<Laberinto> laberintos) {
        super(context, R.layout.laberinto_row, laberintos);

    }
}
