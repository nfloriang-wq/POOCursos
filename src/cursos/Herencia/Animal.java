package cursos.Herencia;

public class Animal {

	private String nombre;

	public Animal(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void hacerSonido() {
		System.out.println("El animal esta haciendo sonido");
		
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + "]";
	}
	
	
	
}