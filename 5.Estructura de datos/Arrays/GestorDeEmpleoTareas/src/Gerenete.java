import java.util.ArrayList;

public final class Gerenete extends Empleado{

    ArrayList<Empleado> empleadosACargo = new ArrayList<>();

    public Gerenete (String nombre, int edad, int id){
        super(nombre, edad, id);
    }
    public void agragarEmpleado(Empleado e){
        empleadosACargo.add(e);
    }
    public String listarEmpleadosACargo() {
        if (empleadosACargo.isEmpty()) {
            return "El gerente " + getNombre() + " no tiene empleados a cargo.";
        }

        String resultado = "Empleados a cargo de " + getNombre() + ":\n";
        for (Empleado e : empleadosACargo) {
            resultado += "- " + e.getNombre() + "\n";
        }
        return resultado;
    }
}
