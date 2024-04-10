package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {

	private int n;

	public CalculadoraEspecial() {
		// TODO Auto-generated constructor stub
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void calcularSumatoria() {
		int sumatoria = 0;
		for (int i = 1; i <= n; i++) {
			sumatoria += (i * Math.pow(i + 1, 2)) / 2;
		}
		System.out.println("La sumatoria de " + n + " es: " + sumatoria);
	}

	public void calcularProductoria() {
		int productoria = 1;
		for (int i = 1; i <= n; i++) {
			productoria *= i * (i + 4);
		}
		System.out.println("La productoria de " + n + " es: " + productoria);
	}

}
