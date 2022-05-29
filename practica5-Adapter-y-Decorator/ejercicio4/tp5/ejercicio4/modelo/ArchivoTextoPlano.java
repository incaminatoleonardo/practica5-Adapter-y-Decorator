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
	public String run() {

		PersistenciaItemsServicio persistencia = new EnDiscoPersistencia(file);
		persistencia.guardar(restCall.run());

//		try (Response response = client.newCall(request).execute()) { agregar esto aca y en el otro observable
//			persistencia.guardar(response.body().string());
//		} catch (IOException e) {
//			throw new RuntimeException(e);
//		}
		return restCall.run();
	}

}
