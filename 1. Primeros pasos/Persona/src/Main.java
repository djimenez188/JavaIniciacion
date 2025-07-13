public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Mario", 20);
        p.saludar();

        p.setEdad(21); // cambiar edad
        p.setNombre("Mario López"); // cambiar nombre

        System.out.println("Nombre actualizado: " + p.getNombre());
        System.out.println("Edad actualizada: " + p.getEdad());
    }
}
