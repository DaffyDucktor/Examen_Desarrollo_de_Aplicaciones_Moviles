import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el nuevo a comprobar:");
        int nuevo = scanner.nextInt();

        System.out.println(comprobarNuevo(nuevo));
    }

    private static String comprobarNuevo(int nuevo){
        String rpta = "";
        if(nuevo % 2 == 0){
            rpta = "El nuevo es par";
        }else{
            rpta = "El nuevo es impar";
        }

        return rpta;
    }
}