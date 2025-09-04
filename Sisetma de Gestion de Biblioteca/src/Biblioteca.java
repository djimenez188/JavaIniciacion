import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Biblioteca {
    static Scanner sc = new Scanner(System.in);
    private static HashMap<String, Libro> catalogo = new HashMap<>();
    private static HashMap<String, Usuario> usuario = new HashMap<>();

    public Biblioteca(HashMap<String, Libro> catalogo, HashMap<String, Usuario> usuario) {
        Biblioteca.catalogo = catalogo;
        Biblioteca.usuario = usuario;
    }


    public static void agregarLibros() {

        while (true) {
            System.out.println("ISBN del libro");
            String ISBN = sc.nextLine().trim();
            if (!catalogo.containsKey(ISBN)) {
                System.out.println("Titulo del libro: ");
                String titulo = sc.nextLine().trim();
                System.out.println("Autor del libro: ");
                String autor = sc.nextLine().trim();
                System.out.println("Genero del libro: ");
                String genero = sc.nextLine().trim();

                System.out.println("¿Esta prestado del libro?(true/false): ");
                boolean estaPrestado = sc.hasNextBoolean();
                sc.nextLine();

                Libro libro = new Libro(titulo, autor, genero, estaPrestado);
                catalogo.put(ISBN, libro);
                System.out.println("Libro agregado correctamente.");

            } else {
                System.out.println("Hay un libro con el mismo ISBN registrado ");
            }
            System.out.println("Sí desea continuar agregando libros presiona (s/n)");
            String continuar = sc.nextLine();
            if (continuar.equalsIgnoreCase("n")) {
                Pantallas.pantallaInicio();
                break;
            }

        }
    }

    public static void registrarUsuarios() {

        while (true) {
            System.out.println("ID Usuario");
            String ID = sc.nextLine().trim();
            if (!catalogo.containsKey(ID)) {
                System.out.println("Nombre del usuario: ");
                String nombre = sc.nextLine().trim();
              //Aqui pasamos un aralist vacio para inciar el registro
                ArrayList<Libro> listaVacia = new ArrayList<>();
                Usuario user = new Usuario(nombre,listaVacia);
                usuario.put(ID, user);
            } else {
                System.out.println("El ID ya esta registrado en el sistema. ");
            }
            System.out.println("Si desas continuar agregando usuarios presiona (s/n)");
            String continuar = sc.nextLine();
            if(continuar.equalsIgnoreCase("n")){
                Pantallas.pantallaInicio();
                break;
            }
        }
    }
    public static void prestarLibro(){
        for(String l: catalogo.keySet()){
            System.out.println(l);
        }
    }
}
