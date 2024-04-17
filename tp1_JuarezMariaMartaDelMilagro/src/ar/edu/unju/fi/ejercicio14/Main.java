package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int tamanioArreglo;
		int suma = 0;

		do {
			System.out.print("Ingrese tamaño del arreglo: ");
			tamanioArreglo = leer.nextInt();
		} while (tamanioArreglo < 3 || tamanioArreglo > 10); // rango del 3 al 10

		// declaracion de array
		int[] numeros = new int[tamanioArreglo];

		// carga de elemtos del arreglo
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Ingrese elemento " + (i + 1) + ": ");
			numeros[i] = leer.nextInt();
		}

		System.out.println("");
		// vizualizacion de elementos del array y suma de los mismos
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posición " + i + ": " + numeros[i]);
			suma += numeros[i];
		}
		System.out.println("");
		System.out.println("La suma de los elementos del array es: " + suma);
		leer.close();
	}
}
