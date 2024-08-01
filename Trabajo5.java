package trabajo5;

import java.util.Scanner;

public class Trabajo5 {
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el radio del círculo: ");
        double radio = Double.parseDouble(scanner.nextLine());
        
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area);
    }
}