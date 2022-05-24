package tp5.ejercicio2.modelo;

import java.io.File;

public class Reporte implements Exportar {

	private PersistenciaReporte persistencia;
	private String reporte;

	public Reporte(String reporte, PersistenciaReporte percictencia) {
		this.reporte = reporte;
		this.persistencia = percictencia;
	}

	public void export(File file) { // este solo exporta y es el que inyecta la persistencia- los otros dos
									// verifican si es null y si existe-- SOLO ESO!!!

		persistencia.exportar(file, reporte);
//		if (file == null) {
//			throw new IllegalArgumentException("File es NULL; no puedo exportar...");
//		}
//		if (file.exists()) {
//			throw new IllegalArgumentException("El archivo ya existe...");
//		}
//		// Exportar el reporte a un archivo.
	}

	public String importar(File file) {
		return persistencia.importar(file);
	}

	public void eliminar(File file) {
		persistencia.eliminar(file);
	}

	public String reporte() {

		return reporte;
	}

	public void yaExiste() {
		reporte = "Ya existe";

	}

}
