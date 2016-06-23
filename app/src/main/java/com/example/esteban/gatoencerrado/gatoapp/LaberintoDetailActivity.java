package com.example.esteban.gatoencerrado.gatoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.example.esteban.gatoencerrado.R;
import com.example.esteban.gatoencerrado.model.Item;

public class LaberintoDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.laberinto_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.detail_toolbar);
        setSupportActionBar(toolbar);

        //TextView lblTitulo = (TextView)findViewById(R.id.lblTitulo);
        //lblTitulo.setText(laberinto.getNombre());

        if (savedInstanceState == null) {
            // Create the detail fragment and add it to the activity
            // using a fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putSerializable(LaberintoDetailFragment.ARG_ITEM_ID,
                    getIntent().getSerializableExtra(LaberintoDetailFragment.ARG_ITEM_ID));
            LaberintoDetailFragment fragment = new LaberintoDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.laberinto_detail_container, fragment)
                    .commit();
        }
    }

    public void mostrarInventario(View view) {
        // nueva activity o fragment
        // Intent detailIntent = new Intent(this, ...)
        Toast.makeText(this, "Abrir inventario", Toast.LENGTH_SHORT).show();
    }
}
