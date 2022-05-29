package tp5.ejercicio4.modelo;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Response;

public class RestCall implements FormaDeGuardado {

	private String url;
	private PersistenciaItemsServicio persistencia;

	public RestCall(String url/* , PersistenciaItemsServicio persistencia */) {
		this.url = url;
		// this.persistencia = persistencia;
	}

	public String run() {
		OkHttpClient client = new OkHttpClient();
		// Request request = new Request.Builder().url(this.url).build(); lo deje como
		// esta abajo xq asi anda

		okhttp3.Request request = new okhttp3.Request.Builder().url(this.url).build();

		try (Response response = client.newCall(request).execute()) {
			return response.body().string();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
