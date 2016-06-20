package com.example.esteban.gatoencerrado.gatoapp;

import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ListView;

import com.example.esteban.gatoencerrado.model.Item;

/**
 * Created by Esteban on 20/6/2016.
 */
public class InventarioListFragment extends ListFragment implements View.OnClickListener {

    private Callbacks mCallbacks = sDummyCallbacks;

    public interface Callbacks {
        void onItemSelected(Item item);
    }

    /**
     * A dummy implementation of the {@link Callbacks} interface that does
     * nothing. Used only when this fragment is not attached to an activity.
     */
    private static Callbacks sDummyCallbacks = new Callbacks() {
        @Override
        public void onItemSelected(Item item) {
        }
    };

    @Override
    public void onListItemClick(ListView listView, View v, int position, long id) {
        super.onListItemClick(listView, v, position, id);
        Item item = (Item) listView.getAdapter().getItem(position);
        mCallbacks.onItemSelected(item);
    }


    @Override
    public void onClick(View v) {

    }
}
