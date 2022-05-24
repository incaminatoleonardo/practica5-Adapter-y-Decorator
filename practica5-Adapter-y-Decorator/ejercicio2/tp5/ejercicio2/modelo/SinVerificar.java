package tp5.ejercicio2.modelo;

import java.io.File;

public class SinVerificar implements Exportar { // solo uno graba en disco --> que es reporte

	private Reporte reporte;

	public SinVerificar(Reporte reporte) {

		this.reporte = reporte;
	}

	@Override
	public void export(File file) { // verificar si existe y llamar siempre al exportar

		if (file == null) {
			throw new IllegalArgumentException("File es NULL; no puedo exportar...");
		}

		reporte.export(file);

	}

	public String importar(File file) {
		return reporte.importar(file);

	}

	public void eliminar(File file) {
		reporte.eliminar(file);
	}

}
