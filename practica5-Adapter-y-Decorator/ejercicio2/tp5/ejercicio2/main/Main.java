package tp5.ejercicio2.main;

import java.io.File;

import tp5.ejercicio2.modelo.Exportar;
import tp5.ejercicio2.modelo.Reporte;
import tp5.ejercicio2.modelo.SinVerificar;
import tp5.ejercicio2.modelo.VerificarSiExiste;
import tp5.ejercicio2.persistencia.PersistenciaRegistro;

public class Main {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\Frodo\\Desktop\\Uni\\Objetos 2\\tp5-ejercicio2-reporte.txt");
		PersistenciaRegistro accesoDatos = new PersistenciaRegistro();

		Exportar prueba = new VerificarSiExiste(
				new Reporte("Este reporte es de prueba" + System.lineSeparator(), accesoDatos));

		prueba.export(file);

		// System.out.println(prueba.importar(file));

		Exportar prueba2 = new SinVerificar(
				new Reporte("Este reporte esta sobrescrito" + System.lineSeparator(), accesoDatos));

		prueba2.export(file);

		System.out.println(prueba.importar(file));
		prueba.eliminar(file);

	}

}
