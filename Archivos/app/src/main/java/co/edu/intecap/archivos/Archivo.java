package co.edu.intecap.archivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import android.os.Environment;

public class Archivo {
	
	public ArrayList<Contacto> leerArchivo(){
		ArrayList<Contacto> listaContacto = new ArrayList<Contacto>();
		
		try {
			//String ruta = Environment.getExternalStorageDirectory().getAbsolutePath();
			FileInputStream archivo = new FileInputStream("/mnt/sdcard/personas");
			InputStreamReader canal = new InputStreamReader(archivo);
			BufferedReader lectura = new BufferedReader(canal);
			String linea = lectura.readLine();
			
			while ( linea != null ){
				
				String[] info = linea.split(";");
				
				Contacto contacto = new Contacto();
				contacto.setNombre(info[0]);
				contacto.setAperllido(info[1]);
				contacto.setCorreo(info[2]);
				contacto.setCelular(info[3]);
				
				listaContacto.add(contacto);
				linea = lectura.readLine();
			}
			
			lectura.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaContacto;
		
	}

}
