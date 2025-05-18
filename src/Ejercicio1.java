import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args)
    {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Ejercicio 1");

        int correcta = 0;
        int incorrecta = 0;
        int vacias = 0;
        int resultado = 0;

        System.out.println("Escriba el numero de respuestas correctas: ");
        correcta = scanner.nextInt();

        System.out.println("Escriba el numero de respuestas incorrectas: ");
        incorrecta = scanner.nextInt();

        System.out.println("Escriba el numero de respuestas vacias: ");
        vacias = scanner.nextInt();

        resultado = (correcta * 5) + (incorrecta * -2) + (vacias * 0);

        System.out.println(" ");
        System.out.println("Puntaje total: " + resultado);
    }
}
