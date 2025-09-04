import java.util.ArrayList;

public class Usuario {
    public String nombre;
    ArrayList<Libro> libroPrestado = new ArrayList<>();

    public Usuario(String nombre, ArrayList<Libro> libroPrestado) {
        this.nombre = nombre;
        this.libroPrestado = libroPrestado;
    }
}
