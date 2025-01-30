/*EjArrays18. Crea una función que determine si una matriz es ortogonal.
 */
package arraysejercicios.arrays;

public class EjArrays18 {

    // Función para calcular la traspuesta de una matriz
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

    // Función para multiplicar dos matrices
    public static int[][] multiplicarMatrices(int[][] A, int[][] B) {
        int filasA = A.length;
        int columnasA = A[0].length;
        int filasB = B.length;
        int columnasB = B[0].length;
        
        // Si el número de columnas de A no coincide con el número de filas de B, no se puede multiplicar
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

    // Función para verificar si una matriz es ortogonal
    public static boolean esOrtogonal(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Comprobar si la matriz es cuadrada
        if (filas != columnas) {
            return false; // Solo las matrices cuadradas pueden ser ortogonales
        }

        // Calcular la traspuesta de la matriz
        int[][] traspuesta = calcularTraspuesta(matriz);

        // Multiplicar la matriz original por su traspuesta
        int[][] producto = multiplicarMatrices(matriz, traspuesta);

        // Crear la matriz identidad
        int[][] identidad = new int[filas][filas];
        for (int i = 0; i < filas; i++) {
            identidad[i][i] = 1;
        }

        // Comparar el producto con la matriz identidad
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (producto[i][j] != identidad[i][j]) {
                    return false; // Si alguna posición no coincide, no es ortogonal
                }
            }
        }

        return true; // Si todo coincide, la matriz es ortogonal
    }

    // Método para mostrar una matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Crear una matriz ortogonal de ejemplo
        int[][] matrizOrtogonal = {
            {1, 0},
            {0, -1}
        };

        // Crear una matriz no ortogonal para prueba
        int[][] matrizNoOrtogonal = {
            {1, 2},
            {3, 4}
        };

        // Verificar si las matrices son ortogonales
        System.out.println("Matriz Ortogonal:");
        mostrarMatriz(matrizOrtogonal);
        System.out.println("¿Es ortogonal? " + esOrtogonal(matrizOrtogonal));

        System.out.println("\nMatriz No Ortogonal:");
        mostrarMatriz(matrizNoOrtogonal);
        System.out.println("¿Es ortogonal? " + esOrtogonal(matrizNoOrtogonal));
    }
}
