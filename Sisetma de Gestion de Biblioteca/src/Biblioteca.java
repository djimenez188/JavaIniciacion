import java.util.HashMap;
import java.util.Scanner;

public class Biblioteca {
    static Scanner sc = new Scanner(System.in);
    private HashMap<String, Libro> catalogo = new HashMap<>();
    private HashMap<String, Usuario> usuario = new HashMap<>();

    public Biblioteca(HashMap<String, Libro> catalogo, HashMap<String, Usuario> usuario) {
     this.catalogo = catalogo;
     this.usuario = usuario;
    }

    public static void agregarLibros(){
        System.out.println("Titulo del libro: ");
        String titulo = sc.nextLine();
        System.out.println("Autor del libro: ");
        String autor = sc.nextLine();
        System.out.println("Genero del libro: ");
        String genero = sc.nextLine();
        System.out.println("ISBN del libro");
        String ISBN = sc.nextLine(); // Falta indicar si aparece o no antes
        System.out.println("Esta prestado del libro? ");
        boolean estaPrestado = sc.hasNextBoolean();

        Libro libro = new Libro(titulo, autor, genero, ISBN, estaPrestado );

    }
}
