package administrador.model;

public class Clientes {
	private String nombreCliente;
	private String nombreEmpresa;
	private Factura factura;
	public Clientes(String nombreCliente, String nombreEmpresa, Factura factura) {
		super();
		this.nombreCliente = nombreCliente;
		this.nombreEmpresa = nombreEmpresa;
		this.factura = factura;
		
	}
	@Override
	public String toString() {
		return " [nombreCliente=" + nombreCliente + ", nombreEmpresa=" + nombreEmpresa + ", factura=" + factura
				+ "]";
	}
	/**
	 * @return the nombreCliente
	 */
	public String getNombreCliente() {
		return nombreCliente;
	}
	/**
	 * @param nombreCliente the nombreCliente to set
	 */
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	/**
	 * @return the factura
	 */
	public Factura getFactura() {
		return factura;
	}
	/**
	 * @param factura the factura to set
	 */
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	
	
}
