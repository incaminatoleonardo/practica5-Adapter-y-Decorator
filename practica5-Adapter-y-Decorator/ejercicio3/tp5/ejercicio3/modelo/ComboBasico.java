package tp5.ejercicio3.modelo;

public class ComboBasico implements ComidaRapida {

	private final double precio = 10;
	private final String descripcion = "Hamburguesa completa: ";

//	private ComidaRapida comida;
//
//	public ComboBasico(ComidaRapida comida) {
//		super();
//		this.comida = comida;
//
//	}

	@Override
	public String detalle() {

		return descripcion + precio + System.lineSeparator();

	}

}
