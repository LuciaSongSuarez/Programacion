package departamentoRH.model;

public class ContratoObra {
	private int comidasGratis;

	/**
	 * @param comidasGratis
	 */
	public ContratoObra(int comidasGratis) {
		this.comidasGratis = comidasGratis;
	}

	@Override
	public String toString() {
		return "ContratoObra [comidasGratis=" + comidasGratis + "]";
	}

	/**
	 * @return the comidasGratis
	 */
	public int getComidasGratis() {
		return comidasGratis;
	}

	/**
	 * @param comidasGratis the comidasGratis to set
	 */
	public void setComidasGratis(int comidasGratis) {
		this.comidasGratis = comidasGratis;
	}

}
