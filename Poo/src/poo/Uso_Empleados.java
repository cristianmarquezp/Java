package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleados {

	public static void main(String[] args) {
		
		Empleado[] misEmpleados = new Empleado[4];
		
		misEmpleados[0]  = new Empleado("Cristia", 1, 1960, 5, 5);
		
		misEmpleados[1]  = new Empleado("David", 2, 1970, 6, 6);
		misEmpleados[2]  = new Empleado("Marquez", 2, 1980, 7, 7);
		misEmpleados[3]  = new Empleado("Bruno");
		
		for (int i = 0; i < misEmpleados.length; i++) {
			misEmpleados[i].sube_sueldo(10.0);
		}
		
		for (Empleado e: misEmpleados) {
			System.out.println("El nombre es: " + e.dameNombre() + 
					" Gana: " + e.dameSueldo() + " Fecha de alta: " + e.dameFechaContrato());
		}
		

	}
	

}


class Empleado{
	
	public  Empleado(String nom, double sue, int anio, int mes, int dia) {
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes, dia) ;
		altaContrato = calendario.getTime();
	}
	
	public Empleado(String nom) {
		this(nom, 200,2000,01,01);
	}
	
	
	public String dameNombre() {
		return this.nombre;
	}
	
	public double dameSueldo() {
		return this.sueldo;
	}
	
	public void sube_sueldo(double porcentaje) {
		double aumento= sueldo*porcentaje/100;
		sueldo=+aumento;
	}
	
	public Date dameFechaContrato() {
		return altaContrato;
	}
	
	
	private String nombre;
	private double sueldo;
	private Date altaContrato; 
	

}


class Jefatura extends Empleado{
	public Jefatura (String nom, double sue, int anio, int mes, int dia) {
		super(nom, sue, anio, mes, dia);
		
	}
	
	private double incentivo;
	
	public void estableceIncentivo(double b) {
		incentivo =b;
			
	}
	
	public double dameSueldo() {
		double sueldoJefe = super.dameSueldo();
		
		return sueldoJefe+incentivo;
	}
}
