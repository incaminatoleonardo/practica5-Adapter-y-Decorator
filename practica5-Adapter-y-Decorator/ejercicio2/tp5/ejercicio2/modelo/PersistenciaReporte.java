package tp5.ejercicio2.modelo;

import java.io.File;

public interface PersistenciaReporte {

	void exportar(File file, String registro);

	void exportarSiNoExiste(File file, String registro);

	String importar(File file);

	void eliminar(File file);

}
