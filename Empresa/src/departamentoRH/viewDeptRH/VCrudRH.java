package departamentoRH.viewDeptRH;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import departamentoRH.model.EmpleadoRH;
import departamentoRH.model.GestorCrudRH;
import common.model.IGestorCrud;

public class VCrudRH {
	private IGestorCrud gestor;
	private Scanner sc;
	/**
	 * @param gc
	 * @param sc
	 */
	public VCrudRH(IGestorCrud gc) {
		this.gestor = gc;
		sc = new Scanner(System.in);
	}

	/**
	 * muestra menu principal
	 * @return opcion seleccionada o -1 si da un error
	 */
	public int menuOpcion() {
		try {
			System.out.println("Introduce una opcion");
			System.out.println("1. Contratar (C)"); 
			System.out.println("2. Read lista trabajadores (R)");
			System.out.println("3. Update (U)");
			System.out.println("4. Despedir (D)");
			System.out.println("0. Otra para salir");
			return sc.nextInt();
		} catch (Exception e) {
			System.out.println("Opcion erronea");
			sc=new Scanner(System.in); //inicializamos o capturamos toda la linea sc.nextLine()
			return -1;
		}
	}

	public void menu() {
		
		//bucle para pedir datos
		int opcion=menuOpcion();
		VMenuContratar menu= new VMenuContratar(gestor);
		VMenuDespedir menuDespedir= new VMenuDespedir(gestor);
		while(opcion!=0) {
			if (opcion==1) {
				menu.create();
			}
			else if (opcion==2) {
				menu.read();
			}
			else if (opcion==3) {
				menu.update();
			}
			else if (opcion==4) {
				int decision=menuDespedir.menuOpcion();
				if(decision==1)
					System.out.println("Usted no recibira compensacion economica");
				menuDespedir.delete();
			}
			opcion=menuOpcion();
		}
	}
}
