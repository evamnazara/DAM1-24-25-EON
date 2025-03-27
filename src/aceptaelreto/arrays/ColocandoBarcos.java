package arrays;

public class ColocandoBarcos {
    
}

Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario.

/* 
Colocando barcos
Tiempo máximo: 1,000 s  Memoria máxima: 4096 KiB
Tablero del juego 'Hundir la flota'
Durante la Primera Guerra Mundial se hizo popular el juego Batalla naval, inicialmente jugado con lápiz y papel y, mucho después, con tableros de diferentes características y nombres, como Hundir la flota.

Al comenzar una partida, el primer paso de cada uno de los dos jugadores es colocar, secretamente, sus barcos en el área de juego. No está clara cuál es la mejor estrategia para hacerlo, si repartir todos los barcos de manera uniforme por todo el espacio disponible, o concentrarlos en una zona concreta con la esperanza de mantenerlos agazapados y más difíciles de encontrar.

Como organizador del campeonato mundial de Hundir la flota, quieres hacer un análisis sobre esta cuestión, y para eso tienes que empezar analizando los tableros planteados por los contrincantes. En particular, es interesante saber la mayor distancia entre dos posiciones ocupadas por un barco dentro del tablero. Como en los tableros no se pueden colocar los barcos en diagonal, se considera que la distancia es la suma de las distancias en cada eje.

Entrada
La entrada está compuesta por múltiples casos de prueba. Cada uno comienza con un número 2 ≤ n ≤ 1.000 indicando la cantidad de posiciones (celdas) ocupadas en el tablero. A continuación, aparecen, en otra línea, n parejas de números con la lista de celdas ocupadas. Una celda se especifica con dos números indicando, respectivamente, la fila y la columna, y serán números entre 1 y 1.000.

La entrada termina con un caso sin celdas ocupadas, que no deberá procesarse.

Salida
Para cada caso de prueba el programa escribirá la distancia entre las dos celdas ocupadas más alejadas entre sí. La distancia se mide asumiendo que no se pueden realizar desplazamientos en diagonal, por lo que será la suma de las distancias en cada eje.

Entrada de ejemplo
3
0 0
5 5
10 10
4
10 1
1 10
5 5
6 6
0
Salida de ejemplo
20
18


*/
