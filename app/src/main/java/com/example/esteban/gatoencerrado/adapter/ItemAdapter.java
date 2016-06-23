package com.example.esteban.gatoencerrado.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.esteban.gatoencerrado.R;
import com.example.esteban.gatoencerrado.model.Item;

import java.util.List;

/**
 * Created by Esteban on 23/6/2016.
 */
public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(Context context, List<Item> items) {
        super(context, R.layout.inventario_row, items);
    }

    @Override
    public long getItemId(int position) {
        //return position;
        return getItem(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.inventario_row, parent, false);
        final Item item = getItem(position);

        TextView tvItem = (TextView) rowView.findViewById(R.id.nombreItem);
        tvItem.setText(item.getNombre().toString());

        return rowView;
    }
}
