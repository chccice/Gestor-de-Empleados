/**
 * 
 */
package com.cice.plantillas;

import java.util.ArrayList;

/**
 * @author carlos
 *
 */
public class Departamento {
	
	private String nombre;
	private String direccion;
	private String telefono;
	private Empleado director;
	private ArrayList<Empleado> empleados;
	

	
	public Departamento() {
		director = new Empleado();
		empleados = new ArrayList<>();
	}
	
	public Departamento(String nombre, String direccion, String telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Empleado getDirector() {
		return director;
	}
	public void setDirector(Empleado director) {
		this.director = director;
	}
	
	public Departamento(String nombre) {;
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	public void mostrarPersonal() {
		for (Empleado empleado : empleados) {
			System.out.println("\t \t -"+empleado.getNombre()+" "+ empleado.getApellido());
		}
	}
	
	
	
	

}
