public class Persona {
    // Atributos privados (encapsulados)
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {

    }

    // Métodos getters (leer valores)
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Métodos setters (modificar valores)
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void setEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}
