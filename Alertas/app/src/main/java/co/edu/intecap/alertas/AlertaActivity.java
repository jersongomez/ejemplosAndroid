package co.edu.intecap.alertas;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.text.format.Time;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;

public class AlertaActivity extends Activity {
	
	private AlertDialog alerta;
	private Handler handler = new Handler(new Callback() {
		
		@Override
		public boolean handleMessage(Message arg0) {
			alerta.dismiss();
			return false;
		}
	});

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alerta);
		
		cargando();
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				Message mensaje = new Message();
				handler.sendMessage(mensaje);
				
			}
		}, 500);
	}

	private void cargando() {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Cargando ...");
		
		//Carga la vista de los items
		View v = LayoutInflater.from(this).inflate(R.layout.item_alerta, null);
		
		builder.setView(v);
		builder.setCancelable(false); // No deja q el usuario la cierre
		alerta = builder.create();
		alerta.show();
		

		//builder.show();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.alerta, menu);
		return true;
	}

}
