package cursos.Encapsulacion;

public class Main {

	public static void main(String[] args) {
		Persona p1 = new Persona("Miguel", "Florian", 18);
		Persona p2 = new Persona("Emilio", "Montana", 19);
		
		System.out.println("--- Datos de las personas ---");
		p1.mostrar();
		p2.mostrar();
		
	}
	
}
