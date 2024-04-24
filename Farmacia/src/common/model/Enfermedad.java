package common.model;

public class Enfermedad {
	private String nombre;

	public Enfermedad(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Enfermedad [nombre=" + nombre + "]";
	}
	
}
