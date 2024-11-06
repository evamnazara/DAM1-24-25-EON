package ud2.ejerciciosbucles;

import java.util.*;

public class E0311 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("numero: ");

        int n = sc.nextInt();

        sc.close();
        //bucle controlado por contador 

        int factorial = 1;

        for (int i = 2;  i <= n; i++) {
            factorial *= i;

        }

        System.out.println("El factorial de " + n + " es " + factorial);
    }
    
}
