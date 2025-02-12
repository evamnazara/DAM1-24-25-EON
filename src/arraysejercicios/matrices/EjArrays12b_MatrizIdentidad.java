/*EjArrays12b_MatrizIdentidad Escribe un programa en Java que reciba un número entero n 
y genere una matriz identidad de tamaño n x n. */

package arraysejercicios.matrices;
import java.util.*;

public class EjArrays12b_MatrizIdentidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz identidad: ");
        int n = sc.nextInt();
        
        int[][] matrizIdentidad = generarMatrizIdentidad(n);
        
        System.out.println("Matriz identidad generada:");
        imprimirMatriz(matrizIdentidad);
        
        sc.close();
    }

    public static int[][] generarMatrizIdentidad(int n) {
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            matriz[i][i] = 1;
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}