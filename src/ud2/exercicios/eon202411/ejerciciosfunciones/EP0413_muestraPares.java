//EP0413. Crea la función muestraPares(int n) que muestre por consola los primeros n números pares.

package ud2.exercicios.eon202411.ejerciciosfunciones;

import java.util.Scanner;

public class EP0413_muestraPares {

    public static void muestraPares(int n) {
        for (int i = 2; i <= n * 2; i += 2) {
            System.out.println(i); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n;

        System.out.println("Introduce el número: ");
        n = sc.nextInt();

        sc.close();

        muestraPares(n);
    }
}

