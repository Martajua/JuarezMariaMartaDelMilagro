package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		int numero;

		// control de ingreso del numero
		do {
			System.out.print("Ingrese un número: ");
			numero = leer.nextInt();
		} while (numero < 1 || numero > 9);

		int multiplicar;
		// estructura for para multiplicar
		for (int i = 0; i <= 10; i++) {
			multiplicar = numero * i;
			System.out.println(numero + " x " + i + " = " + multiplicar);
		}

		leer.close();
	}

}
