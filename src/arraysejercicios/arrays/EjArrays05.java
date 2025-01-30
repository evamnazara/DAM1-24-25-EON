//EjArrays05. Contar el número de elementos positivos, negativos y ceros en un array de 10 enteros.

package arraysejercicios.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjArrays05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        
        
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Contar
        int positivos = 0, negativos = 0, ceros = 0;
        for (int num : numeros) {
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        System.out.println("Números introducidos: " + Arrays.toString(numeros));
        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        
        sc.close();
    }
}