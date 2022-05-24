package tp5.ejercicio3.modelo;

public class Tomate extends Ingredientes implements ComidaRapida {

	private final double precio = 1;
	private final String descripcion = "Tomate extra ";

	public Tomate(ComidaRapida comida) {
		super(comida);

	}

	@Override
	public String detalle() {

		return this.comida.detalle() + descripcion + precio + System.lineSeparator();

	}
}
