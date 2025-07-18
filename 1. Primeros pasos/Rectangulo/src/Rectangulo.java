import java.util.Scanner;

public class Rectangulo {
    private int base;
    private int altura;


    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int area() {
        return base * altura;
    }

    public int perimetro() {
        return (base + altura) * 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        System.out.println("Introduce la base del elemento ");
        a = scanner.nextInt();
        System.out.println("Introduce la altura del elemento: ");
        b = scanner.nextInt();
        Rectangulo rectangulo = new Rectangulo(a, b);
        System.out.println("El valor del area és " + rectangulo.area());
        System.out.println("El valor del permietro és " + rectangulo.perimetro());
    }
}
