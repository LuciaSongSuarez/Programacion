package MyP.view;

import java.util.Scanner;

import MyP.model.Campaña;
import MyP.model.Famoso;
import MyP.model.PersonalMyP;
import MyP.model.Publicidad;
import MyP.model.PublicidadFamoso;
import common.model.IGestorCrud;

public class VCreateMyP {
	private Scanner sc;
	private IGestorCrud gc;
	public VCreateMyP(IGestorCrud gestor) {
		super();
		this.gc = gestor;
		this.sc = new Scanner(System.in);
	}
	@Override
	public String toString() {
		return "VCreateMyP [sc=" + sc + ", gc=" + gc + "]";
	}
	public void menu() {
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
				gc.create(new PersonalMyP(nombrePersonal, cargo,apellido, new Campaña(nombreCampania,fecha,hora, 
						new PublicidadFamoso(formato, rrss, new Famoso(nombreFamoso,redSocial,profesion, genero)))));
			}
			else if(opcion==2) {
				gc.create(new PersonalMyP(nombrePersonal, cargo,apellido, new Campaña(nombreCampania,fecha,hora, 
						new Publicidad(formato,rrss))));
			}


		} catch (Exception e) {
			System.out.println("Error en create");
			sc=new Scanner(System.in); //inicializamos o capturamos toda la linea sc.nextLine()
		}
	}
	
}
