package com.example.esteban.gatoencerrado.gatoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;

import com.example.esteban.gatoencerrado.R;
import com.example.esteban.gatoencerrado.model.Laberinto;

/**
 * Created by Esteban on 18/6/2016.
 */
public class LaberintoListActivity extends AppCompatActivity implements LaberintoListFragment.Callbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laberinto_app_bar);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getTitle());

        TextView lblTitulo = (TextView)findViewById(R.id.lblTitulo);
        lblTitulo.setText("Laberintos Disponibles");
    }

    @Override
    public void onItemSelected(Laberinto laberinto) {
        // In single-pane mode, simply start the detail activity
        // for the selected item ID.
        Intent detailIntent = new Intent(this, LaberintoDetailActivity.class);
        Log.w("Lab", laberinto.getNombre());
        detailIntent.putExtra(LaberintoDetailFragment.ARG_ITEM_ID, laberinto);
        startActivity(detailIntent);
    }

}
