package tp5.ejercicio1.modelo;

public class Comun extends Motor {

	@Override
	public void arrancar() {
		System.out.println("El motor comun esta arrancando");

	}

	@Override
	public void acelerar() {
		System.out.println("El motor comun esta acelerando");

	}

	@Override
	public void apagar() {
		System.out.println("El motor comun se esta apagando");

	}

}
