package tp5.ejercicio3.modelo;

public class Carne extends Ingredientes implements ComidaRapida {

	private final double precio = 4;
	private final String descripcion = "Carne extra ";

	public Carne(ComidaRapida comida) {
		super(comida);

	}

	@Override
	public String detalle() {

		return this.comida.detalle() + descripcion + precio + System.lineSeparator();

	}

}
