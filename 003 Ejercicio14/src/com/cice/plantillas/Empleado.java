/**
 * 
 */
package com.cice.plantillas;

/**
 * @author carlos
 *
 */
public class Empleado {
	
	private String nombre;
	private String apellido;
	private String id;
	/**
	 * Constructores de la clase Empleado.
	 * @param nombre
	 * @param apellido
	 * @param id
	 */
	public Empleado() {
	}
	public Empleado(String nombre, String apellido, String id) {
		this.nombre = nombre;
		this.id = id;
		this.apellido = apellido;
		/**
		 * Métodos get/set , para manejar las variables privadas.
		 */
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
	

}
