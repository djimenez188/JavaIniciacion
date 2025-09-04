import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el texto que desa enviar: ");
        String texto = sc.nextLine();
        try (FileWriter fw = new FileWriter("salida.txt")) {

            fw.write(texto);

        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
