package cursos.Herencia;

public class Perro extends Animal{
	
	private String raza;
	private int edad;
	public Perro(String nombre, String raza, int edad) {
		super(nombre);
		this.raza = raza;
		this.edad = edad;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public void hacerSonido() {
		System.out.println("El perro es de raza " + raza + " Y se llama " + getNombre() + " tiene " + edad + " años y hace Gua Gua");
		super.hacerSonido();
	}
	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", edad=" + edad + "]";
	}
	
}

