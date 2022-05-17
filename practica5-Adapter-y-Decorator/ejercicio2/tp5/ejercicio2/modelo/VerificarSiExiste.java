package tp5.ejercicio2.modelo;

import java.io.File;

public class VerificarSiExiste implements Exportar {

	private PersistenciaReporte persistencia;
	private Reporte reporte;

	public VerificarSiExiste(Reporte reporte, PersistenciaReporte persistencia) {
		this.persistencia = persistencia;
		this.reporte = reporte;
	}

	@Override
	public void export(File file) {
		reporte.export(file);
		// hace comprotamiento propio
		persistencia.exportarSiNoExiste(file, reporte.reporte());

	}

	@Override
	public String importar(File file) {
		return persistencia.importar(file);
	}

	@Override
	public void eliminar(File file) {
		persistencia.eliminar(file);

	}

}
