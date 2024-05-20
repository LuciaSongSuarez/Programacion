package DeptSeguridad.view;

import java.util.List;
import java.util.Scanner;

import DeptSeguridad.model.Empleado;

public class VCBDeptSeg {

	private List<Empleado> empleados;
	private Scanner teclado;
	
	/**
	 * @param empleados
	 * @param teclado
	 */
	public VCBDeptSeg(List<Empleado> empleados, Scanner teclado) {
		this.empleados = empleados;
		this.teclado = teclado;
	}
	public void menu() {
		int opcion= menuOpcion();
		VCambiar cmb = new VCambiar(empleados, teclado);
		VBorrar brr = new VBorrar(empleados, teclado);
		while(opcion!=0) {
			if (opcion==1) {
				//cambiar
				cmb.cambiar();
			}else if (opcion==2) {
				//borrar
				brr.borrar();
			}
			opcion=menuOpcion();
		}

	}
	public int menuOpcion() {
		try {
			System.out.println("\n1. Cambiar \n2. Borrar");
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
