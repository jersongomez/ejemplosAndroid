package co.edu.intecap.componentes;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
import android.widget.ProgressBar;

public class BienvenidoActivity extends Activity {

	private ProgressBar pbProgreso;
	private Handler handler = new Handler(new Handler.Callback() {
		
		@Override
		public boolean handleMessage(Message msg) {
			
			int valor = Integer.parseInt(msg.obj.toString());
			pbProgreso.setProgress(valor);
			
			return false;
		}
	});
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bienvenido);
		
		pbProgreso = (ProgressBar) findViewById(R.id.pbProgreso);
		pbProgreso.setMax(100);
		
		// Esti es un subproceso
		TimerTask tarea = new TimerTask() {
			
			@Override
			public void run() {
				
				for( int i=1; i<=100; i++){
					Message mensaje = new Message();
					mensaje.obj = i;
					handler.sendMessage(mensaje);
					try {
						Thread.sleep(70);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				Intent intent = new Intent(getApplicationContext(), MainActivity.class);
				startActivity(intent);
				finish();
			}
		};
		
		Timer timer = new Timer();
		timer.schedule(tarea, 1000*3);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bienvenido, menu);
		return true;
	}

}
