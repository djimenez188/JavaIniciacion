import java.util.Scanner;
public class Persona {
    private String name;
    private int age;

    Scanner scanner = new Scanner(System.in);

    public String getName(){
        return name;
    }
    public void setName (){
        System.out.println("Indique su nombre: ");
        this.name = scanner.nextLine();

    }

    public int getAge(){
        return age;
    }
    public void setAge(){
        System.out.println("Indique su edad: ");
        this.age = scanner.nextInt();
    }
}
