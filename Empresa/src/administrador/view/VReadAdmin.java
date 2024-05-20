package administrador.view;
import java.util.Scanner;

import common.model.IGestorCrud;



public class VReadAdmin {
	private IGestorCrud gc;
	private Scanner sc;
	public VReadAdmin(IGestorCrud gestor) {
		this.gc = gestor;
		this.sc = new Scanner(System.in);
	}

	/**
	 * muestra menu principal
	 * @return opcion seleccionada o -1 si da un error
	 */


	public void menu() {
		System.out.println(gc.read());
	}


}
