import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número a ser potenciado:");

        try {
            int num = scanner.nextInt();

            System.out.println("El número al cuadrado es: " + Math.pow(num,2));
        }catch (InputMismatchException ex){
            System.out.println("Valor no Válido");
        }
    }
}