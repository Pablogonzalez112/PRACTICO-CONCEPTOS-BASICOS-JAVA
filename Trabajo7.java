package trabajo8;

import java.util.Scanner;

public class Trabajo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        char caracter = (char) numero;
        System.out.println("El carácter correspondiente en la tabla ASCII es: " + caracter);
    }
}
