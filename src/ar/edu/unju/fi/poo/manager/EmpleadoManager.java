package ar.edu.unju.fi.poo.manager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.poo.domain.Empleado;

/**
 * La clase permite gestionar todos los objetos de tipo Empleado
 * @author Diego Rios
 *
 */
public class EmpleadoManager {
	/**
	 * Creacion de Arrays que continenen datos de tipo Empleado
	 */
	//Punto 1 del Trabajo Practico crear una lista de N Empleados
	private static List<Empleado> listaEmpleados = new ArrayList<Empleado>();
	//Punto 5.1 del Trabajo Practico crear otra lista vacia de Empleados
	private static List<Empleado> nuevaListaEmpleados = new ArrayList<Empleado>();
	/**
	 * Carga una lista de Tipo Empleado, 5 Empleados
	 */
	public static void generarEmpleados() {
		listaEmpleados.add(new Empleado(100, "11111111", "Pedro", LocalDate.of(2000, 11, 21), 29000));
		listaEmpleados.add(new Empleado(101, "22222222", "Jose", LocalDate.of(2001, 8, 10), 31000));
		listaEmpleados.add(new Empleado(102, "33333333", "Leopoldo", LocalDate.of(1995, 10, 2), 45000));
		listaEmpleados.add(new Empleado(103, "44444444", "Homero", LocalDate.of(2007, 10, 2), 22000));
		listaEmpleados.add(new Empleado(104, "55555555", "Pedro", LocalDate.of(2002, 10, 2), 25000));
	}
	/**
	 * Muestra las listas de Empleados Creadas
	 */
	public static void mostrarEmpleados(List<Empleado> lista) {
		for (Empleado empleado : lista) {
			System.out.println(empleado);
		}
	}
	
	/**
	 * Método de búsqueda de un Empleado por medio de su nombre
	 * y mestra el promedio de los salarios de los empleados encontrados
	 * @param nombreEmpleado
	 */
	public static void buscarEmpleado(String nombreEmpleado) {
		int contadorEmpleados=0;
		float sumaTotalSalarios=0;
		if(nombreEmpleado.isEmpty()) {
			mostrarEmpleados(listaEmpleados);
		}else {
			System.out.println("\nResultado de la busqueda por nombre:\n");
			for (Empleado empleado : listaEmpleados) {
				if(empleado.getNombre().contains(nombreEmpleado)) {
					contadorEmpleados++;
					sumaTotalSalarios+=empleado.getSalario();
					System.out.println(empleado);
				}
			}
		}if(contadorEmpleados>0) {
			System.out.println("Promedio de la suma de los Salarios es de: "+ sumaTotalSalarios/(float)contadorEmpleados+ " pesos");
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
		System.out.println("\nResultados de la busqueda por años de antiguedad:\n");
		for (Empleado empleado : listaEmpleados) {
			if(empleado.getAntiguedad()>anios) {
				System.out.println(empleado);
				salarioAcumulado+=empleado.getSalario();
			}
		}
		if(salarioAcumulado>0)
			System.out.println("El total de salarios acumulado es de: "+(int)salarioAcumulado +" pesos" );
		else
			System.out.println("No se encontro ningun empleado con antiguedad mayor a "+ anios+ " años");
	}
	
	/**
	 * Quita un Empleado si este se repitiece en ListaEmleados por medio de su dni y
	 * lo agrega a nuevaListaEmpleados
	 * @param dniEmpleado
	 */
	public static void quitarEmpleado(String dniEmpleado) {
		int index=0, indexBorrar=-1;
		for (Empleado empleado : listaEmpleados) {
			if(dniEmpleado.equals(empleado.getDni())) {
				System.out.println(empleado);
				nuevaListaEmpleados.add(empleado);
				indexBorrar=index;
			}
			index++;
		}
		if(indexBorrar!=-1)
		listaEmpleados.remove(indexBorrar);
	}
	
	public static void mostrarTodaListas() {
		System.out.println("\n++++++++++++++++ Es la primera lista de Empleados +++++++++++++++\n");
		mostrarEmpleados(listaEmpleados);
		if(nuevaListaEmpleados.isEmpty()) {
			System.out.println("\n++++++++++++++++ Segunda lista de Empleados vacia +++++++++++++++\n");
		}else {
			System.out.println("\n++++++++++++++++ Es la segunda lista de Empleados ++++++++++++++++\n");
			mostrarEmpleados(nuevaListaEmpleados);
		}	
	}
}


