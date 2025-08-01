import java.util.*;

public class Voto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> candidato = new HashMap<>();
        HashMap<Integer, Estudiante> estudiante = new HashMap<>();

        // El estudiante se propone introducir el voto

        while (true) {


            System.out.println("Introduce el numero de matricula: ");
            int matricula = sc.nextInt();
            sc.nextLine();
            if (estudiante.containsKey(matricula)) {
                System.out.println("El estudiante voto anteriormente ");
            } else {
                System.out.println("Introduce el nombre del estudiante: ");
                String nombre = sc.nextLine();

                System.out.println("Introduce el nombre del candidato: ");
                String nombreCandidato = sc.nextLine();
                candidato.put(nombreCandidato, candidato.getOrDefault(nombreCandidato, 0) + 1);

                Estudiante estudianteObjeto = new Estudiante(nombre, +1);

                estudiante.put(matricula, estudianteObjeto);
            }
            System.out.println("Deseas introducir un nuevo estudiante?(s/n) ");

            String respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase("n")) {
                break;
            }
        }

        for (Map.Entry<Integer, Estudiante> entry : estudiante.entrySet()) {

            System.out.println("El alumno con identificador " + entry.getKey() + " y " + entry.getValue());
        }
        System.out.println();
        for(Map.Entry<String, Integer> entry: candidato.entrySet()){
            System.out.println("El candidato con nombre " + entry.getKey()+ " tine un numero " +entry.getValue()+ " de votos");
        }
        List<Map.Entry<String, Integer>> listaOrdenada = new ArrayList<>(candidato.entrySet());
        listaOrdenada.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        System.out.println();
        System.out.println("Resultados ordenados");
        System.out.println();
        for(Map.Entry<String, Integer> entry: listaOrdenada){
            System.out.println("El candidato con nombre " + entry.getKey()+ " tine un numero " +entry.getValue()+ " de votos");
        }
    }

}
