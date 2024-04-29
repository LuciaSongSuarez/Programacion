package DeptSeguridad.view;


import java.util.List;
import java.util.Scanner;

import DeptSeguridad.model.Empleado;
import DeptSeguridad.model.Parking;
import DeptSeguridad.model.ParkingEmpleado;
import DeptSeguridad.model.Software;
import DeptSeguridad.model.SoftwareEmpleado;
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
		while(opcion!=0) {
			if (opcion==1) {
				//crear
				crear();
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
	public void crear() {
		int numCrear= 0;
		try {
			System.out.println("Cuantos empleados tiene?");
			numCrear = teclado.nextInt();
			for (int i =0; i<numCrear; i++) {
				System.out.println("Nombre");
				String nombre = teclado.next();
				System.out.println("Horas trabajadas:");	
				int horasTrabajadas = teclado.nextInt();
				System.out.println("Salario:");
				int salario = teclado.nextInt();
				System.out.println("Que tipo de empleado de Seguridad es?"); 
				System.out.println("\n1. Normal \n2. De parking \n3. De software");
				int eleccion = teclado.nextInt();
				int cantPlantas = 0;
				int cantCarros = 0;
				String lengSoft = "";
				int cantCompu = 0;
				Empleado empleado = null;
				switch (eleccion) {
				case 1:
					empleado = new Empleado(nombre, horasTrabajadas, salario);
					break;
				case 2:
					System.out.println("Cantidad de plantas del parking:");
					cantPlantas = teclado.nextInt();
					System.out.println("Cantidad de carros:");
					cantCarros = teclado.nextInt();
					empleado = new ParkingEmpleado (nombre, horasTrabajadas, salario, new Parking (cantPlantas, cantCarros));
					break;
				case 3:
					System.out.println("Lenguaje de Software:");
					lengSoft = teclado.next();
					System.out.println("Cantidad de computadoras:");
					cantCompu = teclado.nextInt();
					empleado = new SoftwareEmpleado (nombre, horasTrabajadas, salario, new Software (lengSoft, cantCompu));
					break;
				}
				empleados.add(empleado);
				
			}
			for (int i = 0; i < empleados.size(); i++) {
			    System.out.println(empleados.get(i));
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.toString());
			teclado = new Scanner (System.in);
		}

	}
}
