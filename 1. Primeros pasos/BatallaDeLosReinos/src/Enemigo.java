import java.util.Random;

public class Enemigo {

    // Atributos privados (encapsulados)
    private int vida;
    private int ataque;
    private int defensa;

    // Constructor → genera un enemigo con valores aleatorios
    public Enemigo() {
        Random r = new Random();
        this.vida = 50 + r.nextInt(51);      // Vida entre 50 y 100
        this.ataque = 10 + r.nextInt(11);    // Ataque entre 10 y 20
        this.defensa = 5 + r.nextInt(6);     // Defensa entre 5 y 10
    }

    // Métodos 'get' para acceder a los atributos
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
        if (this.vida < 0) this.vida = 0; // No permitir vida negativa
    }
}
