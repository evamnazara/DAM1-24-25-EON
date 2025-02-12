/*EP0518. Escribe un programa que solicite los elementos de una matriz de tamaño 4 x 4. 

La aplicación debe decidir si la matriz introducida corresponde a una matriz mágica, que es aquella donde la suma de los elementos de cualquier fila o de cualquier columna valen lo mismo.
 */

 //recorrer fila a fila 
 //recorrer columna a columna
 //contadores de suma 
package arraysejercicios.matrices;

public class EP0518_MatricesMagicas {

    public static void main(String[] args) {
        int[][] matriz = generarMatrizAleatoria(4, 4);

        mostrarMatriz(matriz);

        if (esMagica(matriz)) {
            System.out.println("La matriz es mágica.");
        } else {
            System.out.println("La matriz NO es mágica.");
        }
    }

    // Método para verificar si una matriz es mágica
    public static boolean esMagica(int[][] matriz) {
        if (matriz == null || matriz.length == 0) {
            return false;
        }

        int n = matriz.length;
        int constanteMagica = 0;

        // Calcular la suma de la primera fila como referencia
        for (int j = 0; j < n; j++) {
            constanteMagica += matriz[0][j];
        }

        // Verificar suma de filas
        for (int i = 1; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < n; j++) {
                sumaFila += matriz[i][j];
            }
            if (sumaFila != constanteMagica) {
                return false;
            }
        }

        // Verificar suma de columnas
        for (int j = 0; j < n; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < n; i++) {
                sumaColumna += matriz[i][j];
            }
            if (sumaColumna != constanteMagica) {
                return false;
            }
        }

        // Verificar suma de la diagonal principal
        int sumaDiagonal1 = 0;
        for (int i = 0; i < n; i++) {
            sumaDiagonal1 += matriz[i][i];
        }
        if (sumaDiagonal1 != constanteMagica) {
            return false;
        }

        // Verificar suma de la diagonal secundaria
        int sumaDiagonal2 = 0;
        for (int i = 0; i < n; i++) {
            sumaDiagonal2 += matriz[i][n - 1 - i];
        }
        if (sumaDiagonal2 != constanteMagica) {
            return false;
        }

        return true; // Si pasa todas las validaciones, es mágica
    }

    // Método para generar una matriz aleatoria con valores entre 0 y 9
    static int[][] generarMatrizAleatoria(int numFilas, int numColumnas) {
        int[][] matriz = new int[numFilas][numColumnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10); // Números entre 0 y 9
            }
        }
        return matriz;
    }

    // Método para mostrar la matriz en pantalla
    static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
