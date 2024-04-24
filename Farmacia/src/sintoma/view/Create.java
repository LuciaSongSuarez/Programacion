package sintoma.view;


import java.util.Scanner;

import sintoma.model.Sintoma;
import sintoma.model.GestorCrud;

public class Create {
	private GestorCrud gc;
	private Scanner sc;
	private int size;

	public Create(GestorCrud gc) {
		this.gc=gc;
		sc=new Scanner(System.in);
		size=0;
	}

	public int mostrarMenu() {
		try {
			System.out.println("Elige una opcion");
			System.out.println("1, agregar otra jaula de animales");
			System.out.println("2, listar jaulas de animales");
			System.out.println("3, editar alguna jaula de animales");
			System.out.println("4, eliminar alguna jaula de animales");
			System.out.println("0 para salir");
		}catch(Exception e) {

		}
		return sc.nextInt();

	}

	public boolean modificar() {
		boolean bRet =false;
		try {
			System.out.println("Introduce la pos");
			int pos=sc.nextInt();


			System.out.println("¿Nombre");
			String nombre=sc.next();
			System.out.println("Gravedad");
			String gravedad=sc.next();


			if(gc.modificar(pos, new Sintoma(nombre, gravedad))) {
				bRet=true;
			}

		}catch(Exception e) {

		}
		return bRet;
	}

	/**
	 * imprime por pantalla el array de aulas
	 */
	public void listar() {
		System.out.println(gc.listar());   
	}
	public void agregar() {
		try {

			System.out.println("¿Nombre");
			String nombre=sc.next();
			System.out.println(" gravedad");
			String gravedad=sc.next();	
			gc.agregar(new Sintoma(nombre, gravedad));

		}catch(Exception e) {

		}

	}
	public boolean eliminar() {
		boolean bRet=false;
		try {
			System.out.println("Número quieras eliminar");
			int num=sc.nextInt();
			if(gc.eliminar(num)) {
				bRet=true;
			}
		}catch(Exception e) {

		}


		return bRet;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}




}