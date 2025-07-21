import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Producto {
    public String nombreProducto;
    public double precio;
    public int stock;

    public Producto(String nombreProducto, double precio, int stock) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
    public String toString(){

        return "El producto llamado " + getNombreProducto() + " con un precio " + getPrecio()+ " i con un Stock " + getStock();
    }
    public static void main (String[] args){
        HashMap<Integer, Producto> producto = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero de productos a registrar en el sistema: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        // Registro de los productos que deseamos introducir
        for (int i = 0; i < cantidad  ; i++){

            System.out.println("Introduce el nombre del producto: ");
            String nombre= scanner.nextLine();

            System.out.println("Introduce el precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Introduce el numero de stock: ");
            int stock = scanner.nextInt();
            scanner.nextLine();
            producto.put(i + 1, new Producto (nombre, precio, stock));
        }
        // Consulta de todos los productos que hemos introducido;

        for(Map.Entry <Integer, Producto> entry : producto.entrySet()){
            System.out.println(entry.getValue() + " esta registrado con la contraseña "+ entry.getKey());
        }
        // Busca un producto
        System.out.print("Introduce el código del producto del producto que desas encontrar: ");
        int codigo = scanner.nextInt();;

        if (producto.containsKey(codigo)){
            System.out.println("El código " + codigo + " pertenece a: " + producto.get(codigo));
        } else {
            System.out.println("El código no esta en el catalogo");
        }
        // Actualiza el Stock
        System.out.print("\n Introduce el código del producto a actualizar: ");
        codigo = scanner.nextInt();
        scanner.nextLine();

        if (producto.containsKey(codigo)) {
            Producto p = producto.get(codigo);

            System.out.print("Introduce el nuevo stock: ");
            int nuevoStock = scanner.nextInt();

            p.stock = nuevoStock;

            System.out.println("Stock actualizado correctamente:");
            System.out.println(p);
        } else {
            System.out.println("El producto con código " + codigo + " no existe.");
        }
        // Mostrar Stock con menos de 5 productos:
        System.out.println("Si el producto contiene poco stock te devuelve la cantidad");
        for (Producto p : producto.values() ){
            if(p.stock < 5 ){
                System.out.println(p);
            }
        }
    }

}
