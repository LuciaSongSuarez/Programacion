package administrador.model;

public class Recursos {
	private String nomRecurso;
	private int cantidad;
	private int duracion;
	public Recursos(String nomRecurso, int cantidad, int duracion) {
		super();
		this.nomRecurso = nomRecurso;
		this.cantidad = cantidad;
		this.duracion = duracion;
	}
	@Override
	public String toString() {
		return "[nomRecurso=" + nomRecurso + ", cantidad=" + cantidad + ", duracion=" + duracion + "]";
	}
	/**
	 * @return the nomRecurso
	 */
	public String getNomRecurso() {
		return nomRecurso;
	}
	/**
	 * @param nomRecurso the nomRecurso to set
	 */
	public void setNomRecurso(String nomRecurso) {
		this.nomRecurso = nomRecurso;
	}
	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}
	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
}
