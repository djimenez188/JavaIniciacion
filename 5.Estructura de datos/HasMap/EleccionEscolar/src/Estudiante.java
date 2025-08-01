public class Estudiante {

    private String nombre;
    private int voto;

    public Estudiante(String nombre, int voto){
        this.nombre = nombre;
        this.voto = voto;
    }

    public String getNombre(){
        return nombre;
    }

    public int getVoto(){
        return voto;
    }



    public String toString(){
        return "con nombre " +getNombre() + " entrego " + getVoto() + " voto.";
    }
}
