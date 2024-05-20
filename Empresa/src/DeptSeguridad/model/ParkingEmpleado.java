package DeptSeguridad.model;

public class ParkingEmpleado extends Empleado {
	private Parking parking;

	@Override
	public String toString() {
		return super.toString() + ", Cantidad de plantas: " + parking.getCantPlantas() + ", Cantidad de carros: " + parking.getCantCarros();
	}
	/**
	 * @param nombre
	 * @param horasTrabajadas
	 * @param salario
	 * @param parking
	 */
	public ParkingEmpleado(String nombre, int horasTrabajadas, int salario, Parking parking) {
		super(nombre, horasTrabajadas, salario);
		this.parking = parking;
	}

	/**
	 * @return the parking
	 */
	public Parking getParking() {
		return parking;
	}

	/**
	 * @param parking the parking to set
	 */
	public void setParking(Parking parking) {
		this.parking = parking;
	}

}
