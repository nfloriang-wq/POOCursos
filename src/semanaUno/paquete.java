package semanaUno;
import java.lang.annotation.Annotation;

public class paquete {

	
	public static void main(String[] args) {
Annotation[] anotaciones = paquete.class.getAnnotations();
        
        System.out.println("Anotaciones encontradas: " + anotaciones.length);
	}
}
