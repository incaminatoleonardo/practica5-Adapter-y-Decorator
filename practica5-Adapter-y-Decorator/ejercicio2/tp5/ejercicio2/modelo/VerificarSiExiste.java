package tp5.ejercicio2.modelo;

import java.io.File;

public class VerificarSiExiste implements Exportar {

	private Reporte reporte;

	public VerificarSiExiste(Reporte reporte) {

		this.reporte = reporte;
	}

	@Override
	public void export(File file) {
		if (file.exists()) {
			reporte.yaExiste();
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
