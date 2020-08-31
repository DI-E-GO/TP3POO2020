package ar.edu.unju.fi.poo.util;

import ar.edu.unju.fi.poo.manager.EmpleadoManager;

public class Main {

	public static void main(String[] args) {
		
		//String nombre="Pedro";
		String dni="11111111";
		EmpleadoManager.generarEmpleados();
		//EmpleadoManager.buscarEmpleado(nombre);
		//EmpleadoManager.mostrarPorAntiguedad(24);
		EmpleadoManager.quitarEmpleado(dni);
		System.out.println("Lista de Empleados:");
		EmpleadoManager.mostrarEmpleados(EmpleadoManager.listaEmpleados);
		System.out.println("Nueva lista de Empleados:");
		EmpleadoManager.mostrarEmpleados(EmpleadoManager.nuevaListaEmpleados);
	}

}
