package departamentoRH.model;

public class ContratoTemporal {
	private int cocheGratis;

	/**
	 * @param cocheGratis
	 */
	public ContratoTemporal(int cocheGratis) {
		this.cocheGratis = cocheGratis;
	}

	@Override
	public String toString() {
		return "ContratoTemporal [cocheGratis=" + cocheGratis + "]";
	}

	/**
	 * @return the cocheGratis
	 */
	public int getCocheGratis() {
		return cocheGratis;
	}

	/**
	 * @param cocheGratis the cocheGratis to set
	 */
	public void setCocheGratis(int cocheGratis) {
		this.cocheGratis = cocheGratis;
	}

	
}
