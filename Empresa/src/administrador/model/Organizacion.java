package administrador.model;

public class Organizacion {
	private Clientes cliente;
	private Recursos recurso;
	private Eventos evento;
	private String fecha;
	//Constructor Organizacion de clientes
	public Organizacion(Clientes cliente, String fecha) {
		super();
		this.cliente = cliente;
		this.fecha = fecha;
	}
	

	//Constructor Organizacion de recursos
	public Organizacion(Recursos recurso, String fecha) {
		super();
		this.recurso = recurso;
		this.fecha = fecha;
	}
	
	//Constructor Organizacion de eventos
	public Organizacion(Eventos evento, String fecha) {
		super();
		this.evento = evento;
		this.fecha = fecha;
	}



	@Override
	public String toString() {
		return "Organizacion [cliente=" + cliente + ", recurso=" + recurso + ", evento=" + evento + ", fecha=" + fecha
				+ "]";
	}


	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}


	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
}
