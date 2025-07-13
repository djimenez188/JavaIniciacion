public class Triangulo extends Figura {
    public double base;
    public double altura;

    public Triangulo(String name, double base, double altura) {
        super(name);
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }
}
