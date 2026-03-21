package semanaUno;

public class valorReferencia {

    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        System.out.println("Antes de modify: x = " + x + ", y = " + y);
        
        modify(x, y);
        
        System.out.println("Después de modify: x = " + x + ", y = " + y);
        System.out.println("Los valores no cambiaron porque en Java los primitivos se pasan por VALOR.");
    }

    public static void modify(int x1, int y1) {
        x1 = 5;
        y1 = 10;
    }
}
