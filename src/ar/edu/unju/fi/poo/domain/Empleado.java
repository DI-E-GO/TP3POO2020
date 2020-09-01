package ar.edu.unju.fi.poo.domain;

import java.time.LocalDate;

public class Empleado {
	private Integer id;
	private int legajo;
	private String dni;
	private String nombre;
	private LocalDate fechaIngreso;
	private float salario;
	private int antiguedad;
	//variable para que se incremente automaticamente al crear un Empleado su ID correspondiente
	private static int empleadoId=0;
	
	/**
	 * Costructor por defecto de Empleado (sin parametros)
	 */
	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Contructor que recibe todos los atributos de un Empleado
	 * @param id
	 * @param legajo
	 * @param dni
	 * @param nombre
	 * @param fecha
	 * @param salario
	 * @param antiguedad
	 */
	public Empleado(Integer id, int legajo, String dni, String nombre, LocalDate fechaIngreso, float salario, int antiguedad) {
		super();
		this.id = id;
		this.legajo = legajo;
		this.dni = dni;
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
		this.antiguedad = antiguedad;
	}
	
	/**
	 * Constructor parametrizado con algunos atributos de la clase Empleado, genera id y antiguedad de un empleado automaticamente
	 * @param legajo
	 * @param dni
	 * @param nombre
	 * @param fechaIngreso
	 * @param salario
	 */
	public Empleado(int legajo, String dni, String nombre, LocalDate fechaIngreso, float salario) {
		super();
		LocalDate fechaActual = LocalDate.now();
		empleadoId++;
		this.id = empleadoId;
		this.legajo = legajo;
		this.dni = dni;
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
		this.antiguedad = fechaActual.getYear()-fechaIngreso.getYear();
	}

	//Metodos Accesores
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDate fecha) {
		this.fechaIngreso = fecha;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	//Punto 2 de Trabajo Practio sobreescribir el método toString para obtener el formato solicitado
	@Override
	public String toString() {
		return "Legajo=" + String.format("%011d",legajo) + "- Dni=" + dni + " - Nombre=" + nombre + " - Fecha de Ingreso="
				+ String.format("%02d",fechaIngreso.getDayOfMonth())+"/"+String.format("%02d",fechaIngreso.getMonthValue())+"/"+fechaIngreso.getYear() + 
				" - Salario=" + (int)salario + " - Antiguedad=" + antiguedad+ " años";
	}	
	
	
}
