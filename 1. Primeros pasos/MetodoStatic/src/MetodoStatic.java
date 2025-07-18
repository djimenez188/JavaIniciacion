import java.util.Scanner;

public class MetodoStatic {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a;
        int b;
        int resultado;
        Scanner suma = new Scanner(System.in);
        System.out.println("Introduce un primer valor: ");
        a = suma.nextInt();
        System.out.println("Introduce un segundo valor: ");
        b = suma.nextInt();
        System.out.println("El valor total de la suma és: " +   MetodoStatic.sumar(a, b));
    }
}
