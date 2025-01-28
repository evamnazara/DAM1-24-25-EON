//autora: Eva María Otero Názara 

/* EjArrays02. 
Leer 10 números enteros por teclado y guardarlos en un array. 
Calcula y muestra la media de los números que estén en las posiciones pares del array.
 */
package arraysejercicios.arrays;
import java.util.*;

public class EjArrays02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] enteros;
        enteros = new int[10];
        System.out.println("Introduce 10 números enteros:");
        leerNumeros(enteros, sc);

        int sumaEnteros = 0;
        
        for (int entero : enteros) {
            sumaEnteros += entero;
        }

        int mediaEnteros = sumaEnteros / 10;

        System.out.println("La media de los números introducidos es " + mediaEnteros);


        sc.close();

    }

    private static void leerNumeros(int[] n, Scanner sc) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": " );
            n[i] = sc.nextInt();
        }
    }
}
