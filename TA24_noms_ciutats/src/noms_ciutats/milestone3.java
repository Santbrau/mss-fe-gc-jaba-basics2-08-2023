package noms_ciutats;
import java.util.Scanner;

public class milestone3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el número N: ");
        int N = scanner.nextInt();
        
        System.out.println("Secuencia de Fibonacci hasta " + N + ":");
        for (int i = 0; i <= N; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}