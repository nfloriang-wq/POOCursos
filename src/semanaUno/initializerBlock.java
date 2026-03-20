package semanaUno;

public class initializerBlock {

    static int staticVariable;
    int nonStaticVariable;

    static {
        System.out.println("Static initialization.");
        staticVariable = 2;
    }

    {
        System.out.println("Instance initialization.");
        nonStaticVariable = 8;
    }

    public initializerBlock() {
        System.out.println("Constructor.");
    }

    public static void main(String[] args) {
        new initializerBlock();
        
        new initializerBlock();
    }
}
