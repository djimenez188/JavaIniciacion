import org.w3c.dom.html.HTMLObjectElement;

public class EmpleadoTiempoParcial extends Empleado {

    public int horasTrabajadas;
    public double pagaPorHoras;

    public EmpleadoTiempoParcial(String nombre, double salario, int horasTrabajadas, double pagaPorHoras) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.pagaPorHoras = pagaPorHoras;
    }

    public void calcularSalrio() {
        salarioBase = horasTrabajadas * pagaPorHoras;
        System.out.println("El total de salario a percibir es de: " + salarioBase);
    }

}
