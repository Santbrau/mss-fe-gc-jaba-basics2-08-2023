package lletres_repetides;
import java.util.Scanner;

public class milestone2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Escala de Números
        System.out.print("Introduce el número de líneas para la escala de números: ");
        int numLineas = scanner.nextInt();
        
        System.out.println("Escala de Números:");
        for (int i = 1; i <= numLineas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        // Pirámide Invertida de Asteriscos
        System.out.print("\nIntroduce la altura de la pirámide invertida: ");
        int altura = scanner.nextInt();
        
        System.out.println("Pirámide Invertida de Asteriscos:");
        for (int i = altura; i >= 1; i--) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}