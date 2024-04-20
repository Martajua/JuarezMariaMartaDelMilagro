package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		// variables
		int opcion;
		String codigoDestinoTuristico;
		String nombreDestinoTuristico;
		double precioDestinoTuristico;
		int cantidadDiasDestinoTuristico;
		boolean destinoEncontrado = false;
		DestinoTuristico destinoTuristico = null;
		String codigoPais;
		// Array Destinos Turisticos
		List<DestinoTuristico> destinosTuristicos = new ArrayList<>();
		// Arrays Pais
		List<Pais> paises = new ArrayList<>();
		// creo elementos
		Pais pais1 = new Pais("A001", "Argentina", destinosTuristicos);
		Pais pais2 = new Pais("E002", "Estados Unidos", destinosTuristicos);
		Pais pais3 = new Pais("B003", "Brasil", destinosTuristicos);
		Pais pais4 = new Pais("F004", "Francia", destinosTuristicos);
		Pais pais5 = new Pais("I005", "Italia", destinosTuristicos);
		Pais pais6 = new Pais("C006", "Colombia", destinosTuristicos);
		Pais pais7 = new Pais("M007", "Mexico", destinosTuristicos);
		Pais pais8 = new Pais("E008", "España", destinosTuristicos);
		// agrego paises a la lista
		paises.add(pais1);
		paises.add(pais2);
		paises.add(pais3);
		paises.add(pais4);
		paises.add(pais5);
		paises.add(pais6);
		paises.add(pais7);
		paises.add(pais8);

		// Menu
		do {
			System.out.println("---------------------------");
			System.out.println("Menú Destino Turistico");
			System.out.println("");
			System.out.println("1 – Alta de destino turístico");
			System.out.println("2 – Mostrar todos los destinos turísticos");
			System.out.println("3 – Modificar el país de un destino turístico.");
			System.out.println("4 – Limpiar el ArrayList de destino turísticos");
			System.out.println("5 – Eliminar un destino turístico");
			System.out.println("6 – Mostrar los destinos turísticos ordenados por nombre");
			System.out.println("7 – Mostrar todos los países");
			System.out.println("8 – Mostrar los destinos turísticos que pertenecen a un país");
			System.out.println("9 – Salir");
			System.out.println("---------------------------");
			// controlamos que solo utilize numeros enteros
			do {
				try {
					System.out.print("Ingrese opción: ");
					while (!leer.hasNextInt()) {
						System.out.println("Error: Debe ingresar un número entero.");
						System.out.print("Ingrese opción: ");
						leer.next();
					}
					opcion = leer.nextInt();
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
					opcion = -1;
				}
			} while (opcion == -1);
			switch (opcion) {
			case 1: // alta de destino turistico
				do { // Control de ingreso de código
					try {
						System.out.print("Ingrese codigo del destino turistico: ");
						codigoDestinoTuristico = leer.next();
					} catch (Exception e) {
						System.out.println("Error: " + e.getMessage());
						codigoDestinoTuristico = "";
					}
				} while (codigoDestinoTuristico.isEmpty());
				do { // control de ingreso nombre
					try {
						System.out.print("Ingrese nombre del destino turistico: ");
						nombreDestinoTuristico = leer.next();
						if (!nombreDestinoTuristico.matches("[a-zA-Z]+")) {
							throw new IllegalArgumentException("El nombre debe contener solo letras.");
						}
					} catch (Exception e) {
						System.out.println("Error: " + e.getMessage());
						nombreDestinoTuristico = "";
					}
				} while (nombreDestinoTuristico.isEmpty());
				do { // control ingreso precio
					try {
						System.out.print("Ingrese precio del destino turistico: ");
						precioDestinoTuristico = leer.nextDouble();
						if (precioDestinoTuristico <= 0) {
							throw new IllegalArgumentException("El número debe ser positivo.");
						}
					} catch (Exception e) {
						System.out.println("Error: Debe ingresar un número real válido.");
						precioDestinoTuristico = 0;
						leer.nextLine();
					}
				} while (precioDestinoTuristico == 0);
				do { // cotrol de ingreso de dias
					try {
						System.out.print("Ingrese cantidad de dias: ");
						while (!leer.hasNextInt()) {
							System.out.println("Error: Debe ingresar un número entero.");
							System.out.print("Ingrese cantidad de días: ");
							leer.next();
						}
						cantidadDiasDestinoTuristico = leer.nextInt();
					} catch (Exception e) {
						System.out.println("Error: " + e.getMessage());
						cantidadDiasDestinoTuristico = -1;
					}
				} while (cantidadDiasDestinoTuristico == -1);
				Pais paisEncontrado = null;
				for (Pais pais : paises) { //buscar el pais en la lista
					if (pais.getCodigoPais().equals(codigoDestinoTuristico)) {
						paisEncontrado = pais;
						break;
					}
				}
				if (paisEncontrado == null) { //verificar si se encontro el pais 
					System.out.println("Error: El país con código " + codigoDestinoTuristico + " no existe.");
				} else { // Crear el nuevo destino turístico y agregarlo a la lista de destinos
					destinoTuristico = new DestinoTuristico(codigoDestinoTuristico, nombreDestinoTuristico, precioDestinoTuristico, paisEncontrado, cantidadDiasDestinoTuristico);
					destinosTuristicos.add(destinoTuristico);
					System.out.println("¡Nuevo destino turístico agregado con éxito!");
				}
				break;
			case 2: // mostrar todos los destinos turisticos
				if (destinosTuristicos.isEmpty()) {
					System.out.println("El ArrayList no tiene ningún Destino Turistico");
				} else {
					System.out.println("Destinos Turisticos");
					System.out.println("");
					destinosTuristicos.forEach(d -> System.out.println(d));
				}
				break;
			case 3: // modificar el pais de un destino turistico
				if (destinosTuristicos.isEmpty()) {
					System.out.println("El ArrayList no tiene ningún Destino Turistico");
				} else {
					System.out.println("Ingrese codigo del destino turistico: ");
					codigoDestinoTuristico = leer.next();
					for (DestinoTuristico dt : destinosTuristicos) {
						if (dt.getCodigo().equals(codigoDestinoTuristico)) {
							destinoEncontrado = true;
							System.out.println("Ingrese el nuevo codigo pais");
							codigoDestinoTuristico = leer.next();
			                Pais nuevoPais = null;//busco el pais
			                for (Pais pais : paises) {
			                    if (pais.getCodigoPais().equals(codigoDestinoTuristico)) {
			                        nuevoPais = pais; 
			                        break;
			                    }
			                }
			                if (nuevoPais != null) {
			                    dt.setPais(nuevoPais);
			                    dt.setCodigo(nuevoPais.getCodigoPais());
			                    System.out.println("País del destino turístico modificado con éxito.");
			                } else {
			                    System.out.println("El país con el código " + codigoDestinoTuristico + " no existe.");
			                }
			                break;
			            }
			        }
			    }
				if (!destinoEncontrado) {
					System.out.println("El Destino Turistico no existe.");
				}
				break;
			case 4: // Limpiar el ArrayLis de destinos turisticos
				if (destinosTuristicos.isEmpty()) {
					System.out.println("El ArrayList no tiene ningún Destino Turistico");
				} else {
					destinosTuristicos.clear();
					System.out.println("Se limpio el ArrayList de Destinos Turisticos");
				}
				break;
			case 5: // Eliminar un destino turistico
				if (destinosTuristicos.isEmpty()) {
					System.out.println("El ArrayList no tiene ningún Destino Turistico");
				} else {
					System.out.println("Ingrese codigo del destino turistico: ");
					codigoDestinoTuristico = leer.next();
					Iterator<DestinoTuristico> iterador = destinosTuristicos.iterator();
					while (iterador.hasNext()) {
						destinoTuristico = iterador.next();
						if (destinoTuristico.getCodigo().equals(codigoDestinoTuristico)) {
							iterador.remove();
							destinoEncontrado = true;
							System.out.println("Destino Turistico eliminado con exito");
							break;
						}
					}
				}
				if (!destinoEncontrado) {
					System.out.println("El Destino Turistico no existe.");
				}
				break;
			case 6: // Mostrar los destinos turisticos ordenados por nombre
				if (destinosTuristicos.isEmpty()) {
					System.out.println("El ArrayList no tiene ningún Destino Turistico");
				} else {
					System.out.println("Destinos Turisticos ordenados por nombre");
					System.out.println("");
					destinosTuristicos.sort(Comparator.comparing(DestinoTuristico::getNombreDestinoTuristico));
					destinosTuristicos.forEach(dt -> System.out.println(dt.getNombreDestinoTuristico()));
				}
				break;
			case 7: // Mostrar todos los paises
				System.out.println("Paises");
				System.out.println("");
				paises.forEach(p -> System.out.println(p));
				break;
			case 8: // Mostrar los destinos turisticos que perteneces a un pais
				if (destinosTuristicos.isEmpty()) {
					System.out.println("El ArrayList no tiene ningún Destino Turistico");
				} else {
					System.out.print("Ingrese codigo del pais: ");
					codigoPais = leer.next();
					for (DestinoTuristico dt : destinosTuristicos) {
						if (dt.getCodigo().equals(codigoPais)) {
							destinoEncontrado = true;
							System.out.println("");
							System.out.println(dt.toString());
						}
					}
					if (!destinoEncontrado) {
						System.out.println("El Destino Turistico no existe.");
					}
				}
				break;
			case 9: // salir
				System.out.println("Saliendo....");
				break;
			default:
				System.out.println("OPCION INVALIDA");
				break;
			}
		} while (opcion != 9);
		leer.close();
	}
}
