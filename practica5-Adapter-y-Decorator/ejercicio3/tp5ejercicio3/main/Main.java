package tp5ejercicio3.main;

import tp5.ejercicio3.modelo.Carne;
import tp5.ejercicio3.modelo.ComboBasico;
import tp5.ejercicio3.modelo.ComboEspecial;
import tp5.ejercicio3.modelo.ComidaRapida;
import tp5.ejercicio3.modelo.Papas;
import tp5.ejercicio3.modelo.Queso;
import tp5.ejercicio3.modelo.Tomate;

public class Main {

	public static void main(String[] args) {

		ComidaRapida pedido = new Tomate(new Papas(new ComboBasico()));

		ComidaRapida pedidoEspecial = new Queso(new Carne(new Papas(new Tomate(new Papas(new ComboEspecial())))));

		System.out.println(pedido.detalle());
		System.out.println(pedidoEspecial.detalle());

	}

}
