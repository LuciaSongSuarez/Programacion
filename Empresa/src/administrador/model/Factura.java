package administrador.model;

public class Factura {
	private int precio;
	private String nombreProyecto;
	
	public Factura(int precio, String nombreProyecto) {
		this.precio = precio;
		this.nombreProyecto = nombreProyecto;
	}
	
	@Override
	public String toString() {
		return "Factura [precio=" + precio + ", nombreProyecto=" + nombreProyecto + "]";
	}

	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	/**
	 * @return the nombreProyecto
	 */
	public String getNombreProyecto() {
		return nombreProyecto;
	}
	/**
	 * @param nombreProyecto the nombreProyecto to set
	 */
	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}
	
}
