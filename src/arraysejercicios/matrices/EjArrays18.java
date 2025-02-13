/*EjArrays18. Crea una función que determine si una matriz es ortogonal.
 */
package arraysejercicios.matrices;

public class EjArrays18 {

    public static int[][] calcularTraspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] traspuesta = new int[columnas][filas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        
        return traspuesta;
    }

    public static int[][] multiplicarMatrices(int[][] A, int[][] B) {
        int filasA = A.length;
        int columnasA = A[0].length;
        int filasB = B.length;
        int columnasB = B[0].length;
        
        if (columnasA != filasB) {
            throw new IllegalArgumentException("Las matrices no se pueden multiplicar");
        }
        
        int[][] resultado = new int[filasA][columnasB];
        
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                resultado[i][j] = 0;
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        
        return resultado;
    }

    public static boolean esOrtogonal(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas != columnas) {
            return false; 
        }

        int[][] traspuesta = calcularTraspuesta(matriz);
        int[][] producto = multiplicarMatrices(matriz, traspuesta);
        int[][] identidad = new int[filas][filas];
        for (int i = 0; i < filas; i++) {
            identidad[i][i] = 1;
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (producto[i][j] != identidad[i][j]) {
                    return false; 
                }
            }
        }

        return true; 
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrizOrtogonal = {
            {1, 0},
            {0, -1}
        };
        int[][] matrizNoOrtogonal = {
            {1, 2},
            {3, 4}
        };

        System.out.println("Matriz Ortogonal:");
        mostrarMatriz(matrizOrtogonal);
        System.out.println("¿Es ortogonal? " + esOrtogonal(matrizOrtogonal));

        System.out.println("\nMatriz No Ortogonal:");
        mostrarMatriz(matrizNoOrtogonal);
        System.out.println("¿Es ortogonal? " + esOrtogonal(matrizNoOrtogonal));
    }
}
