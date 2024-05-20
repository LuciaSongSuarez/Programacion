package departamentoRH.model;

public class EmpleadoTemporal extends EmpleadoRH{
	private ContratoTemporal cTem;

	/**
	 * @param nombre
	 * @param salario
	 * @param departamento
	 * @param duracionContrato
	 * @param cTem
	 */
	public EmpleadoTemporal(String nombre, int salario, String departamento, int duracionContrato,
			ContratoTemporal cTem) {
		super(nombre, salario, departamento, duracionContrato);
		this.cTem = cTem;
	}
	@Override
	public String toString() {
		return super.toString()+"EmpleadoTemporal [cTem=" + cTem + "]";
	}
	/**
	 * @return the cTem
	 */
	public ContratoTemporal getcTem() {
		return cTem;
	}

	/**
	 * @param cTem the cTem to set
	 */
	public void setcTem(ContratoTemporal cTem) {
		this.cTem = cTem;
	}
}
