
//EjArrays01. Calcular la media de una serie de números que se leen por teclado.

package arraysejercicios.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjArrays01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa de cálculo de medias numéricas.");
        System.out.println("Primero introduce la cantidad de números de los que quieres hacer la media:");

        int [] enteros;
        int n = sc.nextInt();
        System.out.println("A continuación, escribe los " + n + "números:");

        enteros = new int[n];
        leerNumeros(enteros);


        int sumaEnteros = 0;
        
        for (int entero : enteros) {
            sumaEnteros += entero;
        }

        int mediaEnteros = sumaEnteros / n;

        System.out.println("La media de los números " + Arrays.toString(enteros) + ", que suman "+ sumaEnteros + " en total, es de " + mediaEnteros);


        sc.close();

    }

    public static void leerNumeros(int[] t) {
            Scanner sc = new Scanner(System.in);
            for(int i = 0; i < t.length; i++) {
                t[i] = sc.nextInt();

                //if (i < 0) break;
            }
            sc.close();
        }    
    
}
