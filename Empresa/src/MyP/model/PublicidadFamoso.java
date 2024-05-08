package MyP.model;

public class PublicidadFamoso extends Publicidad{
	private Famoso famosos;

	/**
	 * @param famosos
	 */
	public PublicidadFamoso(String formato,String RRSS, Famoso famosos) {
		super(formato,RRSS);
		this.famosos = famosos;
	}

	@Override
	public String toString() {
		return super.toString ()+" " + famosos;
	}

	public Famoso getFamosos() {
		return famosos;
	}

	public void setFamosos(Famoso famosos) {
		this.famosos = famosos;
	}
	
	
}
