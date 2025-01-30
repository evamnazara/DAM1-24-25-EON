/*EjArrays16. Crea una función que calcule el producto de dos matrices.
public static int[][] multiplicar(int t1[][], int t2[][])
 */
package arraysejercicios.arrays;
import java.util.*;

public class EjArrays16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de las matrices (n x n): ");
        int n = sc.nextInt();
        
        int[][] matriz1 = leerMatriz(n, sc, "primera");
        int[][] matriz2 = leerMatriz(n, sc, "segunda");
        
        int[][] producto = multiplicar(matriz1, matriz2);
        
        System.out.println("Matriz resultante del producto:");
        imprimirMatriz(producto);
        
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

    public static int[][] multiplicar(int[][] t1, int[][] t2) {
        int n = t1.length;
        int[][] resultado = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    resultado[i][j] += t1[i][k] * t2[k][j];
                }
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
