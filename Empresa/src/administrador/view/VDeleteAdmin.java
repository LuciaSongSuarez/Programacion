package administrador.view;
import java.util.Scanner;

import administrador.model.PersonalAdmin;
import administrador.model.Recurso;
import administrador.model.Organizacion;
import administrador.model.Cliente;
import administrador.model.Evento;
import administrador.model.Factura;
import administrador.model.FacturaDescuento;
import common.model.IGestorCrud;



public class VDeleteAdmin {
	private IGestorCrud gc;
	private Scanner sc;
	public VDeleteAdmin(IGestorCrud gestor) {
		this.gc = gestor;
		this.sc = new Scanner(System.in);
	}
	/**
	 * muestra menu principal
	 * @return opcion seleccionada o -1 si da un error
	 */

	
	public boolean delete() {
		boolean bRet=false;
		try {
			System.out.println("Introduce la pos");
			int pos=sc.nextInt();
			bRet=gc.delete(pos);
		} catch (Exception e) {
			System.out.println("Error en delete");
			sc=new Scanner(System.in); //inicializamos o capturamos toda la linea sc.nextLine()
		}
		return bRet;
	}

}
