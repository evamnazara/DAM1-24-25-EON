/* Factorial. Escribe un programa que calcule el factorial de un número utilizando recursividad. */

package ud2.exercicios.eon202411.ejerciciosrecursividad;

import java.util.*;

public class Factorial {

    public static long factorial (int n) {
        if (n == 0) {
             return 1;
        } else {
         return n * factorial (n-1);
        }
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Escribe el número del que quieras obtener el factorial: ");
        n = sc.nextInt();
        sc.close();

        long resultado = factorial(n);

        System.out.println("El factorial de " + n + " es " + resultado);


    }

    
}
