package tp5.ejercicio3.modelo;

import java.util.ArrayList;
import java.util.List;

public class ComboBasico implements ComidaRapida {

	private final double precio = 10;
	private final List<Ingredientes> descripcion = new ArrayList<Ingredientes>();

	private ComidaRapida comida;

	public ComboBasico(ComidaRapida comida) {
		super();
		this.comida = comida;
		descripcion.add(new Ingredientes());
	}

	@Override
	public String detalle() {

		return descripcion + precio;

	}

}
