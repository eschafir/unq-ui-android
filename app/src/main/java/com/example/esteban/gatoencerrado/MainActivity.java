package com.example.esteban.gatoencerrado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.esteban.gatoencerrado.model.Laberinto;

public class MainActivity extends AppCompatActivity {

    private Laberinto laberinto = new Laberinto("Laberinto prueba", "Path");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView lblTitulo = (TextView)findViewById(R.id.lblTitulo);
        lblTitulo.setText(laberinto.getNombre());
    }

    public void mostrarInventario(View view) {
        // nueva activity o fragment...
        // Intent detailIntent = new Intent(this, ...)
        Toast.makeText(this, "Abrir inventario", Toast.LENGTH_SHORT).show();
    }
}
