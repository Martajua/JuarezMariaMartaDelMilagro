package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int factorial = 1;
		int num;
		Scanner leer = new Scanner(System.in);

		do {
			System.out.print("Ingrese un número: ");
			num = leer.nextInt();
		} while (num < 0 || num > 10);

		int numFactorial = num;

		while (num > 0) {
			factorial = factorial * num;
			num--;
		}
		System.out.println("El resultado de " + numFactorial + "!: " + factorial);
		leer.close();
	}
}
