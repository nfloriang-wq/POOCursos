package semanaUno;
import java.lang.annotation.Annotation;

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
}

