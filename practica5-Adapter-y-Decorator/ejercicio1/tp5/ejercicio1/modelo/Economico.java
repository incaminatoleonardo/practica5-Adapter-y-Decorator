package tp5.ejercicio1.modelo;

public class Economico extends Motor {

	@Override
	public void arrancar() {
		System.out.println("El motor economico esta arrancando");

	}

	@Override
	public void acelerar() {
		System.out.println("El motor economico esta acelerando");

	}

	@Override
	public void apagar() {
		System.out.println("El motor economico se esta apagando");

	}

}
