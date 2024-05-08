package DeptSeguridad.model;

public class Parking {
	private int cantPlantas;
	private int cantCarros;

	/**
	 * @param cantPlantas
	 * @param cantCarros
	 */
	public Parking(int cantPlantas, int cantCarros) {
		this.cantPlantas = cantPlantas;
		this.cantCarros = cantCarros;
	}
	/**
	 * @return the cantPlantas
	 */
	public int getCantPlantas() {
		return cantPlantas;
	}
	/**
	 * @param cantPlantas the cantPlantas to set
	 */
	public void setCantPlantas(int cantPlantas) {
		this.cantPlantas = cantPlantas;
	}
	/**
	 * @return the cantCarros
	 */
	public int getCantCarros() {
		return cantCarros;
	}
	/**
	 * @param cantCarros the cantCarros to set
	 */
	public void setCantCarros(int cantCarros) {
		this.cantCarros = cantCarros;
	}

}
