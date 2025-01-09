//autora: Eva María Otero Názara 

//EjArrays01. Calcular la media de una serie de números que se leen por teclado.

package arraysejercicios;

import java.util.Scanner;

public class EjArrays01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa de cálculo de medias numéricas.");
        System.out.println("Introduce números enteros positivos:");
        System.out.println("Introduce un número negativo.");

        int [] enteros;
        int n = sc.nextInt();

        enteros = new int[n];
        leerNumeros(enteros);

        int sumaEnteros = 0;
        
        for (int entero : enteros) {
            sumaEnteros += entero;
        }

        int mediaEnteros = sumaEnteros / n;

        System.out.println("La media de los números introducidos es " + mediaEnteros);


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
