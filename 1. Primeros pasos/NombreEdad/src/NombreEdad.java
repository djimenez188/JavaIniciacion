import java.util.Scanner;

public class NombreEdad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la edad que tienes");
        int edad = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Intrduce tu nombre");
        String nombre = entrada.nextLine();

        System.out.println("Hola " + nombre + ", tines " + edad + " años.");

        entrada.close();

    }
}
