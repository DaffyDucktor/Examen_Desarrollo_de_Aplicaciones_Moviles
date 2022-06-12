import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el Primer Número");
        double num1 = scanner.nextDouble();
        System.out.println("Digite el Primer Número");
        double num2 = scanner.nextDouble();

        System.out.println("La multiplicacion de ambos números es: "+numMultiply(num1,num2));
    }

    static double numMultiply(double num1,double num2){
        double rpta = Math.round(num1 * num2 * 100);

        return rpta / 100;
    }
}