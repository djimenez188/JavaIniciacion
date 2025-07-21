import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Estudiante {
    public String nombre;
    public int edad;
    public double notaFinal;

    public Estudiante(String nombre, int edad, double notaFinal) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaFinal = notaFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public String toString() {
        return ("El estudiante " + getNombre() + " con edad " + edad + " y nota final " + getNotaFinal());
    }

    public static void main(String[] args) {
        HashMap<String, Estudiante> estudiante = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        Estudiante e1 = new Estudiante("Mario", 25, 9.6);
        estudiante.put("45637944D", e1);
        Estudiante e2 = new Estudiante("Rocío", 34, 7.8);
        estudiante.put("45637434D", e2);
        Estudiante e3 = new Estudiante("David", 37, 8.0);
        estudiante.put("46377845H", e3);
        estudiante.remove("45637934D");
        System.out.println("\n");
        for (Map.Entry<String, Estudiante> entry : estudiante.entrySet()) {
            System.out.println("DNI: " + entry.getKey() + " -> " + entry.getValue());
        }
        //Búsqueda de estudiante por DNI
        System.out.println("Introduce el numero de DNI que desas consultar sus valores:");
        String consulta = scanner.nextLine();
        if (estudiante.containsKey(consulta)){
            System.out.println("\n El Estudiante buscado esta en la lista con los valores: " +estudiante.get(consulta));
        }else{
            System.out.println("El estudiante con DNI " + consulta +" no pertenece a la lista");
        }


    }
}
