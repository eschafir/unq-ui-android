package com.example.esteban.gatoencerrado.gatoapp;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;

import com.example.esteban.gatoencerrado.adapter.ItemAdapter;
import com.example.esteban.gatoencerrado.model.Item;
import com.example.esteban.gatoencerrado.repo.RepoLaberintos;

/**
 * Created by Esteban on 23/6/2016.
 */
public class InventarioListFragment extends ListFragment implements View.OnClickListener {

    /**
     * The fragment's current callback object, which is notified of list item
     * clicks.
     */
    private Callbacks mCallbacks = sDummyCallbacks;

    /**
     * A callback interface that all activities containing this fragment must
     * implement. This mechanism allows activities to be notified of item
     * selections.
     */
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

    public InventarioListFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new ItemAdapter(
                getActivity(),
                RepoLaberintos.getInstance().getListaItems(null, 100)));
    }

    @Override
    public void onClick(View v) {

    }
}
