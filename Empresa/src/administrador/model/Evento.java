package administrador.model;

public class Evento {
	private String nombreEvento;
	private int numPersona;
	private String lugar;
	public Evento(String nombreEvento, int numPersona, String lugar) {
		super();
		this.nombreEvento = nombreEvento;
		this.numPersona = numPersona;
		this.lugar = lugar;
	}
	@Override
	public String toString() {
		return "[nombreEvento=" + nombreEvento + ", numPersona=" + numPersona + ", lugar=" + lugar + "]";
	}
	/**
	 * @return the nombreEvento
	 */
	public String getNombreEvento() {
		return nombreEvento;
	}
	/**
	 * @param nombreEvento the nombreEvento to set
	 */
	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}
	/**
	 * @return the numPersona
	 */
	public int getNumPersona() {
		return numPersona;
	}
	/**
	 * @param numPersona the numPersona to set
	 */
	public void setNumPersona(int numPersona) {
		this.numPersona = numPersona;
	}
	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}
	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
}
