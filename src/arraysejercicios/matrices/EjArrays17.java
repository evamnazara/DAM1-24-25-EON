/*EjArrays17. Crea una función que determine si una matriz es simétrica.
 */
package arraysejercicios.matrices;

public class EjArrays17 {

    public static boolean esSimetrica(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
    
        if (filas != columnas) {
            return false; 
        }
        
        for (int i = 0; i < filas; i++) {
            for (int j = i + 1; j < columnas; j++) { 
                if (matriz[i][j] != matriz[j][i]) {
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
        int[][] matriz1 = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        
        int[][] matriz2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matriz 1:");
        mostrarMatriz(matriz1);
        System.out.println("¿Es simétrica? " + esSimetrica(matriz1));
        
        System.out.println("\nMatriz 2:");
        mostrarMatriz(matriz2);
        System.out.println("¿Es simétrica? " + esSimetrica(matriz2));
    }
}
