package co.com.jersongomez.fragmentosandroid;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import co.com.jersongomez.fragmentosandroid.fragmentos.Fragmento1;
import co.com.jersongomez.fragmentosandroid.fragmentos.Fraqmento2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Cargar un fragmento dinamicamente
        Fragmento1 fragmento1 = new Fragmento1();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.contenedor, fragmento1);
        ft.commit();

    }

    @Override
    protected void onPause() {
        super.onPause();
        // Cargar un fragmento dinamicamente
        Fraqmento2 fragmento2 = new Fraqmento2();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.contenedor, fragmento2);
        ft.commit();
    }
}
