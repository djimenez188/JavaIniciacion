public class Estudiante {
    private String nombre;
    private int edad;
    private Curso curso;


    public Estudiante( String nombre, int edad, Curso curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }


    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Curso getCurso() {
        return curso;
    }

    public String toString() {
        return " Nombre: " + nombre + ", Edad: " + edad + ", Curso: " + curso;
    }
}


