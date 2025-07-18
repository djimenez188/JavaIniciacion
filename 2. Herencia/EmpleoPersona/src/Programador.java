import javax.swing.*;

public final class  Programador extends Empleado{
    private String lenguajeFavorito;

    public Programador(String nombre,int edad, double sueldo,String lenguajeFavorito){
        super(nombre, edad, sueldo);
        this.lenguajeFavorito = lenguajeFavorito;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("El nombre es: " + getNombre());
        System.out.println("El lenguaje favorito es: " + lenguajeFavorito);
    }
}
