import java.util.Arrays;

public class Main {

    public static int scoreByRules(int[] xs) {

        int score = 0;  

        for (int x : xs) {  
                           // +1 en complejidad cognitiva

            if (x % 2 == 0) score++;   // +1  ciclomatica | +1 cognitiva
            if (x % 3 == 0) score++;   // +1  ciclomatica | +1 cognitiva
            if (x % 5 == 0) score++;   // +1  ciclomatica | +1 cognitiva
            if (x < 0)     score++;    // +1  ciclomatica | +1 cognitiva

            switch (Math.abs(x) % 4) { // +1  ciclomatica
                case 0: score++; break;   //  +1 ciclomatica
                case 1: score += 2; break;  // +1 ciclomatica
                case 2: score += 3; break;  // +1 ciclomatica
                default: score += 4;
            }
        }

        if (xs.length == 0) return -1;  // +1  ciclomatica
        if (Arrays.stream(xs).anyMatch(v -> v == 42)) // +1 ciclomatica
            score += 10;               

        return score;
    }

    public static void main(String[] args) {
        int[] ejemplo1 = {2, 3, 5};
        int[] ejemplo2 = {-4, 7, 10, 42};
        int[] ejemplo3 = {};

        System.out.println("Score ejemplo1: " + scoreByRules(ejemplo1));
        System.out.println("Score ejemplo2: " + scoreByRules(ejemplo2));
        System.out.println("Score ejemplo3: " + scoreByRules(ejemplo3));
    }
}

//Complejidad Algorítmica	O(n)
//Complejidad Ciclomática	12 
//Complejidad Cognitiva	8