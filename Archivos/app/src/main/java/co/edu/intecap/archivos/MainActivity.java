package co.edu.intecap.archivos;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	private ListView lvContactos;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		lvContactos = (ListView) findViewById(R.id.lvContactos);
		ArrayList<Contacto> listaContactos = new Archivo().leerArchivo();
		ArrayAdapter<Contacto> adaptador = new ArrayAdapter<Contacto>(this,
				android.R.layout.simple_list_item_1, listaContactos);
		lvContactos.setAdapter(adaptador);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
