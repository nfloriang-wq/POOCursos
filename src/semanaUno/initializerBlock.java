package semanaUno;

public class initializerBlock { 

    String nombre;
    static int contarJugadores;

    static {
        contarJugadores = 0;
        System.out.println("Iniciado Partida - Jugadores en línea: " + contarJugadores);
    }

    {
        contarJugadores++;
        System.out.println(" Registrando nuevo jugador");
    }

    public initializerBlock(String nombre) {
        this.nombre = nombre;
        System.out.println("Jugador *" + nombre + "* ha entrado a la partida.");
    }

    public static void main(String[] args) {
        initializerBlock j1 = new initializerBlock("Fg_Miguel");
        System.out.println("Jugadores en partida: " + initializerBlock.contarJugadores);
        
        System.out.println("---");
        
        initializerBlock j2 = new initializerBlock("Shadow");
        System.out.println("Jugadores en partida: " + initializerBlock.contarJugadores);
    }
} 