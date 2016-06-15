package co.edu.intecap.archivos;

public class Contacto {
	
	private String nombre;
	private String aperllido;
	private String correo;
	private String celular;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAperllido() {
		return aperllido;
	}
	public void setAperllido(String aperllido) {
		this.aperllido = aperllido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Override
	public String toString() {
		return nombre + " " + aperllido;
	}
	
	
}
