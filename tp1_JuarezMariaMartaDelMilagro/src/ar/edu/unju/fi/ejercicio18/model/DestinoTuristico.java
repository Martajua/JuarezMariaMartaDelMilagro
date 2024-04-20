package ar.edu.unju.fi.ejercicio18.model;

public class DestinoTuristico {
	private String codigo;
	private String nombreDestinoTuristico;
	private double precio;
	private Pais pais;
	private int cantidadDias;

	public DestinoTuristico() {
		// TODO Auto-generated constructor stub
	}

	public DestinoTuristico(String codigo, String nombreDestinoTuristico, double precio, Pais pais, int cantidadDias) {
		super();
		this.codigo = codigo;
		this.nombreDestinoTuristico = nombreDestinoTuristico;
		this.precio = precio;
		this.pais = pais;
		this.cantidadDias = cantidadDias;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombreDestinoTuristico() {
		return nombreDestinoTuristico;
	}

	public void setNombreDestinoTuristico(String nombreDestinoTuristico) {
		this.nombreDestinoTuristico = nombreDestinoTuristico;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public int getCantidadDias() {
		return cantidadDias;
	}

	public void setCantidadDias(int cantidadDias) {
		this.cantidadDias = cantidadDias;
	}

	@Override
	public String toString() {
		return "DestinoTuristico [codigo=" + codigo + ", nombreDestinoTuristico=" + nombreDestinoTuristico + ", precio="
				+ precio + ", pais=" + pais + ", cantidadDias=" + cantidadDias + "]";
	}
	

}
