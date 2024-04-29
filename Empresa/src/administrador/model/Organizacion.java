package administrador.model;

public class Organizacion {
	private Cliente clientes;
	private Recurso recursos;
	private Evento eventos;
	private String fecha;
	//Constructor Organizacion de clientes
	public Organizacion(Cliente cliente, String fecha) {
		super();
		this.clientes = cliente;
		this.fecha = fecha;
	}
	

	//Constructor Organizacion de recursos
	public Organizacion(Recurso recurso, String fecha) {
		super();
		this.recursos = recurso;
		this.fecha = fecha;
	}
	
	//Constructor Organizacion de eventos
	public Organizacion(Evento evento, String fecha) {
		super();
		this.eventos = evento;
		this.fecha = fecha;
	}



	@Override
	public String toString() {
		String sCliente=(clientes==null)?"no hay":clientes.toString();
		String sRecurso=(recursos==null)?"no hay":recursos.toString();
		String sEvento=(eventos==null)?"no hay":eventos.toString();
		return "Organizacion [cliente=" + sCliente+ ", recurso=" + sRecurso + ", evento=" + sEvento + ", fecha=" + fecha
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
