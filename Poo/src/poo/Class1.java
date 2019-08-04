package poo;

public class Class1 {
	
	private int ancho;
	private int modelo;
	private int largo;
	private int motor;
	private int ruedas;
	private String color; 
	
	private boolean asientos_cuero;
	
	public Class1() {
		ancho = 2323;
		largo = 23;
		motor = 32;
		modelo = 323;
		ruedas = 4; 
	}
	
	public String num_llantas() {
		return "El coche tiene: " + ruedas + " llantas";
	}
	
	public void set_color() {
		color = "Azul";
	}

	public String get_color() {
		return "El color del carro es: " + color;
	}
	
	public void personalizar_color(String per_color) {
		color = per_color;
		
	}
	
	public void configura_asientos(String asientos_cuero) {
		//if (asientos_cuero == "SI") {
		if ("SI".equals(asientos_cuero)) {  //asientos_cuero.equalsIgnoreCase("si");
			this.asientos_cuero = true;
		}else {
			this.asientos_cuero = false;
		}
	}
	
	public String dime_asientos() {
		if (asientos_cuero == true) {
			return "El carro tiene asientos de cuero";
					
		}else {
			return "El carro no tiene asientos de cuero";
		}
	}
}
