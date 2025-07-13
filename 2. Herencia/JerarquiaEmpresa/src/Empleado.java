public class Empleado {
    public String nombre;
    public double salarioBase;

    public Empleado(String nombre, double salarioBase){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public void mostrarInformacion(){
        System.out.println("Hola, " + nombre + ". Tú salario base de: " + salarioBase);
    }

    public static void main (String[] args){
        EmpleadoTiempoParcial emp1 = new EmpleadoTiempoParcial("Daniel", 1400, 40, 15);
        EmpleadoTiempoCompleto emp2 = new EmpleadoTiempoCompleto("Jose", 2000, 200);

        System.out.println("\n === El empleado a tiempo parcial ===");
        emp1.mostrarInformacion();
        emp1.calcularSalrio();

        System.out.println("\n === El empleado a tiempo completo ===");
        emp2.mostrarInformacion();
        emp2.calcularSalario();
    }
}

