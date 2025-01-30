/*EjArrays17. Crea una función que determine si una matriz es simétrica.
 */
package arraysejercicios.arrays;

public class EjArrays17 {

    // Función para verificar si la matriz es simétrica
    public static boolean esSimetrica(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        // Comprobar si la matriz es cuadrada
        if (filas != columnas) {
            return false; // Una matriz no cuadrada no puede ser simétrica
        }
        
        // Recorrer la matriz y comparar los elementos simétricos
        for (int i = 0; i < filas; i++) {
            for (int j = i + 1; j < columnas; j++) { // Solo comparar la parte superior de la diagonal
                if (matriz[i][j] != matriz[j][i]) {
                    return false; // Si algún elemento no es igual a su simétrico, no es simétrica
                }
            }
        }
        
        return true; // Si todas las comparaciones son correctas, la matriz es simétrica
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
        int[][] matriz1 = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        
        // Crear otra matriz no simétrica para prueba
        int[][] matriz2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Mostrar las matrices y verificar si son simétricas
        System.out.println("Matriz 1:");
        mostrarMatriz(matriz1);
        System.out.println("¿Es simétrica? " + esSimetrica(matriz1));
        
        System.out.println("\nMatriz 2:");
        mostrarMatriz(matriz2);
        System.out.println("¿Es simétrica? " + esSimetrica(matriz2));
    }
}
