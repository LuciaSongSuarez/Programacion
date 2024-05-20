package MyP.model;

import java.util.List;

import common.model.IGestorCrud;

public class GestorCrudMyP implements IGestorCrud{
	private List<Paciente> list;

	public GestorCrudMyP(List<Paciente> list) {
		super();
		this.list = list;
	}
	public void create(Object elemento) {
		list.add((Paciente)elemento);
	}
	/**
	 * @return devuelve la lista
	 */
	public String read() {
		String sRet="";
		for(int i=0;i<list.size();i++)
			sRet+=i+". "+list.get(i)+"\r\n";
		return sRet;
	}
	/**
	 * actualiza
	 * @param pos posicion a actualizar (0..size-1)
	 * @param e elemento a actualizar
	 * @return verdadero si actualiza
	 */
	public boolean update(int pos, Object e) {
		boolean bRet=false;
		if (pos>=0 && pos<list.size()) {
			list.set(pos, (Paciente)e);
			bRet=true;
		}
		return bRet;
	}
	/**
	 * borra
	 * @param pos
	 * @return verdadero si borra
	 */
	public boolean delete(int pos) {
		boolean bRet=false;
		if (pos>=0 && pos<list.size()) {
			list.remove(pos);
			bRet=true;
		}
		return bRet;
	}
}
