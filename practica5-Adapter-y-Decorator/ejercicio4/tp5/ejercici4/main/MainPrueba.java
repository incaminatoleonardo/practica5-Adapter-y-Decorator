package tp5.ejercici4.main;

import java.io.File;

import tp5.ejercicio4.modelo.ArchivoTextoPlano;
import tp5.ejercicio4.modelo.FormaDeGuardado;
import tp5.ejercicio4.modelo.Jdbc;
import tp5.ejercicio4.modelo.RestCall;

public class MainPrueba {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\Frodo\\Desktop\\Uni\\Objetos 2\\tp5-ejercicio4-itemsServicios.txt");

//		RestCall restEnDisco = new RestCall("https://jsonplaceholder.typicode.com/posts",
//				new EnDiscoPersistencia(file));
//
//		RestCall restEnJdbc = new RestCall("https://jsonplaceholder.typicode.com/posts", new JdbcPersistencia());
//
//		restEnJdbc.guardar();
//		restEnDisco.guardar();

		FormaDeGuardado restEnDisco = new ArchivoTextoPlano(file,
				new RestCall("https://jsonplaceholder.typicode.com/posts"));

		FormaDeGuardado restJdbc = new Jdbc(new RestCall("https://jsonplaceholder.typicode.com/posts"));

		// restEnDisco.guardar(null);

		restJdbc.guardar(null);

	}

}
