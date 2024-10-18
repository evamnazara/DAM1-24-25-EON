package ud2.ejemplos;
import java.util.*;

public class E0204_CasiCeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero decimal: ");
        double num = sc.nextDouble();
        
        sc.close();
        
            if (num > 0 && num < 1) {
                System.out.println("Este número es un casi 0.");
            } else {
                System.out.println("Este número no es un casi 0");
            }
            
        }
        
    }
