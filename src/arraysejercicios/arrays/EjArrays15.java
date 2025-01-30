/*EjArrays15. Crea una función que calcule la suma de dos matrices.
 */
package arraysejercicios.arrays;
import java.util.*;

public class EjArrays15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de las matrices (n x n): ");
        int n = sc.nextInt();
        
        int[][] matriz1 = leerMatriz(n, sc, "primera");
        int[][] matriz2 = leerMatriz(n, sc, "segunda");
        
        int[][] suma = sumarMatrices(matriz1, matriz2);
        
        System.out.println("Matriz resultante de la suma:");
        imprimirMatriz(suma);
        
        sc.close();
    }

    public static int[][] leerMatriz(int n, Scanner sc, String nombre) {
        int[][] matriz = new int[n][n];
        System.out.println("Ingrese los elementos de la " + nombre + " matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento en posición [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }

    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int n = matriz1.length;
        int[][] resultado = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
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

