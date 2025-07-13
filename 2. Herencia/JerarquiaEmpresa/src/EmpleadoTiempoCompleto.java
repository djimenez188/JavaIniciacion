public class EmpleadoTiempoCompleto extends Empleado {
    public double bonus;

    public EmpleadoTiempoCompleto(String nombre, double salarioBase, double bonus) {
        super(nombre, salarioBase);
        this.bonus = bonus;
    }

    public void calcularSalario() {
        salarioBase = salarioBase + bonus;
        System.out.println("El salario total es de: " + salarioBase + "€");
    }
}