package common.model;

import java.util.List;

public class Medicamento {
	private String nombre;
	private String numSerie;
	private List <Enfermedad> enfermedades;

	public Medicamento(String nombre, String num, List <Enfermedad> e) {
		this.nombre=nombre;
		numSerie=num;
		enfermedades=e;
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	@Override
	public String toString() {
		return "Medicamento [nombre=" + nombre + ", numSerie=" + numSerie + ", enfermedades=" + enfermedades + "]";
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
	public String getNumSerie() {
		return numSerie;
	}
	/**
	 * @param numSerie the numSerie to set
	 */
	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}
	
	/**
	 * @return the enfermedades
	 */
	public List<Enfermedad> getEnfermedades() {
		return enfermedades;
	}
	/**
	 * @param enfermedades the enfermedades to set
	 */
	public void setEnfermedades(List<Enfermedad> enfermedades) {
		this.enfermedades = enfermedades;
	}
	
	
	
	
	
	
	

}
