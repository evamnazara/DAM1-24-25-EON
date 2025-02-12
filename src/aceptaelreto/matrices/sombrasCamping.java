package matrices;
import java.util.Scanner;

/*Se acerca el verano y los aficionados a la naturaleza pasarán buena parte de él en campings, disfrutando del aire libre.

Un requisito imprescindible en los meses de calor es colocar la tienda de campaña bajo la sombra de un buen árbol para poder pasar frescos las horas de siesta. Pero, dependiendo de la zona, eso no siempre es fácil. En los campings nuevos, el número de árboles es escaso, y también lo es por tanto el número de parcelas aptas para tiendas.

Árboles en un camping
Figura 1: primer ejemplo de entrada destacando las zonas de sombra
Sabiendo que cada árbol proporciona sombra a las ocho parcelas adyacentes, ¿cuántas tiendas de campaña disfrutarán de sombra en un camping?

Entrada
El programa deberá procesar múltiples casos de prueba recibidos por la entrada estándar. Cada uno representa un camping formado por una cuadrícula de parcelas de igual tamaño en los que puede haber hueco para una tienda, o un árbol.

Cada caso de prueba comienza con dos números 1 ≤ c, f ≤ 50, indicando el número de columnas y de filas de la cuadrícula de parcelas. A continuación se indica el número a de árboles del camping.

Si hay árboles, en la siguiente línea aparece la posición de todos ellos, indicando para cada uno la columna (1…c) y la fila (1…f) que ocupan. En total, aparecerán 2×a números.

La entrada termina con una línea con tres ceros (camping con dimensiones nulas y sin árboles), que no debe procesarse.

Salida
Por cada caso de prueba el programa indicará, en una línea, el número de parcelas que disfrutarán de sombra.

Entrada de ejemplo
7 7 8
7 2 3 3 4 3 4 4 3 5 4 5 1 7 2 7
5 3 1
3 2
0 0 0
Salida de ejemplo
22
8 */

public class sombrasCamping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // PASO 1: Leer el tamaño del camping (columnas y filas)
            int columnas = sc.nextInt();
            int filas = sc.nextInt();
            int numArboles = sc.nextInt();

            // Si es "0 0 0", terminamos
            if (columnas == 0 && filas == 0 && numArboles == 0) break;

            // PASO 2: Crear la matriz del camping
            int[][] terreno = new int[filas][columnas];

            // PASO 3: Leer la posición de los árboles y marcarlos en la matriz
            for (int i = 0; i < numArboles; i++) {
                int colArbol = sc.nextInt() - 1; // Convertimos a índice base 0
                int filaArbol = sc.nextInt() - 1;
                terreno[filaArbol][colArbol] = 1; // Marcar el árbol en la matriz

                // PASO 4: Marcar la sombra en las 8 direcciones alrededor del árbol
                for (int dx = -1; dx <= 1; dx++) {
                    for (int dy = -1; dy <= 1; dy++) {
                        int nuevaFila = filaArbol + dx;
                        int nuevaColumna = colArbol + dy;

                        if (nuevaFila >= 0 && nuevaFila < filas && nuevaColumna >= 0 && nuevaColumna < columnas) {
                            if (terreno[nuevaFila][nuevaColumna] == 0) { // Si no es un árbol
                                terreno[nuevaFila][nuevaColumna] = 2; // Marcar como sombra
                            }
                        }
                    }
                }
            }

            // PASO 5: Contar las parcelas con sombra
            int parcelasConSombra = 0;
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (terreno[i][j] == 2) {
                        parcelasConSombra++;
                    }
                }
            }

            // PASO 6: Imprimir el resultado
            System.out.println(parcelasConSombra);
        }

        sc.close();
    }
}

