import java.io.BufferedWriter;
import java.io. *;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class GestorTareas {
    private static final String Archivo = "tareas.txt";


    // Mètodo para guardar una lista de tareas en el archivo
    public static void guardarTareas(List<Tarea> tareas) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(Archivo, true))) {
            for (Tarea tarea : tareas) {
                escritor.write(tarea.toCSV());
                escritor.newLine();
            }
            System.out.println("Tarea guardad con éxito.");
        } catch (Exception e) {
            System.out.println("Error al guardar la tarea " + e.getMessage());
        }
    }

    public static List<Tarea> leerTareas() {
        List<Tarea> tareas = new ArrayList<>();

        try (BufferedReader lector = new BufferedReader(new FileReader(Archivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                Tarea tarea = Tarea.fromCSV(linea);
                tareas.add(tarea);
            }
        } catch (IOException e) {
            System.out.println("❌ Error al leer tareas: " + e.getMessage());
        }

        return tareas;
    }


    public static void main(String[] args) {
        List<Tarea> tareas = Arrays.asList(
                new Tarea("Estudiar Java", "Repasar Streams y Enums", Prioridad.ALTA, Estado.PENDIENTE),
                new Tarea("Ir al gimnasio", "Entrenar pierna", Prioridad.MEDIA, Estado.EN_PROCESO),
                new Tarea("Leer un libro", "Capítulo 3 de Clean Code", Prioridad.BAJA, Estado.COMPLETADO)
        );
        guardarTareas(tareas);

        // Leer tareas desde archivo
        List<Tarea> leidas = leerTareas();
        System.out.println("Tareas guardadas:");
        leidas.forEach(t -> System.out.println(t + "\n"));
    }
}
