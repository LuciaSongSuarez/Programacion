package DeptSeguridad.view;

import java.util.List;
import java.util.Scanner;

import DeptSeguridad.model.Empleado;

public class VBorrar {

	private List<Empleado> empleados;
	private Scanner teclado;
	
	/**
	 * @param empleados
	 * @param teclado
	 */
	public VBorrar(List<Empleado> empleados, Scanner teclado) {
		this.empleados = empleados;
		this.teclado = teclado;
	}
	
	public void borrar () {
		try {
			System.out.println("Que posicion quieres cambiar? " + ((0) +"," +(empleados.size()-1)));
			int posBorrar = teclado.nextInt();
			empleados.remove(posBorrar);

			for (int i = 0; i < empleados.size(); i++) {
			    System.out.println(empleados.get(i));
			}
		}  catch (Exception e) {
			System.out.println("Error: " + e.toString());
			teclado = new Scanner (System.in);
		}

	}
}
