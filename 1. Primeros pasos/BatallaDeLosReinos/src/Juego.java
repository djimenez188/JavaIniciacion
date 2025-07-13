import java.nio.channels.UnsupportedAddressTypeException;
import java.util.Scanner;

public class Juego {
    private Jugador jugador;
    private Scanner scanner;

    public Juego() {
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println("Bienvenido a BATALLA DE LOS REINOS!");
        System.out.println("Ingresa tu nombre de guerrero");
        String nombre = scanner.nextLine();

        jugador = new Jugador(nombre);

        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            ejecutarOpcion(opcion);
        } while (opcion != 4);
    }

    private void mostrarMenu() {
        System.out.println("\n==== MENÚ DEL JUEGO ====");
        System.out.println("1. Ver estadísticas");
        System.out.println("2. Entrar en combate");
        System.out.println("3. Curarse");
        System.out.println("4. Salir del video juego");
        System.out.println("Elige una opción: ");
    }

    private void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                verEstadistica();
                break;
            case 2:
                combatir();
                break;
            case 3:
                jugador.curarse();
            case 4:
                System.out.println("Hasta la proxima guerrero");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    private void verEstadistica() {
        System.out.println("\n Estadísticas de " + jugador.getNombre());
        System.out.println(" Vida: " + jugador.getVida());
        System.out.println("Ataque: " + jugador.getAtaque());
        System.out.println("Defensa: " + jugador.getDefensa());
    }

    private void combatir() {
        Enemigo enemigo = new Enemigo();

        System.out.println("\n ! Un enemigo aparece!");
        System.out.println("Jugador " + jugador.getNombre() + " tú vida és de " + jugador.getVida() + " tú capacidad de ataque es de " + jugador.getAtaque());
        System.out.println("Enemigo -> Vida: " + enemigo.getVida() + ", Ataque " + enemigo.getAtaque());

        while (jugador.getVida() > 0 && enemigo.getVida() > 0) {
            int danioJugador = jugador.getAtaque() - enemigo.getDefensa();
            if (danioJugador < 0) danioJugador = 0;
            enemigo.recibirDanio(danioJugador);
            System.out.println("Atacaste al enemigo i le causaste" + danioJugador + " de daño. Vida enemiga: " + enemigo.getVida());

            if (enemigo.getVida() <= 0) {
                System.out.println("Has vencido al enemigo");
                break;
            }
            int danioEnemigo = enemigo.getAtaque() - jugador.getDefensa();
            if (danioEnemigo < 0) danioEnemigo = 0;
            jugador.recibirDanio(danioEnemigo);
            System.out.println("El enemigo te ataca y te causa " + danioEnemigo + " de daño. Tu vida: " + jugador.getVida());

            if (jugador.getVida() <= 0) {
                System.out.println("¡Has sido derrotado!");
                break;
            }
        }
    }
}
