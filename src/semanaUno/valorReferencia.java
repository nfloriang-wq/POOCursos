package semanaUno;

public class valorReferencia {

    public static void main(String[] args) {
        int x = 1;
        int y = 2;

<<<<<<< HEAD
        System.out.println("Antes de modificar: x = " + x + ", y = " + y);
        
        modify(x, y);
        
        System.out.println("Después de modificar: x = " + y + ", y = " + x);
=======
        System.out.println("Antes de modify: x = " + x + ", y = " + y);
        
        modify(x, y);
        
        System.out.println("Después de modify: x = " + x + ", y = " + y);
        System.out.println("Los valores no cambiaron porque en Java los primitivos se pasan por VALOR.");
>>>>>>> db1161d9b5e7d703639b40ca88ce6e49378afdc4
    }

    public static void modify(int x1, int y1) {
        x1 = 5;
        y1 = 10;
    }
}
