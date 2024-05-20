package MyP.view;
import java.util.Scanner;

import MyP.model.Campaña;
import MyP.model.Famoso;
import MyP.model.Paciente;
import MyP.model.Publicidad;
import MyP.model.PublicidadFamoso;
import common.model.IGestorCrud;






public class VMenuGestorCrudMyP {
	private IGestorCrud gc;
	private Scanner sc;
	public VMenuGestorCrudMyP(IGestorCrud gestor) {
		this.gc = gestor;
		this.sc = new Scanner(System.in);
	}
	@Override
	public String toString() {
		return "VMenuGestorCrud [gc=" + gc + ", sc=" + sc + "]";
	}
	/**
	 * muestra menu principal
	 * @return opcion seleccionada o -1 si da un error
	 */
	public int menu() {
		try {
			System.out.println("Introduce una opcion");
			System.out.println("1. Create (C)");
			System.out.println("2. Read (R)");
			System.out.println("3. Update (U)");
			System.out.println("4. Delete (D)");
			System.out.println("0. Otra para salir");
			return sc.nextInt();
		} catch (Exception e) {
			System.out.println("Opcion erronea");
			sc=new Scanner(System.in); //inicializamos o capturamos toda la linea sc.nextLine()
			return -1;
		}
	}
	public void create() {
		try {
			System.out.println("Nombre Personal");
			String nombrePersonal=sc.next();
			System.out.println("Cargo");
			String cargo=sc.next();
			System.out.println("Apellido");
			String apellido=sc.next();

			System.out.println("Nombre Campaña");
			String nombreCampania=sc.next();
			System.out.println("Fecha");
			String fecha= sc.next();
			System.out.println("Hora");
			String hora=sc.next();

			System.out.println("Formato");
			String formato=sc.next();
			System.out.println("RRSS");
			String rrss= sc.next();

			System.out.println("Famoso: /n 1, Si /n  2, No");
			int opcion=sc.nextInt();
			if(opcion==1) {
				System.out.println("Nombre Famoso");
				String nombreFamoso=sc.next();
				System.out.println("Red Social");
				String redSocial=sc.next();
				System.out.println("Profesion");
				String profesion=sc.next();
				System.out.println("Genero");
				String genero=sc.next();
				gc.create(new Paciente(nombrePersonal, cargo,apellido, new Campaña(nombreCampania,fecha,hora, 
						new PublicidadFamoso(formato, rrss, new Famoso(nombreFamoso,redSocial,profesion, genero)))));
			}
			else if(opcion==2) {
				gc.create(new Paciente(nombrePersonal, cargo,apellido, new Campaña(nombreCampania,fecha,hora, 
						new Publicidad(formato,rrss))));
			}


		} catch (Exception e) {
			System.out.println("Error en create");
			sc=new Scanner(System.in); //inicializamos o capturamos toda la linea sc.nextLine()
		}
	}
	public void read() {
		System.out.println(gc.read());
	}
	public boolean update() {
		boolean bRet=false;
		try {
			System.out.println("Introduce la pos");
			int pos=sc.nextInt();
			System.out.println("Nombre Personal");
			String nombrePersonal=sc.next();
			System.out.println("Cargo");
			String cargo=sc.next();
			System.out.println("Apellido");
			String apellido=sc.next();

			System.out.println("Nombre Campaña");
			String nombreCampania=sc.next();
			System.out.println("Fecha");
			String fecha= sc.next();
			System.out.println("Hora");
			String hora=sc.next();

			System.out.println("Formato");
			String formato=sc.next();
			System.out.println("RRSS");
			String rrss= sc.next();

			System.out.println("Famoso: /n 1, Si /n  2, No");
			int opcion=sc.nextInt();
			if(opcion==1) {
				System.out.println("Nombre Famoso");
				String nombreFamoso=sc.next();
				System.out.println("Red Social");
				String redSocial=sc.next();
				System.out.println("Profesion");
				String profesion=sc.next();
				System.out.println("Genero");
				String genero=sc.next();
				bRet=gc.update(pos,new Paciente(nombrePersonal, cargo,apellido, new Campaña(nombreCampania,fecha,hora, 
						new PublicidadFamoso(formato, rrss, new Famoso(nombreFamoso,redSocial,profesion, genero)))));
			}
			else if(opcion==2) {
				bRet=gc.update(pos,new Paciente(nombrePersonal, cargo,apellido, new Campaña(nombreCampania,fecha,hora, 
						new Publicidad(formato,rrss))));
			}

		} catch (Exception e) {
			System.out.println("Error en update");
			sc=new Scanner(System.in); //inicializamos o capturamos toda la linea sc.nextLine()
		}
		return bRet;
	}
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
