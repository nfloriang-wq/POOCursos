package cursos.AccessSpecifiers;

public class Automovil {

	protected String marca;
	protected String año;
	protected double precio;
	public Automovil(String marca, String año, double precio) {
		super();
		this.marca = marca;
		this.año = año;
		this.precio = precio;
	}
	
	public void informacion() {
		System.out.println("--## Datos del Automovil ##--");
		System.out.println("Marca: " + marca);
		System.out.println("Año de lanzamiento: " + año);
		System.out.println("Precio: " + precio);
	}
}
