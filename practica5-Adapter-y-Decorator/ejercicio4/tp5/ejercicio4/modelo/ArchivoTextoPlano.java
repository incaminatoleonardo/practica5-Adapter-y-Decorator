package tp5.ejercicio4.modelo;

import java.io.File;

import tp5.ejercicio4.persistencia.EnDiscoPersistencia;

public class ArchivoTextoPlano implements FormaDeGuardado {

	private File file;
	private RestCall restCall;

	public ArchivoTextoPlano(File file, RestCall restCall) {
		super();
		this.file = file;
		this.restCall = restCall;
	}

	@Override
	public void guardar(PersistenciaItemsServicio persistencia) {
		persistencia = new EnDiscoPersistencia(file);

		restCall.guardar(persistencia);

	}

}
