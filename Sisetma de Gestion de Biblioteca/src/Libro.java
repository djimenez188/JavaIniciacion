public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private String ISBN;
    private boolean estaPresente;

    public Libro(String titulo, String autor, String genero, String ISBN, boolean estaPresente) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ISBN = ISBN;
        this.estaPresente = estaPresente;
    }
}
