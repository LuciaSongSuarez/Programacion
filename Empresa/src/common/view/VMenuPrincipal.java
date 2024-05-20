package common.view;

import java.util.ArrayList;


import java.util.List;
import java.util.Scanner;

import administrador.model.GestorCrudAdmin;
import administrador.model.PersonalAdmin;
import administrador.view.VMenuPrincipalAdmin;
import common.model.IGestorCrud;
import common.util.FileUtil;
import MyP.model.GestorCrudMyP;
import MyP.model.Paciente;
import MyP.view.VMenuPrincipalMyP;


/**
 * Muestra menu principal
 */
public class VMenuPrincipal {
	private Scanner sc;
	private final static String pathAdmin="data\\administrador.dat";
	private final static String pathMyP="data\\mYp.dat";
	//private final static String pathSin="data\\sintomas.dat";
	private IGestorCrud gestorAdmin;
	private IGestorCrud gestorMyP;

	/**
	 * @param sc
	 */
	public VMenuPrincipal(IGestorCrud igAdmin, IGestorCrud igMyP) {
		gestorAdmin=igAdmin;
		gestorMyP=igMyP;
		this.sc = new Scanner(System.in);
	}
	
	/**
	 * Decide la opcion en funcion del menu
	 */
	public void menu() {
		//bucle para pedir datos
		int opcion=menuOpcion();
		FileUtil fuMed=new FileUtil(this.pathAdmin);
		FileUtil fuMyP=new FileUtil(this.pathMyP);
		while(opcion!=0) {
			if (opcion==1) {
				//Lanzar menu sintoma
				VMenuPrincipalAdmin principal=new VMenuPrincipalAdmin(gestorAdmin);
				principal.menu();
			}
			else if (opcion==2) {
				//Lanzar menu sintoma
				VMenuPrincipalMyP principal=new VMenuPrincipalMyP(gestorMyP);
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
			System.out.println("2. Ir al CRUD de MyP");
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
		List<PersonalAdmin> listAdmin=new ArrayList<PersonalAdmin>();
		List<Paciente> listMyP=new ArrayList<Paciente>();
		//Lanzar aplicacion
		VMenuPrincipal principal=new VMenuPrincipal(new GestorCrudAdmin(listAdmin), new GestorCrudMyP(listMyP));
		
		principal.menu();
	}
}
