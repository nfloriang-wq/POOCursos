package semanaUno;
import java.lang.annotation.Annotation;

<<<<<<< HEAD

public class paquete{
    static int conteo = 0;

    {
        conteo++;
    }

    public static void main(String[] args) {
        new paquete();
        new paquete();
        new paquete();
        new paquete();
        new paquete();
        System.out.println("Paquetes recibidos: " + conteo);
    }
=======
public class paquete {

	
	public static void main(String[] args) {
Annotation[] anotaciones = paquete.class.getAnnotations();
        
        System.out.println("Anotaciones encontradas: " + anotaciones.length);
	}
>>>>>>> db1161d9b5e7d703639b40ca88ce6e49378afdc4
}
