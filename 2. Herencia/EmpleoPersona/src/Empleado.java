public class Empleado extends Persona {
    private double sueldo;

    public Empleado(String nombre, int edad, double sueldo) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }
    public void mostrarDatos(){
        System.out.println("El nombre del usuario es: " + getNombre());
        System.out.println("El sueldo del trabajador es: " + sueldo);
        System.out.println ("La edad el año siguiente es de: " + getEdad());
    }
}
