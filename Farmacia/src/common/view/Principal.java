package common.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import medicamento.model.GestorCrud;
import medicamento.model.Medicamento;
import medicamento.view.PrincipalMed;

import sintoma.model.Sintoma;
import sintoma.view.Create;
import sintoma.view.PrincipalSin;

public class Principal {
	private Scanner sc;

	public Principal() {
		this.sc = new Scanner(System.in);
	}
	public void menu() {

		int opcion=menuOpcion();
		List<Sintoma> listSin =new ArrayList<Sintoma>();
		List<Medicamento> listMed =new ArrayList<Medicamento>();
		while(opcion!=0) {
			if(opcion==1) {
				
				sintoma.model.GestorCrud gestor= new sintoma.model.GestorCrud(listSin);
				PrincipalSin principal=new PrincipalSin(gestor);
				principal.menu();
			}
			else if(opcion==2) {
				
				GestorCrud gestor=new GestorCrud(listMed);
				PrincipalMed principal=new PrincipalMed(gestor);
				principal.menu();

			}
			opcion=menuOpcion();
		}
	}

	public int menuOpcion() {
		try {
			System.out.println("Elige una opcion");
			System.out.println("1, Ir al CRUD de sintomas");
			System.out.println("2, Ir al CRUD de enfermedades");
			System.out.println("0 para salir");
		}catch(Exception e) {

		}
		return sc.nextInt();

	}
	public static void main(String[] args) {

		Principal principal=new Principal();
		principal.menu();

	}
}
