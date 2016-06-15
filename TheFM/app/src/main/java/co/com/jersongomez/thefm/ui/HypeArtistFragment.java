package co.com.jersongomez.thefm.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.com.jersongomez.thefm.MainActivity;
import co.com.jersongomez.thefm.R;

/**
 * Created by jgomez on 14/06/16.
 */

public class HypeArtistFragment extends Fragment {

    public static final int NUM_COLUMNAS = 2;
    public  static final String LOG_TAG = HypeArtistFragment.class.getName();

    private RecyclerView mHypedArtistsList;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if(activity instanceof MainActivity)
            Log.i("Esta en mi attached", "Yes");

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_hyped_artists, container, false);

        mHypedArtistsList = (RecyclerView) root.findViewById(R.id.hyped_artist_list);

        return root;
    }

    private void setupArtistsList(){
        mHypedArtistsList.setLayoutManager(new GridLayoutManager(getActivity(),NUM_COLUMNAS));
    }

}