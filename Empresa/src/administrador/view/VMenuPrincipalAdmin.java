package administrador.view;

import common.model.IGestorCrud;


public class VMenuPrincipalAdmin {
IGestorCrud gestor;
		public VMenuPrincipalAdmin(IGestorCrud gestor) {
			this.gestor=gestor;
		}

		public void menu() {
			//creamos la instancia para pedir los datos
			VMenuGestorCrudAdmin datos=new VMenuGestorCrudAdmin(gestor);
			//bucle para pedir datos
			int opcion=datos.menu();
			while(opcion!=0) {
				if (opcion==1)
					datos.create();
				else if (opcion==2)
					datos.read();
				else if (opcion==3)
					datos.update();
				else if (opcion==4)
					datos.delete();
				opcion=datos.menu();
			}
		} 

}
