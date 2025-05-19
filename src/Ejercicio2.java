import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Ejercicio 2");

        int numero  = 0;
        int i = 1;

        System.out.println("Ingrese un numero positivo:");
        numero = scanner.nextInt();

        while(i <= numero)
        {
            System.out.println(i);
            i +=2;
        }
    }
}
