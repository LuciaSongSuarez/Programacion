package departamentoRH.viewDeptRH;

import java.util.List;
import java.util.Scanner;

import departamentoRH.model.ContratoObra;
import departamentoRH.model.ContratoTemporal;
import departamentoRH.model.EmpleadoRH;
import common.model.IGestorCrud;


public class VMenuDespedir {
	private Scanner sc;
	private IGestorCrud gc;
	

	/**
	 * @param gc
	 */
	public VMenuDespedir(IGestorCrud gc) {
		this.sc = new Scanner(System.in);
		this.gc = gc;
	}


	/**
	 * muestra menu contratar
	 * @return opcion seleccionada o -1 si da un error
	 */
	public int menuOpcion() {
		try {
			System.out.println("Elige que tipo de despido quiere realizar");
			System.out.println("1. Despido procedente");
			System.out.println("2. Despido improcedente");
			System.out.println("0. Otra para salir");
			return sc.nextInt();
		} catch (Exception e) {
			System.out.println("Opcion erronea");
			sc=new Scanner(System.in); //inicializamos o capturamos toda la linea sc.nextLine()
			return -1;
		}
	}
	
	/**
	 * borra
	 * @param pos
	 * @return verdadero si borra
	 */
	public boolean delete() {
		boolean bRet=false;
		try {
			System.out.println("Introduce la pos");
			int pos=sc.nextInt();
			bRet=gc.delete(pos);
		}
		catch (Exception e) {
			System.out.println("Error en delete");
			sc=new Scanner (System.in);
		}
		return bRet;
	}
}
