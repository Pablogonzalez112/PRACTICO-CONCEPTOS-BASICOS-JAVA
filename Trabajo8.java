package rabajo8;

import java.util.Scanner;

public class Trabajo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un carácter: ");
        char caracter = scanner.next().charAt(0);
        int codigoASCII = (int) caracter;
        System.out.println("El código ASCII correspondiente es: " + codigoASCII);
    }
}
