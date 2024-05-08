package MyP.model;

public class Famoso {
	private String nombre;
	private String RedSocial;
	private String profesion;
	private String genero;
	/**
	 * @param nombre
	 * @param redSocial
	 * @param profesion
	 * @param genero
	 */
	public Famoso(String nombre, String redSocial, String profesion, String genero) {
		super();
		this.nombre = nombre;
		RedSocial = redSocial;
		this.profesion = profesion;
		this.genero = genero;
	}
	@Override
	public String toString() {
		return "Famoso [nombre=" + nombre + ", RedSocial=" + RedSocial + ", profesion=" + profesion + ", genero=" + genero
				+ "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRedSocial() {
		return RedSocial;
	}
	public void setRedSocial(String redSocial) {
		RedSocial = redSocial;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

}
