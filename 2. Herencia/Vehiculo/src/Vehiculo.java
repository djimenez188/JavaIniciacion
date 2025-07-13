public class Vehiculo {
    public String marca;
    public String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void encender() {
        System.out.println("Encender el Vehiculo");
    }

    public static void main (String[] args){
        Auto vehiculo = new Auto("Toyota", "Yaris");
        System.out.println("Marca: " + vehiculo.getMarca() + "Modelo: " + vehiculo.getModelo());
        vehiculo.encender();
        vehiculo.tocarBocina();
    }
}
