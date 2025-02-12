/*EjArrays14. Crea una función que calcule la traspuesta de una matriz. */
package arraysejercicios.matrices;

public class EjArrays14 {
    
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

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrizOriginal = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Matriz Original:");
        mostrarMatriz(matrizOriginal);
        
        int[][] matrizTraspuesta = calcularTraspuesta(matrizOriginal);
        
        System.out.println("\nMatriz Traspuesta:");
        mostrarMatriz(matrizTraspuesta);
    }
}
