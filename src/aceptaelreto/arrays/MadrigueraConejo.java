package arrays;

public class MadrigueraConejo {
    
}

Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. 

/* 
La madriguera del Señor Conejo
Tiempo máximo: 1,000-3,000 s  Memoria máxima: 32768 KiB
Dos conejos europeos juntos
El Señor Conejo y su familia tienen una madriguera muy particular. Para poder refugiarse rápidamente cuando aparece el señor Zorro, cada conejo entra en la madriguera por un agujero distinto. Estos agujeros están situados a lo largo de una línea recta y, por supuesto, están hechos a la medida exacta de cada conejo. Tanto es así que cuando celebran una fiesta y comen más de la cuenta, los conejos no son capaces de salir por el agujero que les corresponde. En estas situaciones cada conejo tiene que buscar un agujero más grande que el suyo para poder salir, y normalmente se arma un follón considerable.

Así que han decidido organizarse de la siguiente manera: los conejos siempre saldrán por el primer agujero que puedan que se encuentre a la derecha de aquel por el que entraron. Es decir, para salir todos se mueven hacia la derecha, y cuando encuentran el primer agujero más grande que el suyo salen. Al final de la madriguera han construido un agujero lo suficientemente grande como para que todos puedan salir por él si es necesario. En particular, el último conejo siempre tiene que salir por este agujero.

Con este modo de actuar todos los conejos deberán moverse, al menos, una unidad de distancia. ¿Cuál es la suma total de las distancias recorridas por todos los conejos?

Entrada
La entrada está formada por distintos casos de prueba, cada uno en una línea distinta. En cada línea aparece en primer lugar un número entero N (1 ≤ N ≤ 500.000), el número de conejos y agujeros. A continuación aparece una lista con N números enteros d1, d2, ..., dN, que representan los diámetros de cada uno de los N agujeros por los que entran los conejos. Los diámetros de todos los agujeros satisfacen 1 ≤ di ≤ 20.

El final de la entrada se indica con una línea con un único 0 que no se debe procesar.

Salida
Para cada caso de prueba, se escribirán una línea con la distancia total recorrida por todos los conejos hasta encontrar el agujero por el que salir. Ten en cuenta que aunque cada conejo entra por un agujero distinto, puede ocurrir que varios salgan por el mismo sitio.

Entrada de ejemplo
4 1 2 3 4
4 2 1 3 4
5 5 4 3 2 1
0
Salida de ejemplo
4
5
15

*/
