package tp5.ejercicio3.modelo;

public class Queso extends Ingredientes implements ComidaRapida {

	private final double precio = 3;
	private final String descripcion = "Queso extra ";

	public Queso(ComidaRapida comida) {
		super(comida);

	}

	@Override
	public String detalle() {

		return this.comida.detalle() + descripcion + precio + System.lineSeparator();

	}

}
