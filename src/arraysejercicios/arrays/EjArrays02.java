
/* EjArrays02. 
Leer 10 números enteros por teclado y guardarlos en un array. 
Calcula y muestra la media de los números que estén en las posiciones pares del array.
 */
package arraysejercicios.arrays;
import java.util.*;

public class EjArrays02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] enteros = new int[10];
        System.out.println("Introduce 10 números enteros:");
        leerNumeros(enteros, sc);

        double sumaPares = 0;
        int contadorPares = 0;

        for (int i = 0; i < enteros.length; i += 2) {
            sumaPares += enteros[i];
            contadorPares++;
        }

        double mediaPares = (contadorPares > 0) ? sumaPares / contadorPares : 0;
        System.out.println("La media de los números en posiciones pares es " + mediaPares);

        sc.close();
    }

    private static void leerNumeros(int[] n, Scanner sc) {
        for (int i = 0; i < n.length; i++) {
            System.out.print("Número " + (i + 1) + ": " );
            n[i] = sc.nextInt();
        }
    }
}
