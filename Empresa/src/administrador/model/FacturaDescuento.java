package administrador.model;

public class FacturaDescuento extends Factura{
	private int descuento;

	public FacturaDescuento(int precio, String nombreProyecto, int descuento) {
		super(precio, nombreProyecto);
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return super.toString() +" "+ descuento;
	}

	/**
	 * @return the descuento
	 */
	public int getDescuento() {
		return descuento;
	}

	/**
	 * @param descuento the descuento to set
	 */
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
}
