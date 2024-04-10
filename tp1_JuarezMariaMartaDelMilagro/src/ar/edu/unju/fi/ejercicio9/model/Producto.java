package ar.edu.unju.fi.ejercicio9.model;

public class Producto {

	private String nombre;
	private int codigo;
	private double precio;
	private byte descuento;

	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public byte getDescuento() {
		return descuento;
	}

	public void setDescuento(byte descuento) {
		this.descuento = descuento;
	}

	public double calcularDescuento() {
		double precioConDescuento = precio - (precio * descuento / 100);
		return precioConDescuento;
	}

	public void mostrarInformacionProducto() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Código: " + codigo);
		System.out.println("Precio: $" + precio);
		if (descuento > 0) {
			System.out.println("Descuento: " + descuento + "%");
			System.out.println("Precio con descuento: $" + calcularDescuento());
		} else {
			System.out.println("El producto no posee descuento");
		}
	}

}
