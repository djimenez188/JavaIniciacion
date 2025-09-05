import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el texto que desa enviar: ");
        String texto = sc.nextLine();
        try (FileWriter fw = new FileWriter("salida.txt")) {

            fw.write(texto);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("salida2.txt"))) {
            bw.write("Hola");
            bw.newLine();
            bw.write("es el 5 de septiembre");
        } catch (IOException e) {
            e.printStackTrace();

        }
        try (PrintWriter pw = new PrintWriter("salida3.txt")) {
            pw.println("Aqui si que es facil introducir el salto de linea");
            pw.println("COmo puedes comprovar esto es un salto de linea");

        } catch (IOException e) {
            e.printStackTrace();

        }

        try (BufferedReader br = new BufferedReader(new FileReader("salida.txt"))) {
            String lectura;
            while ((lectura = br.readLine()) != null) {
                System.out.println(lectura);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader("salida2.txt")) {
            int linea;
            while ((linea = fr.read()) != -1) {
                System.out.print((char) linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Scanner scl = new Scanner(new File("salida3.txt"))) {
            while (scl.hasNextLine()) {
                 String linea = sc.nextLine();
                 System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

