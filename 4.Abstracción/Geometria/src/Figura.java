public abstract class Figura {
    public String name;

    public Figura(String name){
        this.name = name;
    }

    public void mostrar() {
        System.out.println("\n=== " + name + " ===");

    }

    public abstract double calcularArea();

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo( "Rectangulo",5, 2);
        rectangulo.mostrar();
        System.out.println("El calculo del area es: " + rectangulo.calcularArea());
        Triangulo triangulo = new Triangulo("Triangulo", 5 ,2);
        triangulo.mostrar();
        System.out.println("El calculo del area es: " + triangulo.calcularArea());
    }
}

