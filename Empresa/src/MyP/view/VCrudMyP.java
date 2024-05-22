package MyP.view;

import java.util.Scanner;
import administrador.view.VReadAdmin;
import common.model.IGestorCrud;



public class VCrudMyP {
	IGestorCrud gestor;
	private Scanner sc;
	public VCrudMyP(IGestorCrud gestor) {
		this.gestor=gestor;
		this.sc = new Scanner(System.in);
	}

	public void menu() {

		//bucle para pedir datos
		int opcion=menuOpcion();
		while(opcion!=0) {
			if (opcion==1) {
				VCreateMyP vCreateMyP= new VCreateMyP(gestor);
				vCreateMyP.menu();
			}
			else if (opcion==2){
				VReadMyP vReadMyP=new VReadMyP(gestor);
				vReadMyP.menu();
			}
			else if (opcion==3){
				VUpdateMyP vUpdateMyP=new VUpdateMyP(gestor);
				vUpdateMyP.menu();
			}
			else if (opcion==4){
				VDeleteMyP vDeleteMyP=new VDeleteMyP(gestor);
				vDeleteMyP.menu();
			}
			opcion=menuOpcion();
		}
	}
	public int menuOpcion() {
		try {
			System.out.println("Introduce una opcion");
			System.out.println("1. Create (C)");
			System.out.println("2. Read (R)");
			System.out.println("3. Update (U)");
			System.out.println("4. Delete (D)");
			System.out.println("0. Otra para salir");
			return sc.nextInt();
		} catch (Exception e) {
			System.out.println("Opcion erronea");
			sc=new Scanner(System.in); //inicializamos o capturamos toda la linea sc.nextLine()
			return -1;
		}
	}

}
