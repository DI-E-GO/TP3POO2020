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
	
	/**
	 * Costructor por defecto de Empleado
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

	@Override
	public String toString() {
		return "Legajo=" + String.format("%011d",legajo) + "- Dni=" + dni + " - Nombre=" + nombre + " - Fecha de Ingreso="
				+ String.format("%02d",fechaIngreso.getDayOfMonth())+"/"+String.format("%02d",fechaIngreso.getMonthValue())+"/"+fechaIngreso.getYear() + 
				" - Salario=" + salario + " - Antiguedad=" + antiguedad+ " años";
	}	
	
	
}
