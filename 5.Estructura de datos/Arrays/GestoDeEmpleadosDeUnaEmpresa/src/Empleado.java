import java.util.ArrayList;
import java.util.Scanner;

public class Empleado {
    private String nombre;
    private int id;
    private double salario;
    private String departamento;

    public Empleado(String nombre, int id, double salario, String departamento) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String toString() {
        return "El empleado " + nombre + " con la id " + id + " tiene un salario de " + salario + " i trabaja en el departamento " + departamento + ".";
    }

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double SalarioPromedio = 0;
        // Introducimos los datos de los emplados
        empleados.add(new Empleado("Daniel", 001, 1500.00, "Comercial"));
        empleados.add(new Empleado("Bea", 002, 1500.89, "Producción"));
        empleados.add(new Empleado("Bruno", 003, 1500.56, "Logística"));
        empleados.add(new Empleado("Axel", 004, 1500.98, "Manager"));
        empleados.add(new Empleado("Greta", 005, 1500.23, "Producción"));
        // Id consulta que te permite conocer la información de empleado
        System.out.println("Introduce el id del empleado que desea consultar, para augmentar el salario: ");
        int id = sc.nextInt();
        sc.nextLine();
        // Consultamos los datos del empleado en caso de que la id coincida con la introducida
        for (Empleado e : empleados) {
            if (e.id == id) {
                System.out.println(e);
                System.out.println("Introduce el nuevo salario ");
                e.salario = sc.nextDouble();
                sc.nextLine();

            }
        }
        //Listar por departamento
        System.out.println("Indica que departamento deseas listar: ");
        String departamento = sc.nextLine();

        for (Empleado emp : empleados) {
            if (emp.departamento.equals(departamento)) {
                System.out.println(emp);
            }
        }
        //Calculamos el Empleado con el salario más alto
        if (!empleados.isEmpty()) {
            Empleado salarioMasAlto = empleados.get(0);
            for (Empleado emp : empleados) {
                if (emp.salario > salarioMasAlto.salario) {
                     salarioMasAlto= emp;
                }
            }
            System.out.println("El salario mas alto de todos los empleados es: " + salarioMasAlto.salario);
        }
        //Calculamos el salario promedio de todos los empleados
        for (Empleado emp : empleados){
            SalarioPromedio += emp.salario;

        }
        System.out.println("El salario promedio es de: " + (SalarioPromedio / empleados.size()));
        //Eliminar empleado por pantalla
        System.out.println("Indique la id del empleado que desa eliminar de la base de datos : ");
        id = sc.nextInt();
        sc.nextLine();
        empleados.remove(id -1);
        for(Empleado emp: empleados){
            System.out.println(emp);
        }

    }
}
