package part1.ej1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {

    public static double readDouble(Scanner sc) {
        double valor = 0;

        try {
            System.out.println("Introduce un valor:");
            valor = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("El valor no es de tipo double.");
        } finally {
            sc.nextLine(); // Limpiar el buffer del Scanner
        }

        return valor;
    }

    public static int readInt(Scanner sc) {
        int valor = 0;

        try {
            System.out.println("Introduce un valor:");
            valor = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("El valor no es de tipo int.");
        } finally {
            sc.nextLine(); // Limpiar el buffer del Scanner
        }

        return valor;
    }
}
