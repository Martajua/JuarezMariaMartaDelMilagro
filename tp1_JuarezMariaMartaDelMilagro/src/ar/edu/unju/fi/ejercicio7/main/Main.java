package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombreEmpleado;
		int legajoEmpleado;
		double salarioEmpleado;

		Scanner leer = new Scanner(System.in);

		System.out.print("Ingrese Nombre del empleado: ");
		nombreEmpleado = leer.nextLine();
		System.out.print("Ingrese N° de legajo del empleado: ");
		legajoEmpleado = leer.nextInt();
		System.out.print("Ingrese salario del empleado: ");
		salarioEmpleado = leer.nextDouble();

		Empleado empleado = new Empleado(nombreEmpleado, legajoEmpleado, salarioEmpleado);

		empleado.setNombre(nombreEmpleado);
		empleado.setLegajo(legajoEmpleado);

		System.out.println("");
		System.out.println("DATOS DEL EMPLEADO");
		empleado.mostrarDatos();
		empleado.aumentoPorMerito();
		System.out.println("");
		System.out.println("DATOS DEL EMPLEADO CON AUMENTO POR MERITO");
		empleado.mostrarDatos();

		leer.close();
	}

}
