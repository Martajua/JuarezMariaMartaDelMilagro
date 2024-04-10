package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {

	private String nombre;
	private int legajo;
	private double salario;
	private double SALARIO_MINIMO = 210000.00;
	private double AUMENTO_POR_MERITOS = 20000.00;

	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public Empleado(String nombre, int legajo, double salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		// this.salario = salario;

		if (salario >= SALARIO_MINIMO) {
			this.salario = salario;
		} else {
			this.salario = SALARIO_MINIMO;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	/* Construya un método que permita mostrar los datos del empleado */

	public void mostrarDatos() {
		System.out.println("Nombre del empleado: " + nombre);
		System.out.println("Legajo: " + legajo);
		System.out.println("Salario: $" + salario);
	}

	/*
	 * Construya un método que permita dar un aumento al salario del empleado. Se
	 * incrementa el salario sumándole la constante aumento por méritos.
	 */

	public void aumentoPorMerito() {
		this.salario = salario + AUMENTO_POR_MERITOS;
	}

}
