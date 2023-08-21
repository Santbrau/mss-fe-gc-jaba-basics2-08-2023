package restaurant;
import java.util.*;

public class milestone2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // FASE 1: Variables y arrays
        int totalMenu = 0;
        String[] menu = {"Hamburguesa", "Pizza", "Carne", "Pasta", "Pescado"};
        int[] precios = {10, 12, 8, 15, 20};
        
        // Mostrar el menú
        System.out.println("Menú del restaurante:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - " + precios[i] + "€");
        }
        
        // FASE 2: Pedido y excepciones
        List<String> pedido = new ArrayList<>();
        int seguirPidiendo = 1;
        
        while (seguirPidiendo == 1) {
            try {
                System.out.print("Elige un número del menú para añadir al pedido: ");
                int opcion = scanner.nextInt();
                
                if (opcion >= 1 && opcion <= menu.length) {
                    pedido.add(menu[opcion - 1]);
                    totalMenu += precios[opcion - 1];
                } else {
                    throw new ProductoNoExistenteException("El producto no existe en el menú.");
                }
            } catch (ProductoNoExistenteException e) {
                System.out.println("Error: " + e.getMessage());
            }
            
            try {
                System.out.print("¿Quieres seguir pidiendo? (1: Sí / 0: No): ");
                seguirPidiendo = scanner.nextInt();
                
                if (seguirPidiendo != 0 && seguirPidiendo != 1) {
                    throw new OpcionInvalidaException("Opción inválida. Debes elegir 1 o 0.");
                }
            } catch (OpcionInvalidaException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
        // FASE 3: Total a pagar y billetes
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

class ProductoNoExistenteException extends Exception {
    public ProductoNoExistenteException(String mensaje) {
        super(mensaje);
    }
}

class OpcionInvalidaException extends Exception {
    public OpcionInvalidaException(String mensaje) {
        super(mensaje);
    }
}





