package tp5.ejercicio3.modelo;

public class Ingredientes implements ComidaRapida {

	private double precio;
	private String descripcion;

	private ComidaRapida comida;

	@Override
	public String detalle() {
		// TODO Auto-generated method stub
		return descripcion + precio;
	}

}
