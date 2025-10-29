public class Main {

    public static String classifyTriple(int a, int b, int c) {

        if (a > 0) { // +1 ciclomatica | +1 cognitiva 
            if (b > 0) { // +1 ciclomatica | +1 cognitiva 
                if (c > 0) { // +1 ciclomatica | +1 cognitiva 
                    if (a > b && b > c) { // +1 ciclomatica | condición  +1 cognitiva 
                        return "strict-desc";
                    } else if (a == b || b == c) { // +1 ciclomatica |  +1 cognitiva 
                        if ((a + b + c) % 2 == 0) { // +1 ciclomatica | +1 cognitiva 
                            return "ties-even";
                        } else { // +1 ciclomatica
                            return "ties-odd";
                        }
                    } else { // +1 ciclomatica
                        return "other-pos";
                    }
                } else { // +1 ciclomatica
                    if (a > b && b > c) { // +1 ciclomatica | +1 cognitiva 
                        return "c-nonpos-desc";
                    } else { // +1 ciclomatica
                        return "c-nonpos-other";
                    }
                }
            } else { // +1 ciclomatica
                if (c > 0) { // +1 ciclomatica
                    return "b-nonpos-c-pos";
                } else { // +1 ciclomatica
                    return "both-nonpos";
                }
            }
        } else { // +1 ciclomatica
            if (b > 0 && c > 0) { // +1 ciclomatica | +1 cognitiva 
                return "a-nonpos-others-pos";
            }
        }

        return "fallback"; 
    }

    public static void main(String[] args) {

        System.out.println(classifyTriple(5, 4, 3));  
        System.out.println(classifyTriple(2, 2, 4));  
        System.out.println(classifyTriple(3, 3, 2));  
        System.out.println(classifyTriple(-1, 3, 2)); 
        System.out.println(classifyTriple(1, -2, 3)); 
        System.out.println(classifyTriple(0, 0, 0));  
    }
}



//Algorítmica	 O(1)
//Ciclomática	 11
//Cognitiva	 14