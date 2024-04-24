package medicamento.view;
import java.util.InputMismatchException;


import java.util.ArrayList;
import java.util.List;

import medicamento.model.GestorCrud;
import medicamento.model.Medicamento;

public class PrincipalMed {
	medicamento.model.GestorCrud gestor;

	public PrincipalMed(medicamento.model.GestorCrud gestor) {
		this.gestor = gestor;
	}
	public void menu() {
		boolean continua=true;
		do {
			try {

				Create pedir=new Create(gestor);	
				int opcion=pedir.mostrarMenu();
				if(opcion==0) {
					continua=false;
				}
				while(opcion!=0) {
					if(opcion==1) {
						pedir.agregar();

					}
					else if(opcion==2) {
						pedir.listar();
					}
					else if(opcion==3) {
						pedir.modificar();
					}
					else if(opcion==4) {
						pedir.eliminar();

					}
					opcion=pedir.mostrarMenu();
				}	


			}catch(InputMismatchException ex) {

			}
		}while(continua);
	}
	

}
