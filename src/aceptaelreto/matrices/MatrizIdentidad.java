package aceptaelreto.matrices;

import java.util.Scanner;

public class MatrizIdentidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer casos de prueba hasta que se ingrese una matriz de 0 filas
        while (true) {
            int n = sc.nextInt();  // Número de filas (y columnas)

            if (n == 0) {
                break;  // Si es 0, terminamos la entrada
            }

            // Leer la matriz y verificar si es identidad
            boolean esIdentidad = true;  // Suponemos que es identidad
            int[][] matriz = new int[n][n];

            // Leer los elementos de la matriz
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j] = sc.nextInt();
                }
            }

            // Comprobar si es una matriz identidad
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i == j && matriz[i][j] != 1) || (i != j && matriz[i][j] != 0)) {
                        esIdentidad = false;
                        break;
                    }
                }
                if (!esIdentidad) break;
            }

            // Imprimir el resultado para este caso de prueba
            if (esIdentidad) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

        // Cerrar el scanner
        sc.close();
    }
}



/*¿Es matriz identidad?
Tiempo máximo: 1,000-2,000 s  Memoria máxima: 4096 KiB
Se dice que una matriz es identidad cuando todos sus elementos son cero a excepción de la diagonal principal, que se encuentra rellena de unos:

I3=⎡⎣⎢⎢100010001⎤⎦⎥⎥
Para que una matriz sea identidad debe de ser cuadrada, es decir, tener el mismo número de filas que de columnas.

Entrada
La entrada consta de una serie de casos de prueba. Cada uno comienza con un número que representa el número de filas, como máximo 50, de una matriz cuadrada. Tras él, aparecen los elementos que forman la matriz, que serán valores entre -1.000 y 1.000 (incluídos).

La entrada terminará con una matriz de 0 filas.

Salida
Para cada caso de prueba se indicará SI si la matriz es identidad y NO en caso contrario.

Entrada de ejemplo
3
1 0 0
0 1 0
0 0 1
2
0 1
1 0
5
1 0 0 0 0
0 5 0 0 0
0 0 1 0 0
0 0 0 1 0
0 0 0 0 1
0
Salida de ejemplo
SI
NO
NO */