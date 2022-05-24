package tp5.ejercicio2.persistencia;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import tp5.ejercicio2.modelo.PersistenciaReporte;

public class PersistenciaRegistro implements PersistenciaReporte {

	private String pathCasa = "C:\\Users\\Frodo\\Desktop\\Uni\\Objetos 2\\tp5-ejercicio2-reporte.txt";

	@Override
	public void exportar(File file, String registro) {

//		if (file == null) {
//			throw new IllegalArgumentException("File es NULL; no puedo exportar...");
//		}
//		if (file.exists()) {
//			throw new IllegalArgumentException("El archivo ya existe...");
//		}
		// Exportar el reporte a un archivo.
		crearArchivo(file);

		try {
			Files.write(Paths.get(file.getPath()), registro.getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			throw new RuntimeException("No se pudo guardar en disco", e);
		}

//		if (!file.exists()) {
//			crearArchivo(file);
//			exportarArchivo(registro);
//
//		}

	}

	private void exportarArchivo(String registro) {
		try {
			Files.write(Paths.get(pathCasa), registro.getBytes(), StandardOpenOption.APPEND);
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

	@Override
	public String importar(File file) {

		String archivo;
		try {
			archivo = Files.readString(file.toPath());
		} catch (IOException e) {
			throw new RuntimeException("No se pudo leer el archivo");
		}

		return archivo;
	}

	@Override
	public void eliminar(File file) {
		try {
			Files.deleteIfExists(file.toPath());
		} catch (IOException e) {
			throw new RuntimeException("No se pudo borrar el archivo");
		}

	}

}
