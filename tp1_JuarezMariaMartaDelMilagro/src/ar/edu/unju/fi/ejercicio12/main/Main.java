package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		Calendar fechaNacimientoPersona = Calendar.getInstance();
	
		//ingreso de datos
		System.out.print("Ingrese Nombre: ");
		String nombrePersona = leer.next();
		System.out.println("Ingrese Fecha de Nacimiento: ");
		System.out.print("Dia: ");
		int dia = leer.nextInt();
		System.out.print("Mes: ");
		int mes =  leer.nextInt();
		System.out.print("Año: ");
		int anio =  leer.nextInt();
		
		//cargo la fecha con los datos
		fechaNacimientoPersona.set(anio, mes, dia);
		
		//creo el objeto persona
		Persona persona = new Persona(nombrePersona, fechaNacimientoPersona);
		//datos de la persona
		System.out.println("");
		persona.mostrarDatos();
		
		leer.close();
	}

}
