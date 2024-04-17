package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int tamanioArreglo;

		do {
			System.out.print("Ingrese tamaño del arreglo: ");
			tamanioArreglo = leer.nextInt();
		} while (tamanioArreglo < 5 || tamanioArreglo > 10); // rango del 5 al 10

		// declaracion de array
		String[] nombrePersonas = new String[tamanioArreglo];
		System.out.println("");
		// carga de elemtos del arreglo
		for (int i = 0; i < nombrePersonas.length; i++) {
			System.out.print("Ingrese nombre de la persona " + (i + 1) + ": ");
			nombrePersonas[i] = leer.next();
		}

		System.out.println("");
		System.out.println("Visualizacion de elementos desde la posición 0");
		// visualizacion de elementos del array
		for (int i = 0; i < nombrePersonas.length; i++) {
			System.out.println("Posición " + i + ": " + nombrePersonas[i]);
		}
		System.out.println("");
		System.out.println("Visualizacion de elementos desde la ultima posición");
		// visualizacion de elementos del array
		for (int i = nombrePersonas.length - 1; i >= 0; i--) {
			System.out.println("Posición " + i + ": " + nombrePersonas[i]);
		}
		leer.close();
	}
}
