package ar.edu.unju.fi.poo.manager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.poo.domain.Empleado;

/**
 * La clase permite gestionar todos los objetos de tipo <strong>Empleado</strong>
 * @author Diego
 *
 */
public class EmpleadoManager {
	private static List<Empleado> listaEmpleados = new ArrayList<Empleado>(); 
	/**
	 * Carga una lista de Tipo Empleado
	 */
	public static void generarEmpleados() {
		LocalDate fechaActual = LocalDate.now();
		listaEmpleados.add(new Empleado(1, 100, "87654321", "David Arcos", LocalDate.of(2000, 10, 2), 2000, fechaActual.getYear()-2000));
		listaEmpleados.add(new Empleado(2, 101, "12345678", "Josele Roca", LocalDate.of(2001, 8, 10), 3000, fechaActual.getYear()-2001));
	}
	/**
	 * Muestra la lista de Empleados Creada
	 */
	public static void mostrarEmpleados() {
		for (Empleado empleado : listaEmpleados) {
			System.out.println(empleado);
		}
	}
	
	/**
	 * Método de búsqueda de un <strong>Empleado</strong> por medio de su nombre
	 * y mestra el promedio de los salarios de los empleados encontrados
	 * @param nombreEmpleado
	 */
	public static void buscarEmpleado(String nombreEmpleado) {
		int contadorEmpleados=0;
		float sumaTotalSalarios=0;
		if(nombreEmpleado.isEmpty()) {
			mostrarEmpleados();
		}else {
			for (Empleado empleado : listaEmpleados) {
				if(nombreEmpleado.equals(empleado.getNombre())) {
					contadorEmpleados++;
					sumaTotalSalarios+=empleado.getSalario();
					System.out.println("Resultado de la busqueda:");
					System.out.println(empleado);
				}
			}
		}if(contadorEmpleados>0) {
			System.out.println("Promedio de el/los Salarios es de: "+ sumaTotalSalarios/(float)contadorEmpleados+ " pesos");
		}else {
			System.out.println("No se encontro ningun Empleado con el dato: "+ nombreEmpleado);
		}
	}
	
	/**
	 * Método que muestra los Empleados que cumplen por ensima del los años de antiguedad solicitado
	 * y suma todos sus salarios 
	 * @param anios
	 */
	public static void mostrarPorAntiguedad(int anios) {
		float salarioAcumulado=0;
		for (Empleado empleado : listaEmpleados) {
			if(anios>empleado.getAntiguedad()) {
				System.out.println("Resultados de la busqueda");
				System.out.println(empleado);
				salarioAcumulado+=empleado.getSalario();
			}
		}
		if(salarioAcumulado>0)
			System.out.println("El total de salarios acumulado es de: "+salarioAcumulado +" pesos" );
		else
			System.out.println("No se encontro ningun empleado con antiguedad mayor a "+ anios+ " años");
	}
}


