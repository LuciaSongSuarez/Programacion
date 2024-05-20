package departamentoRH.viewDeptRH;

import java.util.List;
import java.util.Scanner;

import departamentoRH.model.ContratoIndefinido;
import departamentoRH.model.ContratoObra;
import departamentoRH.model.ContratoTemporal;
import departamentoRH.model.EmpleadoIndefinido;
import departamentoRH.model.EmpleadoObra;
import departamentoRH.model.EmpleadoRH;
import departamentoRH.model.EmpleadoTemporal;
import common.model.IGestorCrud;

public class VMenuContratar{
	private Scanner sc;
	private IGestorCrud gc;
	/**constructor
	 * @param sc
	 * @param list
	 */

	
	public VMenuContratar(IGestorCrud gestor) {
		this.sc =new Scanner (System.in);
		this.gc=gestor;
	}

	/**
	 * agrega empleados (CONTRATAR)
	 */
	public void create() {
		
		try {
			System.out.println("nombre"); //Registro del nombre del trabajador
			String nombre=sc.next();
			System.out.println("salario anual"); //Registro del salario del trabajador
			int salario=sc.nextInt();
			System.out.println("Departamento"); //Registro del Departamento
			String departamento=sc.next();
			System.out.println("Duracion (dias) del contrato \n <60= Contrato de obra. \n>60 y <365= Contrato Temporal. \n >365= Contrato Indefinido."); //Registro de la duracion
			int duracionContrato = sc.nextInt();
			System.out.println();
			//list= new Empleado(nombre,salario,departamento);
			int comidasGratis=0;
			int cocheGratis=0;
			int diasDeParking=0;
			if(duracionContrato<60) {//ContratoObra
				System.out.println("Dias de comida gratis"); //Registro de la duracion
				comidasGratis = sc.nextInt();
				gc.create(new EmpleadoObra(nombre,salario,departamento,duracionContrato,new ContratoObra(comidasGratis)));
			
			}else if(duracionContrato>60&&duracionContrato<365) {//Contrato temporal
				System.out.println("Dias de comida gratis"); //Registro de la duracion
				cocheGratis = sc.nextInt();
				gc.create(new EmpleadoTemporal(nombre,salario,departamento,duracionContrato,new ContratoTemporal(cocheGratis)));
			
			}else if(duracionContrato>365) {//ContratoIndefinido
				System.out.println("Dias de comida gratis"); //Registro de la duracion
				diasDeParking = sc.nextInt();
				gc.create(new EmpleadoIndefinido(nombre,salario,departamento,duracionContrato,new ContratoIndefinido(diasDeParking)));
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
			System.out.println("nombre"); //Registro del nombre del trabajador
			String nombre=sc.next();
			System.out.println("salario anual"); //Registro del salario del trabajador
			int salario=sc.nextInt();
			System.out.println("Departamento"); //Registro del Departamento
			String departamento=sc.next();
			System.out.println("Duracion (dias) del contrato \n <60= Contrato de obra. \n>60 y <365= Contrato Temporal. \n >365= Contrato Indefinido."); //Registro de la duracion
			int duracionContrato = sc.nextInt();
			System.out.println();
			//list= new Empleado(nombre,salario,departamento);
			int comidasGratis=0;
			int cocheGratis=0;
			int diasDeParking=0;
			if(duracionContrato<60) {//ContratoObra
				System.out.println("Dias de comida gratis"); //Registro de la duracion
				comidasGratis = sc.nextInt();
				gc.create(new EmpleadoObra(nombre,salario,departamento,duracionContrato,new ContratoObra(comidasGratis)));
			
			}else if(duracionContrato>60&&duracionContrato<365) {//Contrato temporal
				System.out.println("Dias de comida gratis"); //Registro de la duracion
				cocheGratis = sc.nextInt();
				gc.create(new EmpleadoTemporal(nombre,salario,departamento,duracionContrato,new ContratoTemporal(cocheGratis)));
			
			}else if(duracionContrato>365) {//ContratoIndefinido
				System.out.println("Dias de comida gratis"); //Registro de la duracion
				diasDeParking = sc.nextInt();
				gc.create(new EmpleadoIndefinido(nombre,salario,departamento,duracionContrato,new ContratoIndefinido(diasDeParking)));
			} 
			

		} catch (Exception e) {
			System.out.println("Error en create");
			sc=new Scanner(System.in); //inicializamos o capturamos toda la linea sc.nextLine()
		}
		return bRet;
	}
}
