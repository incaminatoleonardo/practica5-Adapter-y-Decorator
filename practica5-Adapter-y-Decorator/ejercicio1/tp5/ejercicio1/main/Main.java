package tp5.ejercicio1.main;

import tp5.ejercicio1.modelo.Comun;
import tp5.ejercicio1.modelo.Economico;
import tp5.ejercicio1.modelo.Electrico;
import tp5.ejercicio1.modelo.ElectricoAdapter;
import tp5.ejercicio1.modelo.Motor;

public class Main {

	public static void main(String[] args) {

		Motor comun = new Comun();
		Motor economico = new Economico();
		Motor electrico = new ElectricoAdapter(new Electrico());

		comun.arrancar();
		economico.acelerar();
		electrico.apagar();

	}

}
