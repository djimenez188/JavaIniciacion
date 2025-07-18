public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarDatos() {
        System.out.println("El nombre del estudiante es: " + nombre);
        System.out.println("La edad del estudante es: " + edad);
    }

    public static void main(String[] args) {

        Persona p = new Persona("Dani", 37 );
        p.mostrarDatos();
        Empleado e = new Empleado("Daniel", 37, 1500);
        e.mostrarDatos();
        Programador pr = new Programador("Daniel2", 37, 1900, "Java");
        pr.mostrarDatos();
    }
}
