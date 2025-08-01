import java.util.Scanner;
public class Pantallas {
    static Scanner sc = new Scanner(System.in);
    static int seleccion;

    //Pantalla inicial del programa
    public static void pantallaInicio() {
        System.out.println("1. Agregar libros a la biblioteca");
        System.out.println("2. Agregar usuarios");
        System.out.println("3. Permitir que los usuarios puedan tomar prestado y devolver");
        System.out.println("4. LLevar un registro de los libros prestados y disponibles");
        System.out.println("5. Buscar libros por titulo, autor o género");
        seleccion = sc.nextInt();

        switch (seleccion) {
            case 1:
                pantallaAgregarLibros();
                break;
        }
    }
    public static void pantallaAgregarLibros(){
        saltoPagina();
        System.out.println("Sistema para agregar libros a la biblioteca: ");
        Biblioteca.agregarLibros();
    }

    public static void saltoPagina(){
        for(int i = 0; i < 15; i++) {
            System.out.println(" ");
        }
    }

}
