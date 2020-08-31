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
	/**
	 * Creacion de Arrays que continenen datos de tipo Empleado
	 */
	public static List<Empleado> listaEmpleados = new ArrayList<Empleado>();
	public static List<Empleado> nuevaListaEmpleados = new ArrayList<Empleado>();
	
	/**
	 * Carga una lista de Tipo Empleado
	 */
	public static void generarEmpleados() {
		LocalDate fechaActual = LocalDate.now();
		listaEmpleados.add(new Empleado(1, 100, "11111111", "Pedro", LocalDate.of(2000, 10, 2), 29000, fechaActual.getYear()-2000));
		listaEmpleados.add(new Empleado(2, 101, "22222222", "Jose", LocalDate.of(2001, 8, 10), 31000, fechaActual.getYear()-2001));
		listaEmpleados.add(new Empleado(3, 102, "33333333", "Leopoldo", LocalDate.of(1995, 10, 2), 45000, fechaActual.getYear()-1995));
		listaEmpleados.add(new Empleado(4, 103, "44444444", "Homero", LocalDate.of(2007, 10, 2), 22000, fechaActual.getYear()-2007));
		listaEmpleados.add(new Empleado(5, 104, "55555555", "Pedro", LocalDate.of(2002, 10, 2), 25000, fechaActual.getYear()-2002));

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
	 * Método de búsqueda de un <strong>Empleado</strong> por medio de su nombre
	 * y mestra el promedio de los salarios de los empleados encontrados
	 * @param nombreEmpleado
	 */
	public static void buscarEmpleado(String nombreEmpleado) {
		int contadorEmpleados=0;
		float sumaTotalSalarios=0;
		if(nombreEmpleado.isEmpty()) {
			mostrarEmpleados(listaEmpleados);
		}else {
			System.out.println("Resultado de la busqueda:");
			for (Empleado empleado : listaEmpleados) {
				if(nombreEmpleado.equals(empleado.getNombre())) {
					contadorEmpleados++;
					sumaTotalSalarios+=empleado.getSalario();
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
		System.out.println("Resultados de la busqueda");
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
		int index=0, indexBorrar=0;
		for (Empleado empleado : listaEmpleados) {
			if(dniEmpleado.equals(empleado.getDni())) {
				System.out.println(empleado);
				nuevaListaEmpleados.add(empleado);
				indexBorrar=index;
			}
			index++;
		}
		listaEmpleados.remove(indexBorrar);
	}
}


