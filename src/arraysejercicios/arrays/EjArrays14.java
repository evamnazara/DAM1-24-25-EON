/*EjArrays14. Crea una función que calcule la traspuesta de una matriz. */
package arraysejercicios.arrays;

public class EjArrays14 {
    
    // Función para calcular la traspuesta de una matriz
    public static int[][] calcularTraspuesta(int[][] matriz) {
        int filas = matriz.length;      // Número de filas de la matriz original
        int columnas = matriz[0].length; // Número de columnas de la matriz original
        
        int[][] traspuesta = new int[columnas][filas]; // Crear la matriz traspuesta con dimensiones invertidas
        
        // Recorrer la matriz original y asignar los valores a la matriz traspuesta
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta[j][i] = matriz[i][j]; // Cambiar las posiciones de fila y columna
            }
        }
        
        return traspuesta; // Retornar la matriz traspuesta
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
        // Crear una matriz de ejemplo
        int[][] matrizOriginal = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Mostrar la matriz original
        System.out.println("Matriz Original:");
        mostrarMatriz(matrizOriginal);
        
        // Calcular la traspuesta
        int[][] matrizTraspuesta = calcularTraspuesta(matrizOriginal);
        
        // Mostrar la matriz traspuesta
        System.out.println("\nMatriz Traspuesta:");
        mostrarMatriz(matrizTraspuesta);
    }
}
