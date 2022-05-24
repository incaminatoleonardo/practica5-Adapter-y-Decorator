package tp5.ejercicio3.modelo;

public class ComboFamiliar implements ComidaRapida {

	private final double precio = 15;
	private final String descripcion = "Hamburguesa Completa con papas: ";

//	private ComidaRapida comida;
//
//	public ComboFamiliar(ComidaRapida comida) {
//		super();
//		this.comida = comida;
//
//	}

	@Override
	public String detalle() {

		return descripcion + precio + System.lineSeparator();

	}

}
