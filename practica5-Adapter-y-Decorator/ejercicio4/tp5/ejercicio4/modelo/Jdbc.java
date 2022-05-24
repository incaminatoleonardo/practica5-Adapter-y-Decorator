package tp5.ejercicio4.modelo;

import tp5.ejercicio4.persistencia.JdbcPersistencia;

public class Jdbc implements FormaDeGuardado {

	private RestCall restCall;

	public Jdbc(RestCall restCall) {
		super();

		this.restCall = restCall;
	}

	@Override
	public void guardar(PersistenciaItemsServicio persistencia) {
		persistencia = new JdbcPersistencia();

		restCall.guardar(persistencia);

	}

}
