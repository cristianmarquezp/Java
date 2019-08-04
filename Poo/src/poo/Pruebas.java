package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trabajador1 = new Empleados("Cristian");
		Empleados trabajador2 = new Empleados("David");
		
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
		
		trabajador1.cambiaSeccion("Recursos Humanos");
		System.out.println(trabajador1.devuelveDatos());
		
		System.out.println(trabajador1.devuelveDatos());
	}

}

class Empleados{
	public Empleados(String nom) {
		nombre= nom;
		seccion = "Administracion";
		
	}
	
	public void cambiaSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public String devuelveDatos() {
		return "El nombre es: " + this.nombre + " y la seccion es: " + this.seccion;
		
	}
	

	private final String nombre;
	private String seccion;
}
