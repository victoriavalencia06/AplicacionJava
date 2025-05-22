import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Ejercicio 4");

        String[][] mascotas = new String[5][5];

        //Llenado de la matriz
        for(int f = 1; f <= 4; f++)
        {
            for (int c = 1; c <= 4; c++)
            {
                System.out.println("Escriba el nombre de una mascota [" + f + "][" + c + "]");
                mascotas[f][c] = scanner.next();
            }
        }

        for (int f = 1; f <= 4; f++) {
            if ((f % 2) != 0) {
                for (int c = 1; c <= 4; c++) {
                    if ((c % 2) != 0) {
                        System.out.print(mascotas[f][c] + "\t");
                    }
                }
                System.out.print("\n");
            }
        }
    }
}
