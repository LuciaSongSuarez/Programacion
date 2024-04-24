package medicamento.view;
import java.util.List;

import java.util.ArrayList;
import java.util.Scanner;

import medicamento.model.Enfermedad;
import medicamento.model.GestorCrud;
import medicamento.model.Medicamento;

public class Create {
	private medicamento.model.GestorCrud meds;
	private Scanner sc;
	private int size;

	public Create(medicamento.model.GestorCrud meds) {
		this.meds=meds;
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
			System.out.println("num serie");
			String numSerie=sc.next();


			if(meds.modificar(pos, new medicamento.model.Medicamento(nombre, numSerie,new ArrayList()))) {
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
		System.out.println(meds.listar());   
	}
	public void agregar() {
		try {

			System.out.println("¿Nombre");
			String nombre=sc.next();
			System.out.println("num serie");
			String numSerie=sc.next();	
			meds.agregar(new medicamento.model.Medicamento(nombre, numSerie,new ArrayList()));

		}catch(Exception e) {

		}

	}
	public boolean eliminar() {
		boolean bRet=false;
		try {
			System.out.println("Número quieras eliminar");
			int num=sc.nextInt();
			if(meds.eliminar(num)) {
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