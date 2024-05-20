package departamentoRH.model;

public class EmpleadoRH {

	private String nombre;
	private int salario;
	private String departamento;
	private int duracionContrato;
	/**
	 * @param nombre
	 * @param salario
	 * @param departamento
	 * @param duracionContrato
	 */
	public EmpleadoRH(String nombre, int salario, String departamento, int duracionContrato) {
		this.nombre = nombre;
		this.salario = salario;
		this.departamento = departamento;
		this.duracionContrato = duracionContrato;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", salario=" + salario + ", departamento=" + departamento
				+ ", duracionContrato=" + duracionContrato + "]";
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
	 * @return the duracionContrato
	 */
	public int getDuracionContrato() {
		return duracionContrato;
	}
	/**
	 * @param duracionContrato the duracionContrato to set
	 */
	public void setDuracionContrato(int duracionContrato) {
		this.duracionContrato = duracionContrato;
	}
}
