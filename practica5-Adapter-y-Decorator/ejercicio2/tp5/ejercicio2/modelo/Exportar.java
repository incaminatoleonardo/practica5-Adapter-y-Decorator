package tp5.ejercicio2.modelo;

import java.io.File;

public interface Exportar {

	void export(File file);

	String importar(File file);

	void eliminar(File file);

}
