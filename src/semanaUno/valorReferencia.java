package semanaUno;

public class valorReferencia {

    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        System.out.println("Antes de modificar: x = " + x + ", y = " + y);
        
        modify(x, y);
        
        System.out.println("Después de modificar: x = " + y + ", y = " + x);
    }

    public static void modify(int x1, int y1) {
        x1 = 5;
        y1 = 10;
    }
}
