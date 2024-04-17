package ar.edu.unju.fi.ejercicio12.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Persona {

	private String nombre;
	private Calendar fechaNacimiento;

	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, Calendar fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public long edadPersona() {
		Calendar fechaActual = Calendar.getInstance();
		long milisec = fechaActual.getTimeInMillis() - fechaNacimiento.getTimeInMillis();
		long edadEnDias = milisec / 1000 / 60 / 60 / 24;

		// saco el anio para calcular si es bisiesto o no
		int anioActual = fechaActual.get(Calendar.YEAR);

		if ((anioActual % 4 == 0 && anioActual % 100 != 0) || (anioActual % 400 == 0)) {
			return edadEnDias / 366;
		} else
			return edadEnDias / 365;
	}

	public String signoZodiacal() {

		int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		int mes = fechaNacimiento.get(Calendar.MONTH) + 1; // Calendar.MONTH inicia con el mes en 0

		if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
			return "Aries";
		} else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
			return "Tauro";
		} else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
			return "Géminis";
		} else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
			return "Cáncer";
		} else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
			return "Leo";
		} else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
			return "Virgo";
		} else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
			return "Libra";
		} else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
			return "Escorpio";
		} else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
			return "Sagitario";
		} else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
			return "Capricornio";
		} else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
			return "Acuario";
		} else { // Corresponde a Piscis (mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)
			return "Piscis";
		}
	}

	public String estacionAnio() {

		int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		int mes = fechaNacimiento.get(Calendar.MONTH) + 1;

		if ((mes == 11 && dia >= 21) || (mes == 3 && dia <= 20)) {
			return "Verano";
		} else if ((mes == 3 && dia >= 21) || (mes == 6 && dia <= 20)) {
			return "Otoño";
		} else if ((mes == 6 && dia >= 21) || (mes == 9 && dia <= 20)) {
			return "Invierno";
		} else {
			return "Primavera";
		}
	}

	public void mostrarDatos() {

		// fecha con formato

		fechaNacimiento.add(Calendar.MONTH, -1);
		SimpleDateFormat fechaFormateada = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Nombre: " + nombre);
		System.out.println("Fecha de Nacimiento: " + fechaFormateada.format(fechaNacimiento.getTime()));
		System.out.println("Edad: " + edadPersona() + " años");
		System.out.println("Signo del zodiaco: " + signoZodiacal());
		System.out.println("Estación: " + estacionAnio());
	}

}
