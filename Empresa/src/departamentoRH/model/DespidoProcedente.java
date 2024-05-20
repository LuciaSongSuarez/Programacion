package departamentoRH.model;

import java.util.Scanner;

public class DespidoProcedente {
	private Scanner sc;
	GestorCrudRH gestor;
	/**
	 * borra
	 * @return verdadero si borra
	 */
	public boolean delete() {
		boolean bRet=false;
		try {
			System.out.println("Introduce la pos");
			int pos=sc.nextInt();
			bRet=gestor.delete(pos);
			System.out.println("Este empleado no recibirá compensación al ser un despido procedente");
		} catch (Exception e) {
			System.out.println("Error en delete");
			sc=new Scanner(System.in); //inicializamos o capturamos toda la linea sc.nextLine()
		}
		return bRet;
		
	}
}
