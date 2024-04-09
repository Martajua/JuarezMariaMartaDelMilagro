package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner leer = new Scanner(System.in);

		System.out.print("Ingrese un número: ");
		num = leer.nextInt();

		if (num % 2 == 0) {
			num = num * 3;
			System.out.println("El triple del numero par es: " + num);
		} else {
			num = num * 2;
			System.out.println("El doble del numero impar es: " + num);
		}
		leer.close();
	}

}
