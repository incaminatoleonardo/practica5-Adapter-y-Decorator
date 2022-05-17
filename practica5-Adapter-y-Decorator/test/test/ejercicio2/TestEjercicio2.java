package test.ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

import tp5.ejercicio2.modelo.Exportar;
import tp5.ejercicio2.modelo.Reporte;
import tp5.ejercicio2.modelo.SinVerificar;
import tp5.ejercicio2.modelo.VerificarSiExiste;
import tp5.ejercicio2.percistencia.PersistenciaRegistro;

class TestEjercicio2 {

	@Test
	void testVerificando() {

		// SETUP

		File file = new File("C:\\Users\\Frodo\\Desktop\\Uni\\Objetos 2\\tp5-ejercicio2-reporte.txt");
		PersistenciaRegistro accesoDatos = new PersistenciaRegistro();

		Exportar registroVerificado = new VerificarSiExiste(
				new Reporte("Este reporte es de prueba" + System.lineSeparator(), accesoDatos), accesoDatos);

		registroVerificado.export(file);

		String resultadoEsperado = "Este reporte es de prueba" + System.lineSeparator();

		// EXERCISE
		String resultado = registroVerificado.importar(file);

		// VERIFY
		assertEquals(resultadoEsperado, resultado);

	}

	@Test
	void testSinVerificar() {

		// SETUP

		File file = new File("C:\\Users\\Frodo\\Desktop\\Uni\\Objetos 2\\tp5-ejercicio2-reporte.txt");
		PersistenciaRegistro accesoDatos = new PersistenciaRegistro();

		Exportar registroSinVerificar = new SinVerificar(
				new Reporte("Este reporte esta sobrescrito" + System.lineSeparator(), accesoDatos), accesoDatos);

		registroSinVerificar.export(file);

		String resultadoEsperado = "Este reporte es de prueba" + System.lineSeparator()
				+ "Este reporte esta sobrescrito" + System.lineSeparator();

		// EXERCISE
		String resultado = registroSinVerificar.importar(file);

		// Lo elimino para que funcione el assert automaticamente
		registroSinVerificar.eliminar(file);

		// VERIFY
		assertEquals(resultadoEsperado, resultado);

	}

}
