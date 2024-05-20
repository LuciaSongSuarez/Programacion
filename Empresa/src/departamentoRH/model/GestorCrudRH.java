package departamentoRH.model;
import java.util.ArrayList;
import java.util.List;

import common.model.IGestorCrud;

public class GestorCrudRH implements IGestorCrud{
	private List<EmpleadoRH> list;
	/**
	 * @param list Element List
	 * Constructor
	 */
	public GestorCrudRH(List<EmpleadoRH> list) { //Decaramos lista de empleados
		super();
		this.list = new ArrayList<>();
	}
	
	/**
	 * 
	 * @param elemento
	 */
	public void create(Object elemento) {
		list.add((EmpleadoRH)elemento);
	}
	/**
	 * @return devuelve la lista
	 */
	public String read() {
		String sRet="";
		for(int i=0;i<list.size();i++) {
			sRet+=i+". "+list.get(i)+"\r\n";
		}
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
			list.set(pos, (EmpleadoRH)e);
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
