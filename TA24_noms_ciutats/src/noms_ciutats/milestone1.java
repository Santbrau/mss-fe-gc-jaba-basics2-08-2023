package noms_ciutats;
import java.util.Arrays;
import java.util.Scanner;

public class milestone1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // FASE 1: Introducción de nombres de ciudades
        System.out.println("FASE 1:");
        String ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6;
        System.out.print("Introduce el nombre de la ciudad 1: ");
        ciutat1 = scanner.nextLine();
        System.out.print("Introduce el nombre de la ciudad 2: ");
        ciutat2 = scanner.nextLine();
        System.out.print("Introduce el nombre de la ciudad 3: ");
        ciutat3 = scanner.nextLine();
        System.out.print("Introduce el nombre de la ciudad 4: ");
        ciutat4 = scanner.nextLine();
        System.out.print("Introduce el nombre de la ciudad 5: ");
        ciutat5 = scanner.nextLine();
        System.out.print("Introduce el nombre de la ciudad 6: ");
        ciutat6 = scanner.nextLine();
        
        System.out.println("Ciudades introducidas:");
        System.out.println(ciutat1);
        System.out.println(ciutat2);
        System.out.println(ciutat3);
        System.out.println(ciutat4);
        System.out.println(ciutat5);
        System.out.println(ciutat6);
        
        // FASE 2: Guardar en array y mostrar ordenado
        String[] arrayCiutats = {ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6};
        Arrays.sort(arrayCiutats);
        
        System.out.println("\nFASE 2:");
        System.out.println("Ciudades ordenadas alfabéticamente:");
        for (String ciutat : arrayCiutats) {
            System.out.println(ciutat);
        }
        
        // FASE 3: Cambiar vocales "a" por "4"
        String[] arrayCiutatsModificades = new String[6];
        for (int i = 0; i < arrayCiutats.length; i++) {
            arrayCiutatsModificades[i] = arrayCiutats[i].replace('a', '4');
        }
        
        System.out.println("\nFASE 3:");
        System.out.println("Ciudades modificadas:");
        for (String ciutatModificada : arrayCiutatsModificades) {
            System.out.println(ciutatModificada);
        }
        
        // FASE 4: Arrays bidimensionales con nombres invertidos
        char[][] arraysNombresInvertidos = new char[arrayCiutats.length][];
        for (int i = 0; i < arrayCiutats.length; i++) {
            arraysNombresInvertidos[i] = new char[arrayCiutats[i].length()];
            for (int j = 0; j < arrayCiutats[i].length(); j++) {
                arraysNombresInvertidos[i][j] = arrayCiutats[i].charAt(arrayCiutats[i].length() - 1 - j);
            }
        }
        
        System.out.println("\nFASE 4:");
        System.out.println("Nombres invertidos:");
        for (char[] nombreInvertido : arraysNombresInvertidos) {
            System.out.println(new String(nombreInvertido));
        }
    }
}