package tp5.ejercicio3.modelo;

public class Papas extends Ingredientes implements ComidaRapida {

	private final double precio = 2;
	private final String descripcion = "Papas extra ";

	public Papas(ComidaRapida comida) {
		super(comida);

	}

	@Override
	public String detalle() {

		return this.comida.detalle() + descripcion + precio + System.lineSeparator();

	}

}
