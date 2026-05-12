package cursos.MethodOverloadingandOverriding;

public class Persona {
	
	public void Datos(String nombre) {
		System.out.println("Su nombre es: " + nombre);
		}
	public void Datos(String nombre, String DPI) {
		System.out.println("Su nombre es: " + nombre + " su DPI: " + DPI);
	}
	public void Datos(String nombre, String DPI, int edad) {
		System.out.println("Su nombre es: " + nombre + " su DPI: " + DPI + " y su edad: " + edad);
	}
}
