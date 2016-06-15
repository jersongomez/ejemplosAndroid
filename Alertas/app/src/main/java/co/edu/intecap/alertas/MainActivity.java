package co.edu.intecap.alertas;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public void onBackPressed() {
		mostrarAlerta();
	}
	
	public void mostrarAlerta(){
		
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle(R.string.titulo_confirmacion);
		builder.setMessage(R.string.mensaje_salir);
		builder.setPositiveButton(R.string.opcion_aceptar, new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				finish();
			}
		});
		
		// Si no va hacer nada solo se coloca null
		builder.setNegativeButton(R.string.opcion_cancelar, null);
		
		builder.setNeutralButton(R.string.opcion_neutral, new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				
			}
		});
		
		builder.show();
	}

}
