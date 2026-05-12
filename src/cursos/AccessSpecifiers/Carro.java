package cursos.AccessSpecifiers;

public class Carro extends Automovil{

	private String placa;

	public Carro(String marca, String año, double precio, String placa) {
		super(marca, año, precio);
		this.placa = placa;
	}

	@Override
	public void informacion() {
		super.informacion();
		System.out.println("Su placa asignada es: " + placa);
	}	
}
