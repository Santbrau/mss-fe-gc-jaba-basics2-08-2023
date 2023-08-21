package noms_ciutats;
import java.util.Scanner;

public class milestone2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        double[][] notasAlumnos = new double[5][3]; 
        
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno " + (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.print("Introduce la nota " + (j + 1) + " (entre 0 y 10): ");
                notasAlumnos[i][j] = scanner.nextDouble();
            }
        }
        
     
        for (int i = 0; i < 5; i++) {
            double suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += notasAlumnos[i][j];
            }
            double promedio = suma / 3;
            
            System.out.println("\nPromedio del alumno " + (i + 1) + ": " + promedio);
            
            if (promedio >= 5) {
                System.out.println("El alumno ha aprobado.");
            } else {
                System.out.println("El alumno ha suspendido.");
            }
        }
    }
}
