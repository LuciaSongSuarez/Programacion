package departamentoRH.model;

public class EmpleadoObra extends EmpleadoRH{
	private ContratoObra cObr;

	/**
	 * @param nombre
	 * @param salario
	 * @param departamento
	 * @param duracionContrato
	 * @param cObr
	 */
	public EmpleadoObra(String nombre, int salario, String departamento, int duracionContrato, ContratoObra cObr) {
		super(nombre, salario, departamento, duracionContrato);
		this.cObr = cObr;
	}

	@Override
	public String toString() {
		return super.toString()+" ,EmpleadoObra [cObr=" + cObr + "]";
	}

	/**
	 * @return the cObr
	 */
	public ContratoObra getcObr() {
		return cObr;
	}

	/**
	 * @param cObr the cObr to set
	 */
	public void setcObr(ContratoObra cObr) {
		this.cObr = cObr;
	}
}
