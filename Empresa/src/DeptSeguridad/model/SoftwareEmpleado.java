package DeptSeguridad.model;

public class SoftwareEmpleado extends Empleado {

	private Software software;
	public String toString () {
		return super.toString() + ", Lenguaje software: "+ software.getLenguajeSoftware() + ", Cantidad de computadoras: " + software.getCantCompu() ;
	}
	/**
	 * @param nombre
	 * @param horasTrabajadas
	 * @param salario
	 * @param software
	 */
	public SoftwareEmpleado(String nombre, int horasTrabajadas, int salario, Software software) {
		super(nombre, horasTrabajadas, salario);
		this.software = software;
	}

	/**
	 * @return the software
	 */
	public Software getSoftware() {
		return software;
	}

	/**
	 * @param software the software to set
	 */
	public void setSoftware(Software software) {
		this.software = software;
	}

}
