package poo;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		
		Class1 clase1 = new Class1();
		
		System.out.println("El carro tiene: " + clase1.num_llantas() + " ruedas");
		
		clase1.set_color();
		System.out.println(clase1.get_color());
		clase1.personalizar_color("Reeed");
		System.out.println(clase1.get_color());
		
		
		clase1.configura_asientos("SI");
		System.out.println(clase1.dime_asientos());
		
		//Herencia
		Class1 micoche1  = new Class1();
		micoche1.personalizar_color("Rosadito");
		Furgoneta miFurgoneta1 = new Furgoneta(4, 100);
		miFurgoneta1.personalizar_color("Negrita");
		miFurgoneta1.configura_asientos("SI");
		System.out.println(miFurgoneta1.dime_asientos());

	}

}
