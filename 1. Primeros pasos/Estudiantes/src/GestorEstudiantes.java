import java.util.ArrayList;
import java.util.Scanner;

public class GestorEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Creamos varias instancias de persona
        ArrayList<Persona> personas = new ArrayList<>();
        System.out.print("Indica el numero de Estudiantes a registrar: ");
        int cantidad = scanner.nextInt();

        for (int i = 0; i < cantidad; i++) {

            System.out.println("\n Persona #" + (i + 1));
            Persona persona = new Persona();
            persona.setName();
            persona.setAge();
            personas.add(persona);
        }
        System.out.println("Listado de personas ingresadas:");
        for (Persona p : personas) {
            System.out.println("Nombre: " + p.getName() + " Edad: " + p.getAge());
        }

    }
}
