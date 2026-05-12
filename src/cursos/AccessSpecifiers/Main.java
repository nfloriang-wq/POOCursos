package cursos.AccessSpecifiers;

public class Main {

	public static void main(String args[] ) {
		
		Automovil A1 = new Carro("Mazda", "2019", 67000.00, "P-455GFT");
		
		Automovil A2 = new Carro("Audi", "2023", 75000.00, "M-17510GH");
		
		A1.informacion();
		A2.informacion();
	}
	
}
