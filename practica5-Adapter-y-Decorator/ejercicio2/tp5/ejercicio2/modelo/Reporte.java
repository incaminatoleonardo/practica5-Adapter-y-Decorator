package tp5.ejercicio2.modelo;

import java.io.File;

public class Reporte {

	private PersistenciaReporte persistencia;

	private String reporte;

	public Reporte(String reporte) {
		this.reporte = reporte;
	}

	void export(File file) {

		persistencia.exportar(file, reporte);
//		if (file == null) {
//			throw new IllegalArgumentException("File es NULL; no puedo exportar...");
//		}
//		if (file.exists()) {
//			throw new IllegalArgumentException("El archivo ya existe...");
//		}
//		// Exportar el reporte a un archivo.
	}

}
