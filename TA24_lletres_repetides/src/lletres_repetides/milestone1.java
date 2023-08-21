package lletres_repetides;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class milestone1 {

	public static void main(String[] args) {
        // FASE 1: Mostrar cada letra del nombre en una tabla (char[])
        char[] nombreArray = {'M', 'a', 'r', 'c', 'o'};
        
        System.out.println("FASE 1:");
        for (char c : nombreArray) {
            System.out.println(c);
        }
        
        // FASE 2: Utilizar una lista y identificar vocales, consonantes y números
        List<Character> nombreList = new ArrayList<>();
        nombreList.add('M');
        nombreList.add('a');
        nombreList.add('r');
        nombreList.add('c');
        nombreList.add('o');
        
        System.out.println("\nFASE 2:");
        for (char c : nombreList) {
            if (Character.isLetter(c)) {
                if (isVowel(c)) {
                    System.out.println("VOCAL");
                } else {
                    System.out.println("CONSONANTE");
                }
            } else if (Character.isDigit(c)) {
                System.out.println("Los nombres de personas no contienen números!");
            }
        }
        
        // FASE 3: Almacenar en un Map las letras y su contador
        System.out.println("\nFASE 3:");
        Map<Character, Integer> contadorLetras = new HashMap<>();
        
        for (char c : nombreList) {
            if (Character.isLetter(c)) {
                contadorLetras.put(c, contadorLetras.getOrDefault(c, 0) + 1);
            } else if (Character.isDigit(c)) {
                System.out.println("Los nombres de personas no contienen números!");
            }
        }
        
        for (Map.Entry<Character, Integer> entry : contadorLetras.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " veces");
        }
        
        // FASE 4: Fusionar las listas de nombre y apellido
        List<Character> apellidoList = new ArrayList<>();
        apellidoList.add('S');
        apellidoList.add('a');
        apellidoList.add('n');
        apellidoList.add('t');
        apellidoList.add('o');
        apellidoList.add('r');
        apellidoList.add('o');
        
        List<Character> nombreCompletoList = new ArrayList<>(nombreList);
        nombreCompletoList.add(' ');  
        nombreCompletoList.addAll(apellidoList);
        
        System.out.println("\nFASE 4:");
        for (char c : nombreCompletoList) {
            System.out.print(c);
        }
    }
    
    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}