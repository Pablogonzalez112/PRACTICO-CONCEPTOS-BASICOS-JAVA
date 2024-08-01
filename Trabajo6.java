package trabajo6;

import java.util.Scanner;

public class Trabajo6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = Integer.parseInt(scanner.nextLine());
        
        if (num % 2 == 0) {
            System.out.println(num + " es divisible entre 2.");
        } else {
            System.out.println(num + " no es divisible entre 2.");
        }
    }
}