package src.funtions;

public class Main {

    public static long sumWithDoublingLoop(int[] a) { // +1 Complejidad ciclomatica  | +1 cognitivo
        int n = a.length;
        long s = 0;

         
        // +1 Complejidad cognitiva 
        for (int i = 1; i < n; i *= 2) {

             
            // +1 Complejidad ciclomatica | +1 cognitiva
            for (int j = 0; j < n; j++) {
                s += a[j];
            }
        }

        return s;
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        long resultado = sumWithDoublingLoop(numeros);

        System.out.println("Resultado de la suma: " + resultado);
    }
}
// Complejidad Algorítmica: O(n log n)
// Complejidad Ciclomática: 3       
// Complejidad Cognitiva: 3