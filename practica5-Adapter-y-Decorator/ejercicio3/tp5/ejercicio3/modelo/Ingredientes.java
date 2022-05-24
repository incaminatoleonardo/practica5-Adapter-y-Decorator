package tp5.ejercicio3.modelo;

public class Ingredientes implements ComidaRapida { // preguntar si puedo sustituir los ingredientes con solo esta clase

	// private double precio;
	// protected String descripcion;

	protected ComidaRapida comida;

	public Ingredientes(ComidaRapida comida) {

		this.comida = comida;
		// this.descripcion = descripcion;

	}

	@Override
	public String detalle() {

		return this.comida.detalle();

	}

}
