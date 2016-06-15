package co.edu.intecap.archivosjson;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;

import java.util.ArrayList;

public class MainActivity extends Activity {

	private ArrayList<Contactos> listaContactos = new ArrayList<Contactos>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		llenarLista();
		
	}

	private void llenarLista() {
		for( int i=0; i<10; i++){
			Contactos contacto = new Contactos();
			contacto.setNombre("Nombre "+i);
			contacto.setApellido("Apellido "+i);
			contacto.setCorreo("Correo "+i);
			listaContactos.add(contacto);
		}
		Gson gson = new Gson();
		String obj = gson.toJson(listaContactos);
		Toast.makeText(this, obj, Toast.LENGTH_SHORT).show();
		
		convertirObjeto(obj);
	}
	
	private void convertirObjeto( String obj){
		
		Gson gson = new Gson();
		
		ArrayList lista = gson.fromJson(obj, ArrayList.class);
		for( Object data:lista ){
			//Log.d("data: ", data.getClass() + "");
			//Contactos contacto = new Contactos();
			//LinkedTreeMap<Object, Object> info = (LinkedTreeMap<Object, Object>) data;
			//contacto.setNombre(info.get("nombre").toString());
			
			LinkedTreeMap<Object, Object> info = (LinkedTreeMap<Object, Object>) data;
			Contactos contacto = gson.fromJson(new Gson().toJson(info), Contactos.class);
			
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
