
package ordenar;

import java.util.Arrays;

public class Ordenar {
    public static void main(String[] args) {
      
        int[] numeros = {47, 7, 19, 3, 25};
        
       
        Arrays.sort(numeros);
        
        
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}