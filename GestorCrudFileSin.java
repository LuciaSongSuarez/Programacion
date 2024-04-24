package sintoma.model;
import java.util.List;

import common.model.IGestorCrud;
import common.util.FileUtil;

public class GestorCrudFileSin implements IGestorCrud{
	private List<Sintoma> list;
	private String path;
	/**
	 * Constructor
	 *@param meds Element List
	 */
	public GestorCrudFileSin(List<Sintoma> list, String path) {
		this.list = list;
		this.path=path;
	}
	/**
	 * agrega elementos
	 * @param med elemento
	 */
	public void create(Object elemento) {
		list.add((Sintoma)elemento);
		FileUtil fu=new FileUtil(path);
		fu.save(list);
	}
	/**
	 * @return devuelve la lista
	 */
	public String read() {
		FileUtil fu=new FileUtil(path);
		list=fu.readList();
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
			list.set(pos, (Sintoma)e);
			bRet=true;
			FileUtil fu=new FileUtil(path);
			fu.save(list);
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
			FileUtil fu=new FileUtil(path);
			fu.save(list);
		}
		return bRet;
	}
}
