import java.util.ArrayList;

public class Usuario {
    public String nombre;
    public String idUsuario;
    ArrayList<Libro> libroPrestado = new ArrayList<>();

    public Usuario(String nombre, String idUsuario, ArrayList<Libro> libroPrestado) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.libroPrestado = libroPrestado;
    }
}
