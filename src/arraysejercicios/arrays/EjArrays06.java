//EjArrays06. Leer 10 enteros y mostrar la media de los valores negativos y la de los positivos.

package arraysejercicios.arrays;

import java.util.Scanner;

public class EjArrays06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        
        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        
        int sumaPositivos = 0, sumaNegativos = 0;
        int contPositivos = 0, contNegativos = 0;

        for (int num : numeros) {
            if (num > 0) {
                sumaPositivos += num;
                contPositivos++;
            } else if (num < 0) {
                sumaNegativos += num;
                contNegativos++;
            }
        }
        
        double mediaPositivos = (contPositivos > 0) ? (double) sumaPositivos / contPositivos : 0;
        double mediaNegativos = (contNegativos > 0) ? (double) sumaNegativos / contNegativos : 0;
        
        System.out.println("Media de valores positivos: " + mediaPositivos);
        System.out.println("Media de valores negativos: " + mediaNegativos);
        
        sc.close();
    }
}
