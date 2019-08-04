package poo;

public class Main {

	public static void main(String[] args) {
		
		Class1 clase1 = new Class1();
		
		System.out.println("El carro tiene: " + clase1.num_llantas() + " ruedas");
		
		clase1.set_color();
		System.out.println(clase1.get_color());
		clase1.personalizar_color("Reeed");
		System.out.println(clase1.get_color());
		
		
		clase1.configura_asientos("SI");
		System.out.println(clase1.dime_asientos());

	}

}
