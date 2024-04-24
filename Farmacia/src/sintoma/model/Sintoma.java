package sintoma.model;

import java.util.List;

public class Sintoma {
	private String nombre;
	private String gravedad;


	public Sintoma(String nombre, String gravedad) {
		this.nombre=nombre;
		this.gravedad=gravedad;
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	@Override
	public String toString() {
		return "Medicamento [nombre=" + nombre + ",gravedad=" + gravedad + "]";
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the numSerie
	 */
	public String getgravedad() {
		return gravedad;
	}
	/**
	 * @param numSerie the numSerie to set
	 */
	public void setgravedad(String gravedad) {
		this.gravedad = gravedad;
	}
	

	
	
	

}
