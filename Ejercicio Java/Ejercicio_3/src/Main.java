import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite el radio del círculo:");
            double radCir = scanner.nextDouble();
            double cirCir = 2 * radCir * Math.PI;
            double areCir = Math.PI * Math.pow(radCir, 2);

            System.out.println("La longitud de la Circunferencia es: " + (Math.round(cirCir * 100.00)) / 100.00);
            System.out.println("La área del Círculo es: " + (Math.round(areCir * 100.00)) / 100.00);

        }catch (Exception ex){
            System.out.println("Valor no válido");
        }

    }
}