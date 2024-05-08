package administrador.view;

import java.util.Scanner;

import common.model.IGestorCrud;


public class VCrudAdmin {
	private Scanner sc;
	IGestorCrud gestor;
		public VCrudAdmin(IGestorCrud gestor) {
			this.gestor=gestor;
			this.sc = new Scanner(System.in);
		}

		public void menu() {
			//creamos la instancia para pedir los datos
			VCreateAdmin datos=new VCreateAdmin(gestor);
			//bucle para pedir datos
			int opcion=menuOpcion();
			while(opcion!=0) {
				if (opcion==1) {
					VCreateAdmin vCreate=new VCreateAdmin(gestor);
					vCreate.menu();
					}
				else if (opcion==2){
					VReadAdmin vCreate=new VReadAdmin(gestor);
					vCreate.menu();
					}
				else if (opcion==3){
					VReadAdmin vCreate=new VReadAdmin(gestor);
					vCreate.menu();
					}
				else if (opcion==4){
					VUpdateAdmin vCreate=new VUpdateAdmin(gestor);
					vCreate.menu();
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
