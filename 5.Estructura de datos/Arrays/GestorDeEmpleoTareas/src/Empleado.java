import java.util.LinkedList;

public class Empleado extends Persona {
    private int id;
    LinkedList<String> tareas = new LinkedList<>();

    public Empleado(String nombre, int edad, int id) {
        super(nombre, edad);
        this.id = id;
    }

    public void assignarTareas(String tarea) {
        tareas.add(tarea);
    }

    public String listarTareas() {
        if(tareas.isEmpty()){
            return "El empleado " + getNombre() + "no tiene ninguna tarea asignada.";
        }
        String resultado = "El empleado " + getNombre() + ":\n";
        for(String tarea : tareas){
            resultado += "- " + tarea + "\n";
        }
        return resultado;
    }
    public void mostrarInformacion() {
        System.out.println("El empleado agregado: " + getNombre() + "con la edad de: " + getEdad());


    }
}
