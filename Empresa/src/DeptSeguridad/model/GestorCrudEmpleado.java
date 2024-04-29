package DeptSeguridad.model;

import java.util.List;


import common.model.IGestorCrud;

public class GestorCrudEmpleado implements IGestorCrud{
	private List<Empleado> empleados;

	public GestorCrudEmpleado(List<Empleado> empleados) {
		super();
		this.empleados = empleados;
	}
	public void create(Object elemento) {
		empleados.add((Empleado)elemento);
	}
	/**
	 * @return devuelve la lista
	 */
	public String read() {
		String sRet="";
		for(int i=0;i<empleados.size();i++)
			sRet+=i+". "+empleados.get(i)+"\r\n";
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
		if (pos>=0 && pos<empleados.size()) {
			empleados.set(pos, (Empleado)e);
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
		if (pos>=0 && pos<empleados.size()) {
			empleados.remove(pos);
			bRet=true;
		}
		return bRet;
	}
}
