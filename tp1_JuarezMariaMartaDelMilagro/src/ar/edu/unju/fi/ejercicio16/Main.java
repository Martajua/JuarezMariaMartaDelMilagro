package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);

		// declaracion de array
		String[] nombresPersonas = new String[5];

		// carga de elementos
		for (int i = 0; i < nombresPersonas.length; i++) {
			System.out.print("Ingrese nombre de la persona " + (i + 1) + ": ");
			nombresPersonas[i] = leer.next();
		}
		System.out.println("");

		// visualizacion de elementos con while
		int i = 0;
		while (i < nombresPersonas.length) {
			System.out.println("Posición " + i + ": " + nombresPersonas[i]);
			i++;
		}

		// tamanio del arreglo
		System.out.println("");
		System.out.println("Tamaño del array: " + nombresPersonas.length);

		// Eliminar un elemento del arreglo
		System.out.println("");
		byte indice;
		do {
			System.out.print("Ingrese el indice a eliminar: ");
			indice = leer.nextByte();
			nombresPersonas[indice] = "";
		} while (indice < 0 || indice > 4);

		// desplazamiento de elementos

		for (int j = 0; j < nombresPersonas.length - 1; j++) {
			if (nombresPersonas[j].equals("")) {
				nombresPersonas[j] = nombresPersonas[j + 1];
				nombresPersonas[j + 1] = "";
			}
		}

		// visualizacion de elementos con while
		System.out.println("");
		i = 0;
		while (i < nombresPersonas.length) {
			System.out.println("Posición " + i + ": " + nombresPersonas[i]);
			i++;
		}
		leer.close();
	}

}
