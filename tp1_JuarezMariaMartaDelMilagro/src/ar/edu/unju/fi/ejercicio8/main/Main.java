package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner leer = new Scanner(System.in);

		CalculadoraEspecial calculadora = new CalculadoraEspecial();

		System.out.print("Ingrese número: ");
		numero = leer.nextInt();

		calculadora.setN(numero);
		calculadora.calcularSumatoria();
		calculadora.calcularProductoria();

		leer.close();
	}

}
