package administrador.model;

public class Personal {
	private String nombre;
	private String departamento;
	private String cargo;
	private Organizacion organizacion;
	
	public Personal(String nombre, String departamento, String cargo, Organizacion organizacion) {
		super();
		this.nombre = nombre;
		this.departamento = departamento;
		this.cargo = cargo;
		this.organizacion = organizacion;
	}
	
	@Override
	public String toString() {
		return "Personal [nombre=" + nombre + ", departamento=" + departamento + ", cargo=" + cargo + ", organizacion=" + organizacion
				+ "]";
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the departamento
	 */
	public String getDepartamento() {
		return departamento;
	}
	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	/**
	 * @return the cargo
	 */
	public String getCargo() {
		return cargo;
	}
	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}
