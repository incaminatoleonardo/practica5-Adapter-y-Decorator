package tp5.ejercicio3.modelo;

public class ComboEspecial implements ComidaRapida {

	private final double precio = 18;
	private final String descripcion = "Hamburguesa Completa con papas y gaseosa: ";

//	private ComidaRapida comida;
//
//	public ComboEspecial(ComidaRapida comida) {
//		super();
//		this.comida = comida;
//
//	}

	@Override
	public String detalle() {

		return descripcion + precio + System.lineSeparator();

	}
}
