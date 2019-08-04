package poo;

import java.security.Signature;

public class Pruebas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados2 empleado1 = new Empleados2("Cristian");
		System.out.println(empleado1.dameDatos());
		
		Empleados2 empleado2 = new Empleados2("David");
		
		System.out.println(empleado2.dameDatos());
		
		System.out.println(Empleados2.dameIdSiguiente());
		System.out.println("Este es hecho en mi pc");
		
		///MEOTODO STATIC
		
		

	}

}


class Empleados2{
	
	public Empleados2(String nom) {
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