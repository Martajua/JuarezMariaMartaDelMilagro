package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		int diametroPizza;
		boolean ingredienteEspecialPizza;

		for (int i = 0; i < 3; i++) {

			System.out.println("Ingrese los datos de la pizza " + (i + 1) + ":");
			// control de diametros de pizza
			do {
				System.out.print("Diámetro: ");
				diametroPizza = leer.nextInt();
			} while (diametroPizza != 20 && diametroPizza != 30 && diametroPizza != 40);

			System.out.print("¿Tiene ingredientes especiales? (true/false): ");
			ingredienteEspecialPizza = leer.nextBoolean();

			Pizza pizza = new Pizza();

			pizza.setDiametro(diametroPizza);
			pizza.setIngredienteEspecial(ingredienteEspecialPizza);

			// datos de pizzas
			System.out.println();
			System.out.println("** Pizza " + (i + 1) + " **");
			pizza.mostrarPizza();
			System.out.println();

		}
		leer.close();
	}

}
