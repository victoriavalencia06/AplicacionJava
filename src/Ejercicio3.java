import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Ejercicio 3");

        int puntos = 0;

        System.out.println("Ingrese el numero de puntos acumulados:");
        puntos = scanner.nextInt();

        if (puntos < 1000)
            System.out.println("Usted es cliente bronce");
        else if (puntos <= 3000)
            System.out.println("Usted es cliente plata");
        else
            System.out.println("Usted es cliente oro");
    }
}
