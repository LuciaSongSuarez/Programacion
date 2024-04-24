package common.model;
import java.util.List;


//VIsta interraciona con el usuario
//Modelo no
public class GestorCrud {
	private List<Medicamento> list;
	private int size;
	/**
	 * 
	 * @param list Element List
	 */

	public GestorCrud(List<Medicamento> list) {
		this.list=list;
		size=0;
	}

	public boolean modificar(int pos, Medicamento e) {
		boolean bRet =false;
		if(pos>=0 &&pos<list.size()) {
			list.set(pos, e);
			bRet=true;
		}
		return bRet;
	}
	
	/**
	 * @return devuelve la lista
	 */
	public String listar() {
		String sRet="";

		for (int i=0;i<list.size();i++) {
			sRet+=i+". "+list.get(i)+"\r\n";

		}
		return sRet;
	}

	public void agregar(Medicamento elemento) {
		list.add(elemento);



	}
	public boolean eliminar(int pos) {
		boolean bRet=false;
		
			if(pos>=0 && pos<list.size()) {
				list.remove(pos);
				bRet=true;
			}
		
		return bRet;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}




}