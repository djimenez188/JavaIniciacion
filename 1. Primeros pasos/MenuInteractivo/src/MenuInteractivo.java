import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int options;

        do {
            System.out.println("===== Main Menú =====");
            System.out.println("1. Play");
            System.out.println("2. Continue");
            System.out.println("3. Options ");
            System.out.println("4. Credits");
            System.out.println("5. Exit");
            options = scanner.nextInt();

            switch (options) {
                case 1:
                    System.out.println("Elige el player que desas para el video juego");
                    break;
                case 2:
                    System.out.println("Continua videojuego desde donde te quedaste");
                    break;
                case 3:
                    System.out.println("Configuración de opciones");
                    break;
                case 4:
                    System.out.println("Creador: DJV");
                    break;
                case 5:
                    System.out.println("Salir del videojuego");
                    break;
                default:
                    System.out.println("Option no válida.Intente de nuevo");
            }

        } while (options > 5);
        scanner.close();
    }
}
