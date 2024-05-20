package departamentoRH.model;

public class EmpleadoIndefinido extends EmpleadoRH{

	private ContratoIndefinido cInd;

	/**
	 * @param nombre
	 * @param salario
	 * @param departamento
	 * @param duracionContrato
	 * @param cInd
	 */
	public EmpleadoIndefinido(String nombre, int salario, String departamento, int duracionContrato,
			ContratoIndefinido cInd) {
		super(nombre, salario, departamento, duracionContrato);
		this.cInd = cInd;
	}

	@Override
	public String toString() {
		return super.toString()+" ,EmpleadoIndefinido [cInd=" + cInd + "]";
	}

	/**
	 * @return the cInd
	 */
	public ContratoIndefinido getcInd() {
		return cInd;
	}

	/**
	 * @param cInd the cInd to set
	 */
	public void setcInd(ContratoIndefinido cInd) {
		this.cInd = cInd;
	}
}
