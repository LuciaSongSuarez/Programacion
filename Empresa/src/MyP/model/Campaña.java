package MyP.model;

public class Campaña {
	private String nombre;
	private String fecha;
	private String hora;
	private Publicidad publicidades;
	/**
	 * @param nombre
	 * @param fecha
	 * @param hora
	 * @param publicidades
	 */
	public Campaña(String nombre, String fecha, String hora, Publicidad publicidades) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.hora = hora;
		this.publicidades = publicidades;
	}
	@Override
	public String toString() {
		return "Campaña [nombre=" + nombre + ", fecha=" + fecha + ", hora=" + hora + ", publicidades=" + publicidades
				+ "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public Publicidad getPublicidades() {
		return publicidades;
	}
	public void setPublicidades(Publicidad publicidades) {
		this.publicidades = publicidades;
	}
	
}
