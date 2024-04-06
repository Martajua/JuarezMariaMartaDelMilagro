package ar.edu.unju.fi.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;

		double promedio;

		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese número 1: ");
		num1 = leer.nextInt();
		System.out.print("Ingrese número 2: ");
		num2 = leer.nextInt();
		System.out.print("Ingrese número 3: ");
		num3 = leer.nextInt();
		System.out.print("Ingrese número 4: ");
		num4 = leer.nextInt();
		System.out.print("Ingrese número 5: ");
		num5 = leer.nextInt();

		promedio = (double) (num1 + num2 + num3 + num4 + num5) / 5;

		System.out.println("El promedio es: " + promedio);

		leer.close();
	}
}
