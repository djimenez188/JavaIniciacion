import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.ArrayList;

public class Sistema {

    static Scanner scanner = new Scanner(System.in);
    static HashMap<Integer, Estudiante> estudiantes = new HashMap<>();
    static int contador = 0;

    public static void main(String[] args) {


        int controlador;

        do {
            mostrarMenuPrincipal();
            controlador = scanner.nextInt();
            scanner.nextLine();

            switch (controlador) {
                case 1:
                    PantallaAgregarEstudiantes();
                    break;
                case 2:
                    PantallaVerEstudiantes();
                    break;
                case 3:
                    PantallaBuscarEstudiantes();
                    break;
                case 4:
                    PantallaActualizarEstudiante();
                    break;
                case 5:
                    PantallaRemoveEstudiante();
                    break;
                case 6:
                    PantallaEstudianteCurso();
                    break;
                case 7:
                    PantallaEstadistica();
                    break;
                case 0:
                    System.out.println("El sistema finalizo su ejecución");
                    break;
            }

        } while (controlador != 0);
    }


    public static void mostrarMenuPrincipal() {
        System.out.println("----SISTEMA DE GESTIÓN DE ESTUDIANTES----");
        System.out.println("1.Agregar estudiante");
        System.out.println("2.Ver todos los estudiantes");
        System.out.println("3.Buscar estudiantes por ID");
        System.out.println("4.Actualizar estudiante");
        System.out.println("5.Eliminar estudiante");
        System.out.println("6.Ver estudiante por curso");
        System.out.println("7.ver estadísticas");
        System.out.println("0.Salir");
    }

    public static void PantallaAgregarEstudiantes() {
        limpiarConsola();
        System.out.println("Introduce el nombre del estudiante:");
        String name = scanner.nextLine();
        System.out.println("Introduce su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Indica el curso que esta realizando: ");
        String input = scanner.next().toUpperCase();
        Curso curso = Curso.valueOf(input);


        Estudiante estudiante = new Estudiante(name, edad, curso);
        estudiantes.put(contador, estudiante);
        contador++;

        System.out.println("Presiona enter para salir al menu principal ");
        scanner.nextLine();
        limpiarConsola();
    }

    public static void PantallaVerEstudiantes() {
        for (Map.Entry<Integer, Estudiante> entry : estudiantes.entrySet()) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());

        }
        System.out.println("Presiona enter para regresar al menu principal");
        scanner.nextLine();
    }

    public static void PantallaBuscarEstudiantes() {
        System.out.println("Introduce el valor ID del estudiante que desas encontrar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Estudiante estudiante = estudiantes.get(id);
        if (estudiante != null) {
            System.out.println("Estudiante encontrado " + estudiante);
        } else {
            System.out.println("Estudiante no encontrador");
        }

        System.out.println("Presiona enter para regresar al menu principal ");
        scanner.nextLine();
        limpiarConsola();

    }

    public static void PantallaActualizarEstudiante() {
        System.out.println("Introduce el ID que desas modificar");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce el nombre del estudiante:");
        String name = scanner.nextLine();
        System.out.println("Introduce su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Indica el curso que esta realizando: ");
        String input = scanner.next().toUpperCase();
        Curso curso = Curso.valueOf(input);

        Estudiante estudiante = new Estudiante(name, edad, curso);
        estudiantes.put(id, estudiante);

        System.out.println("Presiona enter para regresar al menu principal ");
        scanner.nextLine();
        limpiarConsola();
    }

    public static void PantallaEstudianteCurso(){

        }

        public static void PantallaRemoveEstudiante() {
        System.out.println("Introduce el ID que desas modificar");
        int id = scanner.nextInt();
        scanner.nextLine();

        estudiantes.remove(id);
        System.out.println("Presiona enter para regresar al menu principal ");
        scanner.nextLine();
        limpiarConsola();
    }

    public static void PantallaEstadistica() {
        int primero = 0, segundo = 0, tercero = 0, cuarto = 0;
        for (Estudiante e : estudiantes.values()) {
            switch (e.getCurso()) {
                case PRIMERO:
                    primero++;
                    break;
                case SEGUNDO:
                    segundo ++;
                    break;
                case TERCERO:
                    tercero ++;
                    break;
                case CUARTO:
                    cuarto ++;
                    break;
            }
        }
        System.out.println("El numero de estudiantes que estudian primero es de " + primero + ", segundo " + segundo + ", tercero " + tercero + ", cuarto" + cuarto + "." );
    }

    public static void limpiarConsola() {
        for (int i = 0; i < 50; i++) System.out.println();
    }
}



