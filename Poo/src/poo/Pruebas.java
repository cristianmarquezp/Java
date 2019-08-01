package poo;

import java.security.Signature;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados empleado1 = new Empleados("Cristian");
		System.out.println(empleado1.dameDatos());
		
		Empleados empleado2 = new Empleados("David");
		
		System.out.println(empleado2.dameDatos());
		
		System.out.println(Empleados.dameIdSiguiente());

	}

}


class Empleados{
	
	public Empleados(String nom) {
		this.nombre = nom;
		seccion = "Administracion";
		id = idSiguiente;
		idSiguiente++;
	}
	
	public void cambiarSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public String dameDatos() {
		return "El nombre es :" + nombre + "y esta en la seccion: " + seccion + " y el id es: " + id;
				
	}
	
   public static String dameIdSiguiente() {
	   return "El siguiente id es: " + idSiguiente;
   }
	
	private final String nombre;
	private String seccion;
	
	private int id; 
	private static int idSiguiente = 1;
	
}