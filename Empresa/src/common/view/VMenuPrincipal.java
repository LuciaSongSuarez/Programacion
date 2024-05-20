package common.view;
import java.util.ArrayList;


import java.util.List;
import java.util.Scanner;

import DeptSeguridad.view.VMenuPrincipalDeptSeg;
import administrador.model.GestorCrudAdmin;
import administrador.model.PersonalAdmin;
import administrador.view.VCrudAdmin;
import common.model.IGestorCrud;
import common.util.FileUtil;
import DeptSeguridad.model.Empleado;
import DeptSeguridad.model.GestorCrudEmpleado;
import MyP.model.GestorCrudMyP;
import MyP.model.Paciente;
import MyP.view.VMenuPrincipalMyP;
import departamentoRH.model.EmpleadoRH;
import departamentoRH.model.GestorCrudRH;
import departamentoRH.viewDeptRH.VCrudRH;


/**
 * Muestra menu principal
 */
public class VMenuPrincipal {
	private Scanner sc;
	private final static String pathAdmin="data\\administrador.dat";
	private final static String pathMyP="data\\mYp.dat";
	private final static String pathSeg="data\\seguridad.dat";
	private final static String pathRH="data\\RH.dat";
	private IGestorCrud gestorAdmin;
	private IGestorCrud gestorMyP;
	private IGestorCrud gestorSeguridad;
	private IGestorCrud gestorRH;

	/**
	 * @param sc
	 */
	public VMenuPrincipal(IGestorCrud igAdmin, IGestorCrud igMyP, IGestorCrud igSeguridad,IGestorCrud igRH ) {
		gestorAdmin=igAdmin;
		gestorMyP=igMyP;
		gestorSeguridad = igSeguridad;
		gestorRH=igRH;
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
		FileUtil fuSeg=new FileUtil(this.pathSeg);
		FileUtil fuRH=new FileUtil(this.pathRH);
		while(opcion!=0) {
			if (opcion==1) {
				//Lanzar menu Administracion
	
				VCrudAdmin principal=new VCrudAdmin(gestorAdmin);
				principal.menu();
			}
			else if (opcion==2) {
				//Lanzar menu Marketing y publicidad
				VMenuPrincipalMyP principal=new VMenuPrincipalMyP(gestorMyP);
				principal.menu();
			}
			else if (opcion==3) {
				//Lanzar menu Seguridad
				List<Empleado> listEmpleado=new ArrayList<Empleado>();
				VMenuPrincipalDeptSeg principal=new VMenuPrincipalDeptSeg(listEmpleado, gestorSeguridad );
				principal.menu();
			}
			else if (opcion==4) {
				//Lanzar menu Seguridad
				List<EmpleadoRH> listEmpleadoRH=new ArrayList<EmpleadoRH>();
				VCrudRH principal=new VCrudRH(gestorRH);
				principal.menu();
			}
			opcion=menuOpcion();
		}
	} 
	/**
	 * menu principal de opciones
	 * @return entero introducido o -1 si hay error
	 */
	public int menuOpcion() {
		try {
			System.out.println("Introduce una opcion");
			System.out.println("1. Ir al CRUD de administrador");
			System.out.println("2. Ir al CRUD de MyP");
			System.out.println("3. Ir al CRUD de Seguridad");
			System.out.println("4. Ir al CRUD de RH");
			System.out.println("0. Para salir");
			return sc.nextInt();
		}catch (Exception e) {
			System.out.println("Opcion erronea");
			sc=new Scanner(System.in); //inicializamos
			return -1;
		}
	}
	
	public static void main(String[] args) {
		
		List<PersonalAdmin> listAdmin=new ArrayList<PersonalAdmin>();

		List<Paciente> listMyP=new ArrayList<Paciente>();

		List<PersonalMyP> listMyP=new ArrayList<PersonalMyP>();
		List<Empleado> listEmpleado=new ArrayList<Empleado>();
<<<<<<< HEAD
		VMenuPrincipal principal=new VMenuPrincipal(new GestorCrudAdmin(listAdmin), new GestorCrudMyP(listMyP), new GestorCrudEmpleado(listEmpleado));
=======
		List<EmpleadoRH> listEmpleadoRH=new ArrayList<EmpleadoRH>();
		//Lanzar aplicacion
		VMenuPrincipal principal=new VMenuPrincipal(new GestorCrudAdmin(listAdmin), new GestorCrudMyP(listMyP), new GestorCrudEmpleado(listEmpleado), new GestorCrudRH(listEmpleadoRH));
>>>>>>> branch 'Principal' of https://github.com/LuciaSongSuarez/Programacion.git
		
		principal.menu();
	}
}
