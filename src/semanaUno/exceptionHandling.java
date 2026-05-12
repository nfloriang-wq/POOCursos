package semanaUno;

public class exceptionHandling {

    public static void main(String[] args) {
        
        try {
            int myInit = Integer.parseInt("hello");
            
        } catch (NumberFormatException e) {
            System.out.println("Hay una duda sobre el programa?");
            
        } finally {
            System.out.println("Procesando");
        }

        System.out.println("Terminado");
    }

    private static void getInit() {
        try {
            int myInt = Integer.parseInt("hello");
        } catch (NumberFormatException e) {
            System.out.println("Error en getInit");
        }
    }
}
