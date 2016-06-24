package com.example.esteban.gatoencerrado.gatoapp;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import com.example.esteban.gatoencerrado.R;
import com.example.esteban.gatoencerrado.model.Item;

/**
 * Created by Esteban on 23/6/2016.
 */
public class InventarioListActivity extends AppCompatActivity implements InventarioListFragment.Callbacks{

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.inventario_lista);


    }

    @Override
    public void onItemSelected(Item item) {

    }
}
