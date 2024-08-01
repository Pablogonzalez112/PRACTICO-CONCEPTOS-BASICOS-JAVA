package trabajo9;

import java.util.Scanner;

public class Trabajo9 {
    public static void main(String[] args) {
        // Definir la constante del IVA
        final double IVA = 0.21;
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir el precio del producto al usuario
        System.out.print("Introduce el precio del producto: ");
        double precioSinIVA = scanner.nextDouble();
        
        // Calcular el precio con IVA
        double precioConIVA = precioSinIVA * (1 + IVA);
        
        // Mostrar el precio final con IVA
        System.out.printf("El precio final con IVA es: %.2f\n", precioConIVA);
    }
}