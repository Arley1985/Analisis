package letra_diccionario;

import java.util.Scanner;

public class Letra_Diccionario {

    public static void main(String[] args) {
       
        String[] diccionario = {
            "arbol", "barco", "casa", "dado",
            "elefante", "flor", "gato", "huevo"
        };

        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la letra a buscar: ");
        char letra = sc.nextLine().toLowerCase().charAt(0);

       
        boolean encontradaGlobal = false;
        for (String palabra : diccionario) {
            boolean encontradaEnPalabra = false;
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    System.out.printf("Letra '%c' encontrada en la palabra \"%s\" (posición %d)%n",
                                      letra, palabra, i);
                    encontradaEnPalabra = true;
                    encontradaGlobal = true;
                }
            }
        }

        
        if (!encontradaGlobal) {
            System.out.printf("La letra '%c' no se encuentra en ninguna palabra del diccionario.%n", letra);
        }

        sc.close();
    }
}
