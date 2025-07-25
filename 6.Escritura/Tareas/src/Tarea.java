import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Tarea {
    private String nombre;
    private String descripcion;
    private Prioridad prioridad ;
    private Estado estado;

    public Tarea(String nombre, String descripcion, Prioridad prioridad, Estado estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public Estado getEstado() {
        return estado;
    }
    public String toCSV(){
        return nombre + ";" + descripcion +";" + prioridad +";" + estado;
    }
    // Construye una tarea a partir de una línea CSV
    public static Tarea fromCSV(String linea) {
        String[] partes = linea.split(";");
        return new Tarea(
                partes[0],
                partes[1],
                Prioridad.valueOf(partes[2]),
                Estado.valueOf(partes[3])
        );
    }
    public String toString(){
        return nombre + "(" + descripcion +")" + prioridad +"\n" + estado;
    }

}
