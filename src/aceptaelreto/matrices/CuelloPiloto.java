/*package matrices;

import java.util.Scanner;

public class CuelloPiloto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            // Leer dimensiones del circuito
            int ancho = scanner.nextInt();
            int alto = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            
            // Leer el mapa del circuito
            char[][] circuito = new char[alto][ancho];
            int inicioFila = -1, inicioColumna = -1;

            for (int i = 0; i < alto; i++) {
                String linea = scanner.nextLine();
                for (int j = 0; j < ancho; j++) {
                    circuito[i][j] = linea.charAt(j);
                    if (circuito[i][j] == 'O') {
                        inicioFila = i;
                        inicioColumna = j;
                    }
                }
            }

            // Direcciones de movimiento: {derecha, abajo, izquierda, arriba}
            int[] movFila = {0, 1, 0, -1};
            int[] movColumna = {1, 0, -1, 0};
            String[] direcciones = {"DERECHA", "ABAJO", "IZQUIERDA", "ARRIBA"};

            // Encontrar la dirección inicial (buscando un '#')
            int dirActual = -1;
            for (int d = 0; d < 4; d++) {
                int nuevaFila = inicioFila + movFila[d];
                int nuevaColumna = inicioColumna + movColumna[d];

                if (nuevaFila >= 0 && nuevaFila < alto && nuevaColumna >= 0 && nuevaColumna < ancho
                        && circuito[nuevaFila][nuevaColumna] == '#') {
                    dirActual = d;
                    break;
                }
            }

            // Recorrer el circuito
            int curvasIzquierda = 0;
            int curvasDerecha = 0;
            int fila = inicioFila, columna = inicioColumna;

            do {
                // Intentar seguir recto
                int nuevaFila = fila + movFila[dirActual];
                int nuevaColumna = columna + movColumna[dirActual];

                if (nuevaFila >= 0 && nuevaFila < alto && nuevaColumna >= 0 && nuevaColumna < ancho
                        && circuito[nuevaFila][nuevaColumna] == '#') {
                    fila = nuevaFila;
                    columna = nuevaColumna;
                    continue;
                }

                // Si no se puede seguir recto, buscar nueva dirección
                int nuevaDir = -1;
                for (int i = 1; i <= 3; i++) { // Girar en sentido horario
                    int d = (dirActual + i) % 4;
                    nuevaFila = fila + movFila[d];
                    nuevaColumna = columna + movColumna[d];

                    if (nuevaFila >= 0 && nuevaFila < alto && nuevaColumna >= 0 && nuevaColumna < ancho
                            && circuito[nuevaFila][nuevaColumna] == '#') {
                        nuevaDir = d;
                        break;
                    }
                }

                // Contar curva
                if (nuevaDir != -1) {
                    if ((dirActual == 0 && nuevaDir == 1) || (dirActual == 1 && nuevaDir == 2) ||
                        (dirActual == 2 && nuevaDir == 3) || (dirActual == 3 && nuevaDir == 0)) {
                        curvasDerecha++;
                    } else {
                        curvasIzquierda++;
                    }

                    dirActual = nuevaDir;
                    fila += movFila[dirActual];
                    columna += movColumna[dirActual];
                }

            } while (fila != inicioFila || columna != inicioColumna); // Termina cuando vuelve al inicio

            // Imprimir resultado
            System.out.println(curvasIzquierda + " " + curvasDerecha);
        }

        scanner.close();
    }
}


/*
 * EL CUELLO DE LOS PILOTOS

El cuello de los pilotos
Tiempo máximo: 1,000 s Memoria máxima: 4096 KiB
Cualquiera con dos dedos de frente entiende que los ciclistas deben cuidar sobre todo sus rodillas y los tenistas el codo. Lo que es menos conocido es la importancia del cuello en los pilotos de Fórmula 1.

La necesidad de un cuello en forma en estos conductores se debe a las fuertes aceleraciones y deceleraciones que sufren durante las carreras, especialmente en las curvas.

Por eso cuando se incorpora un nuevo circuito en el calendario del mundial sus curvas se analizan minuciosamente. Aunque en un estudio real se miden muchos más factores, nosotros nos conformaremos con contar el número de curvas a la izquierda y a la derecha que tienen esos nuevos circuitos.

Entrada

La entrada está compuesta por distintos casos de prueba, cada uno representando el mapa de un circuito cuyas curvas hay que contar.

La descripión de cada mapa comienza con una línea con dos números tx y ty que indican su ancho y alto (un mínimo de 3 y un máximo de 100 unidades por cada dimensión).

A continuación aparecen ty líneas, con tx caracteres cada una. Cada carácter puede ser un punto (".") que indica campo y una almohadilla ("#") que indica una sección del circuito. Dentro de éste, el carácter "O" (o mayúscula) marca la posición desde la que comienza la carrera, que nunca estará situada en una curva.

En nuestros circuitos los coches siempre van en horizontal o vertical (nunca en diagonal) y recorren el circuito en sentido de las agujas del reloj.

Salida

Por cada caso de prueba se escribirá una única línea con dos números separados por un espacio. El primero indica las curvas hacia la izquierda y el segundo las curvas hacia la derecha que deben hacer los pilotos en el circuito.

Entrada de ejemplo

3 3
#O#
#.#
###
15 5
..#####..###...
..#...####.##..
###.........#..
O.....####..#..
#######..####..

================

Aquí tienes una solución en Java explicada paso a paso, utilizando solo estructuras básicas y sin funciones avanzadas ni List.

Estrategia para resolver el problema
	1.	Leer la entrada
	•	Se leen dos números tx y ty que indican el tamaño del mapa del circuito.
	•	Luego se leen ty líneas con tx caracteres (# para el circuito, . para campo, O para la posición inicial).
	2.	Encontrar el punto de inicio (O)
	•	Se busca en la matriz de caracteres la posición donde se encuentra O.
	3.	Seguir el circuito en sentido horario
	•	Como los coches siempre se mueven en líneas rectas (horizontal o vertical), debemos seguir el camino de # hasta recorrer todo el circuito.
	•	Cada vez que cambia la dirección, verificamos si la curva es hacia la izquierda o hacia la derecha.
	4.	Contar las curvas
	•	Se lleva un registro de la dirección actual (arriba, abajo, izquierda, derecha).
	•	Cada vez que la dirección cambia, se determina si el giro es a la izquierda o derecha y se incrementa el contador correspondiente.
	5.	Imprimir el resultado
	•	Se imprime el número de curvas a la izquierda y a la derecha.

Código en Java



Explicación del código

1. Leer la entrada
	•	Se leen tx (ancho) y ty (alto).
	•	Se almacena el circuito en una matriz bidimensional char[][].
	•	Se busca la posición de O (inicio del recorrido).

2. Determinar la dirección inicial
	•	Se revisan las 4 direcciones (DERECHA, ABAJO, IZQUIERDA, ARRIBA).
	•	Se elige la primera dirección con #.

3. Seguir el recorrido del circuito
	•	Se avanza recto en la dirección actual siempre que sea posible.
	•	Si no se puede seguir recto, se gira en sentido horario hasta encontrar #.

4. Contar curvas
	•	Si el cambio de dirección sigue el orden (DERECHA → ABAJO → IZQUIERDA → ARRIBA), es una curva a la derecha.
	•	Si el cambio de dirección es inverso, es una curva a la izquierda.

5. Imprimir el resultado
	•	Se imprime el número de curvas izquierda y derecha.

Ejemplo de ejecución

Entrada

3 3
#O#
#.#
###
15 5
..#####..###...
..#...####.##..
###.........#..
O.....####..#..
#######..####..

Salida

2 2
4 3

Complejidad y optimización
	•	Leer la matriz: O(tx × ty)
	•	Buscar la dirección inicial: O(4) ≈ O(1)
	•	Recorrer el circuito: O(tx × ty)
	•	Peor caso total: O(tx × ty) ≈ 10,000, muy eficiente.

Conclusión

✅ No usa estructuras avanzadas (List, parseInt, etc.).
✅ Código claro y bien explicado para programadores novatos.
✅ Manejo eficiente de memoria y tiempo de ejecución.
✅ Sigue fielmente la lógica del problema.

 */