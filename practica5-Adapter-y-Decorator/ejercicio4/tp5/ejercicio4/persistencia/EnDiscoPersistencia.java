package tp5.ejercicio4.persistencia;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import tp5.ejercicio4.modelo.PersistenciaItemsServicio;

public class EnDiscoPersistencia implements PersistenciaItemsServicio {

	private File file;

	public EnDiscoPersistencia(File file) {
		super();
		this.file = file;
	}

	@Override
	public void guardar(String itemsServicio) {

		if (!file.exists()) {
			crearArchivo(file);
		}

		try {
			Files.write(Paths.get(file.getPath()), itemsServicio.getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			throw new RuntimeException("No se pudo guardar en disco", e);
		}

	}

	private void crearArchivo(File file) {
		try {
			file.createNewFile();
		} catch (IOException e) {
			throw new RuntimeException("No se pudo crear el directorio", e);
		}

	}

}
