package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);

		// declaracion de array
		int[] numerosEnteros = new int[8];

		// length tamaño del arreglo
		// carga de elementos al array
		for (int i = 0; i < numerosEnteros.length; i++) {
			System.out.print("Ingrese elemento " + (i + 1) + ": ");
			numerosEnteros[i] = leer.nextInt();
		}
		System.out.println("");
		// visualizacion de elementos del array
		for (int i = 0; i < numerosEnteros.length; i++) {
			System.out.println("Posición " + i + ": " + numerosEnteros[i]);
		}
		leer.close();
	}
}
