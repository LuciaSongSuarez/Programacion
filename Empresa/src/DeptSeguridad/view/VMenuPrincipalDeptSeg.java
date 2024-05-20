package DeptSeguridad.view;


import java.util.List;
import java.util.Scanner;

import DeptSeguridad.model.Empleado;
import common.model.IGestorCrud;

public class VMenuPrincipalDeptSeg {
	private List<Empleado> empleados;
	IGestorCrud gestor;
	private Scanner teclado;

	/**
	 * @param empleados
	 */
	public VMenuPrincipalDeptSeg(List<Empleado> empleados, IGestorCrud gestor) {
		this.gestor =  gestor;
		this.empleados = empleados;
		teclado = new Scanner (System.in);
	}
	
	public void menu() {
		int opcion= menuOpcion();
		VCBDeptSeg vcb=new VCBDeptSeg(empleados, teclado);
		VCrear crear = new VCrear(empleados, gestor);
		while(opcion!=0) {
			if (opcion==1) {
				//crear
				crear.crear();
				vcb.menu();
			}
			opcion=menuOpcion();
		}
	}
	public int menuOpcion() {
		try {
			System.out.println("\n1. Crear ");
			System.out.println("0. Volver");
			int iRet=teclado.nextInt();
			return iRet;
		}catch (Exception e) {
			System.out.println("Error: " + e.toString());
			teclado = new Scanner (System.in);
			return -1;
		}
	}
}
