import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
            System.out.println("Ingresa tu nombre de usuario:");
            String nomUser = scanner.next();

            System.out.println("Ingresa tu habilidad:");
            String habUser = scanner.next();

            System.out.println(nomUser+" es "+habUser);

    }
}