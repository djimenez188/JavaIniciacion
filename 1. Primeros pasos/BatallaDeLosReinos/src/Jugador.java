public class Jugador {

    // Atributos privados → Encapsulamiento
    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;

    // Constructor → se ejecuta al crear un nuevo jugador
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.vida = 100;   // vida inicial
        this.ataque = 20;  // ataque base
        this.defensa = 10; // defensa base
    }

    // Métodos 'get' → permiten consultar valores (buena práctica en POO)
    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    // Método para recibir daño
    public void recibirDanio(int danio) {
        this.vida -= danio;
        if (this.vida < 0) this.vida = 0; // no permitimos vida negativa
    }

    // Método para curarse (restaura la vida al 100%)
    public void curarse() {
        this.vida = 100;
    }
}
