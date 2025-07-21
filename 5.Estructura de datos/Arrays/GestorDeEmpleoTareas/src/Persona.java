public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }


public static void main(String[] args) {
    Empleado e1 = new Empleado("Ana", 36, 1451);
    e1.mostrarInformacion();
    Empleado e2 = new Empleado("Luis", 40, 1450);
    e1.mostrarInformacion();
    Gerenete g1 = new Gerenete("Marta", 45, 1453);
    e1.assignarTareas("Reportes");
    System.out.println("\n " + e1.listarTareas());


}
}
