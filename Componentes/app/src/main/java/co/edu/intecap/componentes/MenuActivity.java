package co.edu.intecap.componentes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MenuActivity extends Activity {

	private TextView lbUsuario;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		
		lbUsuario = (TextView) findViewById(R.id.lbUsuario);
		// Obtener el paremetro enviado
		String usuario = getIntent().getExtras().getString("usuario");
		lbUsuario.setText(usuario);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

	// boton del menu volver
	@Override
	public void onBackPressed() {
		
		Intent intent = new Intent();
		intent.putExtra("mensaje", "Gracias por utilizar");
		setResult(Activity.RESULT_OK,intent);
		
		// Si estamos en este metodo destuye la actividad
		super.onBackPressed();
		
		// Se utiliza para otro metodo destruye la actividad
		//finish();
		
	}

}
