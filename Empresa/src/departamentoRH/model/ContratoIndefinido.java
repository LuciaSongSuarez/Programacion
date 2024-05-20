package departamentoRH.model;

public class ContratoIndefinido {
	private int diasDeParking;

	/**
	 * @param diasDeParking
	 */
	public ContratoIndefinido(int diasDeParking) {
		this.diasDeParking = diasDeParking;
	}

	@Override
	public String toString() {
		return "ContratoIndefinido [diasDeParking=" + diasDeParking + "]";
	}

	/**
	 * @return the diasDeParking
	 */
	public int getDiasDeParking() {
		return diasDeParking;
	}

	/**
	 * @param diasDeParking the diasDeParking to set
	 */
	public void setDiasDeParking(int diasDeParking) {
		this.diasDeParking = diasDeParking;
	}
}
