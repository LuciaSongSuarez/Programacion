package DeptSeguridad.model;

public class Empleado {
	private String nombre;
	private int horasTrabajadas;
	private int salario;
	
	@Override
	public String toString() {
		return "Nombre: "+ nombre + ", Horas trabajadas: " + horasTrabajadas +", Salario: " + salario;
	}
	/**
	 * @param nombre
	 * @param horasTrabajadas
	 * @param salario
	 */
	public Empleado(String nombre, int horasTrabajadas, int salario) {
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		this.salario = salario;
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
	 * @return the horasTrabajadas
	 */
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	/**
	 * @param horasTrabajadas the horasTrabajadas to set
	 */
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	/**
	 * @return the salario
	 */
	public int getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}

}
