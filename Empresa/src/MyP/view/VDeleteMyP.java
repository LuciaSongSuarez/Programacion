package MyP.view;

import java.util.Scanner;

import MyP.model.Campaña;
import MyP.model.Famoso;
import MyP.model.PersonalMyP;
import MyP.model.Publicidad;
import MyP.model.PublicidadFamoso;
import common.model.IGestorCrud;

public class VDeleteMyP {
	private Scanner sc;
	private IGestorCrud gc;
	public VDeleteMyP(IGestorCrud gestor) {
		super();
		this.gc = gestor;
		this.sc = new Scanner(System.in);
	}

	/**
	 * muestra menu principal
	 * @return opcion seleccionada o -1 si da un error
	 */
	public boolean menu() {
		boolean bRet=false;
		try {
			System.out.println("Introduce la pos");
			int pos=sc.nextInt();
			bRet=gc.delete(pos);
		} catch (Exception e) {
			System.out.println("Error en delete");
			sc=new Scanner(System.in); //inicializamos o capturamos toda la linea sc.nextLine()
		}
		return bRet;
	}

}
