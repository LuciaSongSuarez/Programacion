package common.view;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import administrador.model.GestorCrudAdmin;
import administrador.model.Personal;
import administrador.view.VMenuPrincipalAdmin;
import common.model.IGestorCrud;
import common.util.FileUtil;



/**
 * Muestra menu principal
 */
public class VMenuPrincipal {
	private Scanner sc;
	private final static String pathAdmin="data\\administrador.dat";
	//private final static String pathSin="data\\sintomas.dat";
	private IGestorCrud gestorAdmin;

	/**
	 * @param sc
	 */
	public VMenuPrincipal(IGestorCrud igAdmin) {
		gestorAdmin=igAdmin;
		this.sc = new Scanner(System.in);
	}
	/**
	 * Decide la opcion en funcion del menu
	 */
	public void menu() {
		//bucle para pedir datos
		int opcion=menuOpcion();
		FileUtil fuMed=new FileUtil(this.pathAdmin);
		while(opcion!=0) {
			if (opcion==1) {
				//Lanzar menu sintoma
				VMenuPrincipalAdmin principal=new VMenuPrincipalAdmin(gestorAdmin);
				principal.menu();
			}
			opcion=menuOpcion();
		}
	} 
	/**
	 * menu principal de opciones>
	 * @return entero introducido o -1 si hay error
	 */
	public int menuOpcion() {
		try {
			System.out.println("Introduce una opcion");
			System.out.println("1. Ir al CRUD de administrador");
			System.out.println("0. Para salir");
			return sc.nextInt();
		}catch (Exception e) {
			System.out.println("Opcion erronea");
			sc=new Scanner(System.in); //inicializamos
			return -1;
		}
	}
	
	public static void main(String[] args) {
		//Lista de sintomas
		List<Personal> listAdmin=new ArrayList<Personal>();
		//Lanzar aplicacion
		VMenuPrincipal principal=new VMenuPrincipal(new GestorCrudAdmin(listAdmin));
		principal.menu();
	}
}
