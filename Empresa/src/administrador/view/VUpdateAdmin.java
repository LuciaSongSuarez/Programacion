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



public class VUpdateAdmin {
	private IGestorCrud gc;
	private Scanner sc;
	public VUpdateAdmin(IGestorCrud gestor) {
		this.gc = gestor;
		this.sc = new Scanner(System.in);
	}

	public boolean menu() {
		boolean bRet=false;
		try {
			System.out.println("Introduce la pos");
			int pos=sc.nextInt();
			System.out.println("Nombre");
			String nombre=sc.next();
			System.out.println("Departamento");
			String dep=sc.next();
			System.out.println("Cargo");
			String cargo=sc.next();
			System.out.println("Organizacion: /n 1, Recursos /n  2, Eventos /n 3, Clientes");
			int opcion=sc.nextInt();
			if(opcion==1) {
				System.out.println("Nombre Recurso");
				String nombreRecurso=sc.next();
				System.out.println("Cantidad");
				int cantidad=sc.nextInt();
				System.out.println("Duracion");
				int duracion=sc.nextInt();
				System.out.println("Fecha");
				String fecha=sc.next();
				bRet=gc.update(pos,new PersonalAdmin(nombre,dep,cargo, new Organizacion(new Recurso(nombreRecurso,cantidad, duracion),fecha)));
			}
			else if(opcion==2) {
				System.out.println("Nombre Evento");
				String nombreEvento=sc.next();
				System.out.println("Numero personas");
				int numPersonas=sc.nextInt();
				System.out.println("Lugar");
				String lugar=sc.next();
				System.out.println("Fecha");
				String fecha=sc.next();
				bRet=gc.update(pos,new PersonalAdmin(nombre,dep,cargo, new Organizacion(new Evento(nombreEvento,numPersonas, lugar),fecha)));
			}
			else if(opcion==3) {
				System.out.println("Nombre Cliente");
				String nombreCliente=sc.next();
				System.out.println("Nombre Empresa");
				String nombreEmpresa=sc.next();
				System.out.println("Factura /n 1.con descuento /n 2.sin descuento");
				int decision=sc.nextInt();
				if (decision==1) {
					System.out.println("Total de la factura");
					int precio=sc.nextInt();
					System.out.println("Nombre Proyecto");
					String nombreProyecto=sc.next();
					System.out.println("Descuento");
					int descuento=sc.nextInt();
					System.out.println("Fecha");
					String fecha=sc.next();
					bRet=gc.update(pos,new PersonalAdmin(nombre,dep,cargo, new Organizacion(new Cliente(nombreCliente,nombreEmpresa, new FacturaDescuento (precio,nombreProyecto,descuento)),fecha)));
				}
				else if (decision==2) {
					System.out.println("Total de la factura");
					int precio=sc.nextInt();
					System.out.println("Nombre Proyecto");
					String nombreProyecto=sc.next();
					System.out.println("Fecha");
					String fecha=sc.next();
					bRet=gc.update(pos,new PersonalAdmin(nombre,dep,cargo, new Organizacion(new Cliente(nombreCliente,nombreEmpresa, new Factura(precio,nombreProyecto)),fecha)));
				}
			}

		} catch (Exception e) {
			System.out.println("Error en update");
			sc=new Scanner(System.in); //inicializamos o capturamos toda la linea sc.nextLine()
		}
		return bRet;
	}
	

}
