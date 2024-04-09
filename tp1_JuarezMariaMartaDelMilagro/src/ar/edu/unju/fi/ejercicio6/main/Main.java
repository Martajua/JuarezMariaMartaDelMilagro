package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long dni;
		String nombrePersona;
		LocalDate fechaNaciemientoPersona;
		String provinciaPersona;

		Scanner leer = new Scanner(System.in);

		// constructor por defecto
		Persona persona1 = new Persona();

		System.out.println("INGRESE DATOS DE LA PERSONA 1");
		System.out.print("Ingrese DNI: ");
		dni = leer.nextLong();

		leer.nextLine();// aseguro la entrada de la siguiente cadena
		System.out.print("Ingrese Nombre: ");
		nombrePersona = leer.nextLine();

		System.out.println("Ingrese Fecha de Nacimiento");
		System.out.print("Ingrese dia: ");
		int dia = leer.nextInt();
		System.out.print("Ingrese mes: ");
		int mes = leer.nextInt();
		System.out.print("Ingrese año: ");
		int anio = leer.nextInt();
		fechaNaciemientoPersona = LocalDate.of(anio, mes, dia);

		leer.nextLine();// aseguro la entrada de la siguiente cadena
		System.out.print("Ingrese provincia: ");
		provinciaPersona = leer.nextLine();

		persona1.setDni(dni);
		persona1.setNombre(nombrePersona);
		persona1.setFechaDeNacimiento(fechaNaciemientoPersona);
		persona1.setProvincia(provinciaPersona);

		persona1.mostrarDatos();

		// constructor parametrizado
		Persona persona2 = new Persona(dni, nombrePersona, fechaNaciemientoPersona, provinciaPersona);

		System.out.println("");
		System.out.println("INGRESE DATOS DE LA PERSONA 2");
		System.out.print("Ingrese DNI: ");
		dni = leer.nextLong();

		leer.nextLine();// aseguro la entrada de la siguiente cadena
		System.out.print("Ingrese Nombre: ");
		nombrePersona = leer.nextLine();

		System.out.println("Ingrese Fecha de Nacimiento");
		System.out.print("Ingrese dia: ");
		dia = leer.nextInt();
		System.out.print("Ingrese mes: ");
		mes = leer.nextInt();
		System.out.print("Ingrese año: ");
		anio = leer.nextInt();
		fechaNaciemientoPersona = LocalDate.of(anio, mes, dia);

		leer.nextLine();// aseguro la entrada de la siguiente cadena
		System.out.print("Ingrese provincia: ");
		provinciaPersona = leer.nextLine();

		persona2.setDni(dni);
		persona2.setNombre(nombrePersona);
		persona2.setFechaDeNacimiento(fechaNaciemientoPersona);
		persona2.setProvincia(provinciaPersona);

		persona2.mostrarDatos();

		// contructor de la clase Persona
		Persona persona3 = new Persona(dni, nombrePersona, fechaNaciemientoPersona);

		System.out.println("");
		System.out.println("INGRESE DATOS DE LA PERSONA 3");
		System.out.print("Ingrese DNI: ");
		dni = leer.nextLong();

		leer.nextLine();// aseguro la entrada de la siguiente cadena
		System.out.print("Ingrese Nombre: ");
		nombrePersona = leer.nextLine();

		System.out.println("Ingrese Fecha de Nacimiento");
		System.out.print("Ingrese dia: ");
		dia = leer.nextInt();
		System.out.print("Ingrese mes: ");
		mes = leer.nextInt();
		System.out.print("Ingrese año: ");
		anio = leer.nextInt();
		fechaNaciemientoPersona = LocalDate.of(anio, mes, dia);

		persona3.setDni(dni);
		persona3.setNombre(nombrePersona);
		persona3.setFechaDeNacimiento(fechaNaciemientoPersona);

		persona3.mostrarDatos();
		
		leer.close();
	}

}
