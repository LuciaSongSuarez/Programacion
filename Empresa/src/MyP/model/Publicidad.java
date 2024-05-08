package MyP.model;

public class Publicidad {
	private String formato;
	private String RRSS;
	/**
	 * @param formato
	 * @param rRSS
	 */
	public Publicidad(String formato, String rRSS) {
		super();
		this.formato = formato;
		RRSS = rRSS;
	}
	@Override
	public String toString() {
		return "Publicidad [formato=" + formato + ", RRSS=" + RRSS + "]";
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getRRSS() {
		return RRSS;
	}
	public void setRRSS(String rRSS) {
		RRSS = rRSS;
	}
	
}
