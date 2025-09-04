public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private boolean estaPresente;

    public Libro(String titulo, String autor, String genero, boolean estaPresente) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.estaPresente = estaPresente;
    }

    public String toString(){
        return "El libro " + titulo + " escrito por " + autor + " de genero de: " + genero;
    }
}
