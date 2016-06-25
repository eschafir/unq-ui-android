package com.example.esteban.gatoencerrado.gatoapp;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ListView;

import com.example.esteban.gatoencerrado.adapter.LaberintoAdapter;
import com.example.esteban.gatoencerrado.model.Laberinto;
import com.example.esteban.gatoencerrado.repo.RepoLaberintos;

/**
 * Created by Esteban on 18/6/2016.
 */
public class LaberintoListFragment extends ListFragment implements View.OnClickListener {

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
        void onItemSelected(Laberinto laberinto);
    }

    /**
     * A dummy implementation of the {@link Callbacks} interface that does
     * nothing. Used only when this fragment is not attached to an activity.
     */
    private static Callbacks sDummyCallbacks = new Callbacks() {
        @Override
        public void onItemSelected(Laberinto laberinto) {
        }
    };

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public LaberintoListFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new LaberintoAdapter(
                getActivity(),
                RepoLaberintos.getInstance().getLaberintos(null, 100)));
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        // Activities containing this fragment must implement its callbacks.
        if (!(activity instanceof Callbacks)) {
            throw new IllegalStateException("Activity must implement fragment's callbacks.");
        }

        mCallbacks = (Callbacks) activity;
    }

    @Override
    public void onDetach() {
        super.onDetach();

        mCallbacks = sDummyCallbacks;
    }

    @Override
    public void onListItemClick(ListView listView, View v, int position, long id) {
        super.onListItemClick(listView, v, position, id);
        Laberinto laberinto = (Laberinto) listView.getAdapter().getItem(position);
        mCallbacks.onItemSelected(laberinto);
    }

    @Override
    public void onClick(View v) {

    }
}

