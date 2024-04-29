package MyP.view;

import common.model.IGestorCrud;


public class VMenuPrincipalMyP {
IGestorCrud gestor;
		public VMenuPrincipalMyP(IGestorCrud gestor) {
			this.gestor=gestor;
		}

		public void menu() {
			//creamos la instancia para pedir los datos
			VMenuGestorCrudMyP datos=new VMenuGestorCrudMyP(gestor);
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
