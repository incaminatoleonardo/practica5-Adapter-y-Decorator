package tp5.ejercicio1.modelo;

public class ElectricoAdapter extends Motor {

	private Electrico motorElectrico;

	public ElectricoAdapter(Electrico motorElectrico) { // preguntar si esta bien inyectarlo por constructor
		super();
		this.motorElectrico = motorElectrico;
	}

	@Override
	public void arrancar() {
		motorElectrico.conectarYActivar();

	}

	@Override
	public void acelerar() {
		motorElectrico.moverMasRapido();

	}

	@Override
	public void apagar() {
		motorElectrico.detenerYDesconectar();

	}

}
