package departamentoRH.model;

public class Departamento {

	private String nombredep;

	/**
	 * @param nombredep
	 */
	public Departamento(String nombredep) {
		this.nombredep = nombredep;
	}

	@Override
	public String toString() {
		return "Departamento [nombredep=" + nombredep + "]";
	}

	/**
	 * @return the nombredep
	 */
	public String getNombredep() {
		return nombredep;
	}

	/**
	 * @param nombredep the nombredep to set
	 */
	public void setNombredep(String nombredep) {
		this.nombredep = nombredep;
	}
	
}
