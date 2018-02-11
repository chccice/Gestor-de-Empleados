/**
 * Arrancamos la aplicacion mostrando el menú y dentro de ese metodo se acede a todos los demás que estan encapsulados.
 */
package com.cice.principal;

import com.cice.negocio.EmpresaServicio;

/**
 * @author carlos
 *
 */
public class Main {
	public static void main(String[] args) {
			EmpresaServicio empresa = new EmpresaServicio();
			empresa.accesoAPP();

	}

}
