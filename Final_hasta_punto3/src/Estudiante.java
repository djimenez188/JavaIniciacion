public class Estudiante {
    private int id;
    private String nombre;
    private int edad;
    private int curso;


    public Estudiante(int id, String nombre, int edad, int curso) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getCurso() {
        return curso;
    }

    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Curso: " + curso;
    }
}


