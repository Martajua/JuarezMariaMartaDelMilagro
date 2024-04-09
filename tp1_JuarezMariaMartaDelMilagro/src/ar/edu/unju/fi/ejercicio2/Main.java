package ar.edu.unju.fi.ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombrePais;
		byte edadPersona;
		double alturaEdificio;
		double precioProducto;
		long numTelefono;
		double calculoCos;

		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese nombre de un pais: ");
		nombrePais = leer.nextLine();
		System.out.print("Ingrese edad de una persona: ");
		edadPersona = leer.nextByte();
		System.out.print("Ingrese altura del edificio: ");
		alturaEdificio = leer.nextDouble();
		System.out.print("Ingrese precio del producto: ");
		precioProducto = leer.nextDouble();
		System.out.print("Ingrese número de telefono: ");
		numTelefono = leer.nextLong();
		System.out.print("Ingrese calculo del coseno: ");
		calculoCos = leer.nextDouble();

		System.out.println("El nombre del pais es: " + nombrePais);
		System.out.println("La edad de la persona es: " + edadPersona);
		System.out.println("La altura del edificio es: " + alturaEdificio);
		System.out.println("El precio del producto es: " + precioProducto);
		System.out.println("El numero de telefono es: " + numTelefono);
		System.out.println("El calculo del coseno es: " + Math.cos(calculoCos));

		leer.close();
	}

}
