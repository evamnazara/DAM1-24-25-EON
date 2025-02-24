/*Se dice que una matriz cuadrada, es decir que tiene el mismo número de filas que de columnas, es triangular cuando todos los valores que están por encima o por debajo de la diagonal principal son cero. También son triangulares aquellas matrices que cumplen estas dos condiciones a la vez.

T3=⎡⎣⎢⎢100260345⎤⎦⎥⎥
Realiza un programa que diga si una matriz cuadrada dada es o no triangular.

Entrada
La entrada consta de una serie de casos de prueba. Cada caso comienza con un número que representa el número de filas, mayor que cero y menor o igual que 50, de la matriz cuadrada. A continuación se dan los elementos que forman la matriz.

La entrada terminará con una matriz de 0 filas.

Salida
Para cada caso de prueba se indicará SI si la matriz es triangular y NO en caso contrario.

 */
package aceptaelreto.matrices;

import java.util.Scanner;

public class MatrizTriangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Paso 1: Leer el tamaño de la matriz
            int n = sc.nextInt();
            if (n == 0) break; // Terminar si el tamaño es 0

            // Paso 2: Crear la matriz y leer sus valores
            int[][] matriz = new int[n][n];
            for (int i = 0; i < n; i++) { // Recorrer filas
                for (int j = 0; j < n; j++) { // Recorrer columnas
                    matriz[i][j] = sc.nextInt();
                }
            }

            // Paso 3 y 4: Verificar si es triangular superior o inferior
            boolean esTriangularSuperior = true;
            boolean esTriangularInferior = true;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i > j && matriz[i][j] != 0) { // Debajo de la diagonal
                        esTriangularSuperior = false;
                    }
                    if (i < j && matriz[i][j] != 0) { // Encima de la diagonal
                        esTriangularInferior = false;
                    }
                }
            }

            // Paso 5: Imprimir resultado
            if (esTriangularSuperior || esTriangularInferior) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
