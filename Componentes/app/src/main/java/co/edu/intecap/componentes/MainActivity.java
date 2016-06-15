package co.edu.intecap.componentes;

import android.R.string;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	private EditText etUsuario;
	private EditText etclave;
	private Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        etUsuario = (EditText) findViewById(R.id.etUsuario);
        etclave = (EditText) findViewById(R.id.etClave);
        btnIngresar = (Button) findViewById(R.id.btnIngresar);
        
        // Evento al boton ingresar
        btnIngresar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String usuario = etUsuario.getText().toString();
				String clave = etclave.getText().toString();
				
				if( usuario.equals("admin") && clave.equals("123") ){
					// Saber donde estoy getApplicationContext() 
					Intent intent = new Intent(MainActivity.this, MenuActivity.class);
					
					// Enviar parametros
					intent.putExtra("usuario", usuario);
					
					// Iniciar una actividad y se utiliza sino quiero recibir parametros
					//startActivity(intent);
					// Iniciar una actividad y se utiliza si quiero recibir parametros, segundo
					// parametro es el identificador mayor a cero
					startActivityForResult(intent, 1);
				}
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	if( requestCode ==1 && resultCode == Activity.RESULT_OK ){
    		String mensaje = data.getExtras().getString("mensaje");
    		btnIngresar.setText(mensaje);
    	}
    }
    
    @Override
    protected void onPause() {
    	Log.d("MainActivity.onPause", "Esta pausada la aplicacion.");
    	super.onPause();
    }
    
    @Override
    protected void onStart() {
    	Log.d("MainActivity.onStart", "Va a ser mostrada al usuario.");
    	super.onStart();
    }
    
    @Override
    protected void onStop() {
    	Log.d("MainActivity.onStop", "Se detuvo la aplicacion.");
    	super.onStop();
    }
    
    @Override
    protected void onResume() {
    	Log.d("MainActivity.onResume", "Usuario interactuando.");
    	super.onResume();
    }
    
    @Override
    protected void onRestart() {
    	Log.d("MainActivity.onRestart", "Se retorno.");
    	super.onRestart();
    }
    
    @Override
    protected void onDestroy() {
    	Log.d("MainActivity.onDestroy", "Finalizando aplicacion.");
    	super.onDestroy();
    }
    
}
