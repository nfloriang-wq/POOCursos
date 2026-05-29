package cursos.Sobrecarga;

public class sobrecargaCalculadora {

	public int sumar(int a, int b) {
        return a + b;
    }
	
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        sobrecargaCalculadora calc = new sobrecargaCalculadora();
        
        int sumaDosEnteros = calc.sumar(8, 10);
        int sumaTresEnteros = calc.sumar(7, 10, 8);
        double sumaDosDecimales = calc.sumar(7.5, 5.5);

        System.out.println("Suma de dos enteros (8 + 10): " + sumaDosEnteros);
        System.out.println("Suma de tres enteros (7 + 10 + 8): " + sumaTresEnteros);
        System.out.println("Suma de dos decimales (7.5 + 5.5): " + sumaDosDecimales);
    }
}
