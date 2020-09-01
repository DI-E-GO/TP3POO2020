package ar.edu.unju.fi.poo.util;

import ar.edu.unju.fi.poo.manager.EmpleadoManager;

public class Main {

	public static void main(String[] args) {
		String nombre="ed";
		int anios=14;
		String dni="00000000";
		
		//Genera los empleados
		
		EmpleadoManager.generarEmpleados();
		
		//Punto 3 del trabajo Practico, "nombre" es el valor a buscar en la lista de Empleados por partes de su nombre o nombre completo
		
		EmpleadoManager.buscarEmpleado(nombre);
		
		//Punto 4 del Trabajo Practico, "anios" es la cantidad de años de antiguedad de un Empleado, para buscar aquellos que sobrepasen esos años
		
		EmpleadoManager.mostrarPorAntiguedad(anios);
		
		//Punto 5.2 del Trabajo Practico, "dni" es el DNI de un Empleado en espacifico que se busca para poder moverlo a otra lista
		
		EmpleadoManager.quitarEmpleado(dni);
		
		// Se muestran las 2 listas de Empleados creadas
		
		EmpleadoManager.mostrarTodaListas();
	}
}
