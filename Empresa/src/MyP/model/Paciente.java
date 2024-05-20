package MyP.model;

public class Paciente {
	private String nombre;
	private String apellido;
	private String cargo;
	private Campaña campañas;
	/**
	 * @param nombre
	 * @param apellido
	 * @param cargo
	 * @param campañas
	 */
	public Paciente(String nombre, String apellido, String cargo, Campaña campañas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cargo = cargo;
		this.campañas = campañas;
	}
	@Override
	public String toString() {
		return "PersonalMyP [nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + ", campañas="
				+ campañas + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Campaña getCampañas() {
		return campañas;
	}
	public void setCampañas(Campaña campañas) {
		this.campañas = campañas;
	}
	
	
}
