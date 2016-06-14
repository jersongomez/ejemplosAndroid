package co.com.jersongomez.fragmentosandroid.fragmentos;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.com.jersongomez.fragmentosandroid.R;

/**
 * Created by jgomez on 14/06/16.
 */
public class Fraqmento2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.vista2, container, false);
    }
}
