import java.util.ArrayList;
import java.util.Scanner;

public class NombreEstudiantes {
    public static void main(String[] args) {

        ArrayList<String> alumno = new ArrayList<>();
        Scanner nombre = new Scanner(System.in);
        int i = 0;
        String buscar;
        do {
            System.out.println("Introduce el nombre del alumno: ");
            alumno.add(nombre.nextLine());
            System.out.println("Si desa introducir mas nombre presiona la tela 0 en caso contrario presione cualquier otra ");
            i = nombre.nextInt();
            nombre.nextLine();
        } while (i == 0);
        System.out.println("El nombre del alumno es: ");

        for (String nombres : alumno) {
            System.out.println(nombres);

        }
        System.out.println("Escribe el nombre de del alumno que deas buscar ");
        buscar = nombre.nextLine();

        if (alumno.contains(buscar)){
            System.out.println("El nombre del alumno se encontro en la lista " + buscar );
        }else{
            System.out.println("El nombre del alumno no esta en la lista");
        }

    }
}
