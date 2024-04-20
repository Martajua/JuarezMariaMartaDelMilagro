package ar.edu.unju.fi.ejercicio18.model;

import java.util.List;

public class Pais {
	
	private String codigoPais;
	private String nombrePais;
	private List<DestinoTuristico> destinosTuristicos;
	
	public Pais() {
		// TODO Auto-generated constructor stub
	}

	public Pais(String codigoPais, String nombrePais, List<DestinoTuristico> destinosTuristicos) {
		super();
		this.codigoPais = codigoPais;
		this.nombrePais = nombrePais;
		this.destinosTuristicos = destinosTuristicos;
	}

	public String getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

	public List<DestinoTuristico> getDestinosTuristicos() {
		return destinosTuristicos;
	}

	public void setDestinosTuristicos(List<DestinoTuristico> destinosTuristicos) {
		this.destinosTuristicos = destinosTuristicos;
	}

	@Override
	public String toString() {
		return "Pais [codigoPais=" + codigoPais + ", nombrePais=" + nombrePais + "]";
	}
}
