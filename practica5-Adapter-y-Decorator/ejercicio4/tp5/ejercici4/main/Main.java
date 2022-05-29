package tp5.ejercici4.main;

import java.io.File;

import tp5.ejercicio4.modelo.ArchivoTextoPlano;
import tp5.ejercicio4.modelo.FormaDeGuardado;
import tp5.ejercicio4.modelo.Jdbc;
import tp5.ejercicio4.modelo.RestCall;

public class Main {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Frodo\\Desktop\\Uni\\Objetos 2\\tp5-ejercicio4-itemsServicios.txt");

		FormaDeGuardado restEnDisco = new ArchivoTextoPlano(file,
				new RestCall("https://jsonplaceholder.typicode.com/posts"));

		FormaDeGuardado restJdbc = new Jdbc(new RestCall("https://jsonplaceholder.typicode.com/posts"));

		System.out.println(restEnDisco.run());
		System.out.println(restJdbc.run());
	}

}
