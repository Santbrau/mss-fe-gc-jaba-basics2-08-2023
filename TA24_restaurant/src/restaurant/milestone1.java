package restaurant;
import java.util.*;


public class milestone1 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // FASE 1: Variables para los billetes y precio total del menú
        int billete5 = 5;
        int billete10 = 10;
        int billete20 = 20;
        int billete50 = 50;
        int billete100 = 100;
        int billete200 = 200;
        int billete500 = 500;
        int totalMenu = 0;
        
        // FASE 2: Crear arrays para el menú y precios
        String[] menu = {"Hamburguesa", "Pizza", "Ensalada", "Pasta", "Arroz"};
        int[] precios = {10, 12, 8, 15, 20};
                
        // FASE 2: Llenar los arrays usando bucle for
        
        for (int i = 0; i < menu.length; i++) {
            System.out.print("Introduce el precio de " + menu[i] + ": ");
            precios[i] = scanner.nextInt();
        }
        
   
        System.out.println("Menú del restaurante:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - " + precios[i] + "€");
        }
        
        // FASE 2 y 3: Pedir y calcular el pedido
        List<String> pedido = new ArrayList<>();
        int seguirPidiendo = 1;
        
        while (seguirPidiendo == 1) {
            System.out.print("Elige un número del menú para añadir al pedido: ");
            int opcion = scanner.nextInt();
            
            if (opcion >= 1 && opcion <= menu.length) {
                pedido.add(menu[opcion - 1]);
                totalMenu += precios[opcion - 1];
            } else {
                System.out.println("Opción inválida. Elige un número válido del menú.");
            }
            
            System.out.print("¿Quieres seguir pidiendo? (1: Sí / 0: No): ");
            seguirPidiendo = scanner.nextInt();
        }
        
        // FASE 3: Calcular el precio del pedido y mostrar los billetes necesarios
        System.out.println("Tu pedido:");
        for (String item : pedido) {
            System.out.println("- " + item);
        }
        System.out.println("Total a pagar: " + totalMenu + "€");
        
        System.out.println("\nBilletes necesarios:");
        calcularBilletes(totalMenu);
    }
    
    public static void calcularBilletes(int total) {
        int[] billetes = {500, 200, 100, 50, 20, 10, 5};
        
        for (int billete : billetes) {
            int cantidadBilletes = total / billete;
            if (cantidadBilletes > 0) {
                System.out.println(cantidadBilletes + " billete(s) de " + billete + "€");
                total -= cantidadBilletes * billete;
            }
        }
    }
}
