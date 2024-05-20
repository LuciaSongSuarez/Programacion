package DeptSeguridad.view;

import java.util.List;
import java.util.Scanner;

import DeptSeguridad.model.Empleado;
import DeptSeguridad.model.Parking;
import DeptSeguridad.model.ParkingEmpleado;
import DeptSeguridad.model.Software;
import DeptSeguridad.model.SoftwareEmpleado;


public class VCambiar {

	private List<Empleado> empleados;
	private Scanner teclado;
	
	/**
	 * @param empleados
	 * @param teclado
	 */
	public VCambiar(List<Empleado> empleados, Scanner teclado) {
		this.empleados = empleados;
		this.teclado = teclado;
	}
	public void cambiar () {
		int posCambiar;
		
		try {
			System.out.println("Introduce la nueva info : ");
			System.out.println("Que posicion quieres cambiar? " + ((0) +"," +(empleados.size()-1)));
			posCambiar = teclado.nextInt();
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
				int cantCompu =0;
				Empleado empleado =null;
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
					System.out.println("Lenguaje de Software:");
					cantCompu = teclado.nextInt();
					empleado = new SoftwareEmpleado (nombre, horasTrabajadas, salario, new Software (lengSoft, cantCompu));
					break;
			}
			empleados.set(posCambiar, empleado);
			
			for (int i = 0; i < empleados.size(); i++) {
			    System.out.println(empleados.get(i));
			}
		}catch (Exception e) {
			System.out.println("Error: " + e.toString());
			teclado = new Scanner(System.in);
		}

	}
}
