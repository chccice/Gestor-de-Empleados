/**
 * En  esta clase vamos a almacenar toda la logica de la aplicacion , siendo una mala practica pues habria que hacerlo en varias clases.
 */
package com.cice.negocio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import com.cice.plantillas.Departamento;
import com.cice.plantillas.Empleado;

/**
 * @author carlos
 *
 */
public class EmpresaServicio {
	
	ArrayList<Empleado> empleados = new ArrayList<>();
	ArrayList<Departamento> departamentos = new ArrayList<>();
	
	/**
	 * Este metodo {@link #accesoAPP()} premite la entrada controlada a la aplicación
	 */
	public void accesoAPP() {
		showMenu();
	}
	/**
	 * este metodo {@link #showMenu()} Nos muestra el menu de la aplicacion
	 */
	private void showMenu(){
		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("		----------- Gestor de Empresa 0.1 ----------		");
			System.out.println(" Este es el menú de usuario");	
			System.out.println(" 1.- Crear empleado.");
			System.out.println(" 2.- Crear departamento.");
			System.out.println(" 3.- Mostrar departamentos.");
			System.out.println(" 4.- Mostrar empleados.");
			System.out.println(" 5.- Asignar director.");
			System.out.println(" 6.- Asignar empleados a departamentos.");
			System.out.println(" 7.- Mostrar organigrama.");
			System.out.println(" 0.- Salir.");
			System.out.println(" Elija una opción");
			System.out.print(">>>");
			opcion = sc.nextInt();
			controles(opcion);
			}while(opcion != 0);
	}
	/**
	 * {@link #controles(int)} Este metodo es la manera que vamos acceder a los distintos metodos de la aplicación.
	 * tiene un parametro de entrada INT que es la opcion proporcionada por el usuario en el metodo {@link #showMenu()}
	 * @param opcion
	 */
	private void controles(int opcion) {
		switch(opcion) {
		case 1 : crearEmpleado();
			break;
		case 2 : crearDepartamento();
			break;
		case 3 : mostrarDepartamentos();
			break;
		case 4 : mostrarEmpleados();
			break;
		case 5 : asignarDirector(); 
			break;
		case 6 : asignarEmpleadosADepartamentos();
			break;
		case 7 : mostrarOrganigrama();
			break;
		case 0 : System.out.println("Gracias por usar Gestor de Empresa 0.1"); 
			break;
			}
		}
	/**
	 * Este metodo {@link #crearEmpleado()} Realiza la funcion de generar nuevos empleados.
	 */
	private void crearEmpleado() {
		Empleado emp = new Empleado();
		Scanner sc = new Scanner(System.in);
			System.out.println("Bienvenido a la creación de empleados.");
			System.out.println("--------------------------------------");
			System.out.println("Indique el nombre del empleado");
			System.out.print(">>>");
			emp.setNombre(sc.nextLine());
			System.out.println("");
			System.out.println("Indique el apellido del empleado");
			System.out.print(">>>");
			emp.setApellido(sc.nextLine());
			System.out.println("");
			empleados.add(emp);
	}
	/**
	 * En este metodo creamos todos los departamentos de la aplicacion
	 */
	private void crearDepartamento() {
		Departamento dmp = new Departamento();
		Scanner sc = new Scanner(System.in);
			System.out.println("Bienvenido a la creación de departamentos.");
			System.out.println("--------------------------------------");
			System.out.println("Indique el nombre del departamento");
			System.out.print(">>>");
			dmp.setNombre(sc.nextLine());
			System.out.println("");
			departamentos.add(dmp);
	}
	/**
	 * Mostramos todos los departamentos que hay en la base de datos.
	 */
	private void mostrarDepartamentos() {
		int incremento = 0;
			++incremento;
			System.out.println("Estos son todos tus departamentos.");
			System.out.println("");
			for (Departamento departamento : departamentos) {
				System.out.println(incremento + departamentos.indexOf(departamento)+".- "+ departamento.getNombre());
			}
	}
	/**
	 * Mostramos todos los empleados de la base de datos.
	 */
	private void mostrarEmpleados() {
		int incremento = 0;
		++incremento;
			System.out.println("Estos son todos tus empleados.");
			System.out.println("");
			for (Empleado empleado : empleados) {
				System.out.println(incremento + empleados.indexOf(empleado)+".- "+empleado.getNombre()+" "+empleado.getApellido());
				
			}
	}
	/**
	 * Asignar director al departamento, hace uso de {@link #mostrarDepartamentos()} y {@link #mostrarEmpleados()} en estos metodos
	 * se uso un incremento para que al mostrar los distintos campos empiece por 1.
	 * se hace uso de u decremento al seleccionar , puesto que los ArrayList su posicion primera es 0;
	 *
	 */
	private void asignarDirector() {
	//	Departamento dmp = new Departamento();
		Scanner sc = new Scanner(System.in);
		int departamentoSelecionado;
		int empleadoSelecionado;
			System.out.println("--------------------------------------");
			mostrarDepartamentos();
			System.out.println("Elija un departamento al que quiera asignar un director.");
			System.out.print(">>>");
			departamentoSelecionado = sc.nextInt();
			System.out.println("Ha elegido usted el departamento "+(departamentos.get((-1+departamentoSelecionado)).getNombre()));
			System.out.println("--------------------------------------");
			mostrarEmpleados();
			System.out.println("Elija el empleado que quiere asignar como director.");
			System.out.print(">>>");
			empleadoSelecionado = sc.nextInt();
			departamentos.get(-1+departamentoSelecionado).setDirector(empleados.get(-1+empleadoSelecionado));
			System.out.println("Ha elegido usted como director a " + empleados.get(-1+empleadoSelecionado).getNombre()+
								" "+empleados.get(-1+empleadoSelecionado).getApellido());
			System.out.println("=======================================================================");
	}
	private void asignarEmpleadosADepartamentos() {
		Scanner sc = new Scanner(System.in);
		int departamentoSelecionado;
		int[] idSelecionada;
			System.out.println("--------------------------------------");
			mostrarDepartamentos();
			System.out.println("Elija un departamento al que quiera asignar empleado.");
			System.out.print(">>>");
			departamentoSelecionado = Integer.parseInt(sc.nextLine());
			System.out.println("Ha elegido usted el departamento "+(departamentos.get((-1+departamentoSelecionado)).getNombre()));
			System.out.println("--------------------------------------");
			mostrarEmpleados();
			System.out.println("Elija los empleados que quiere asignara al departamento separados por comas ejemplo 1,2,3,4.");
			System.out.println("");
			System.out.print(">>>");
			
			
			//idSelecionada = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
			//departamentos.stream().anyMatch(k -> k.getNombre().equals("Gustavo"));
			//listaDepartamentos.stream().allMatch(k -> k.getDirector().getNombre().equals("Gustavo"));
		/**
		 * Recibie la información por  la variable string empleado selecionado
		 * donde se almacena en una variable auxiliar asi convertir los caracteres en un array por el metodo .split()
		 * inicializamos el array int[pasando la información del ]  
		 */
		String empleadoSelecionado = sc.nextLine();
		String[] aux = empleadoSelecionado.split(",");
		idSelecionada = new int[aux.length];
			for(int i = 0; i < aux.length; i++ ) {
				idSelecionada[i] = Integer.parseInt(aux[i]);
		}
			for (int idLista : idSelecionada) {
				departamentos.get(departamentoSelecionado).getEmpleados().add(empleados.get(idLista));
			}
			System.out.println("Estos son los empleados añadidos al departamento ");
			for(Empleado emp : departamentos.get(departamentoSelecionado).getEmpleados()){
				System.out.println(emp.getNombre()+ "" + emp.getId().toString());
				
			}
			
			
			
			
	}
	
	/**
	 * Este metodo copiado del codigo de Sergio ;! está muy logrado, ademas de hacer una comprobación de que realmente
	 * todo está funcionando correctamente.
	 */
	private void mostrarOrganigrama() {
				System.out.println("");
			for (Departamento departamento : departamentos) {	
				System.out.println(departamento.getNombre().toUpperCase());
			if(departamento.getDirector()!=null) {
				System.out.println("\tDirector: "+departamento.getDirector().getNombre());
			}else {
				System.out.println("\tDirector: no asignado");
			}
			departamento.mostrarPersonal();
			
		}

	}
}
