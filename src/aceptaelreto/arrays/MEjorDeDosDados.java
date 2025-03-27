package arrays;

public class MEjorDeDosDados {
    
}

Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario.

/* 
El mejor de dos dados
Tiempo máximo: 1,000-2,000 s  Memoria máxima: 8192 KiB
Dados
Existe un juego para dos jugadores que se juega con dos dados. Cada jugador coge uno de ellos y lo lanza. El que obtiene la tirada más alta, gana esa ronda. Y, como es lógico, sale vencedor el que más rondas gana.

Desde un punto de vista de probabilidad, el juego no tiene ningún misterio si ambos jugadores utilizan dados idénticos. Ambos tienen las mismas probabilidades de ganar.

Lo divertido viene cuando los dados son distintos. En el momento de comenzar una partida, el jugador de más edad analiza ambos dados y decide con cuál jugará.

Entrada
La entrada está compuesta por varios casos de prueba, cada uno ocupando 3 líneas.

La primera línea contiene el número de caras de los dados (2 ≤ n ≤ 100.000). A continuación vendrán dos líneas con n números cada una que contienen los valores de cada cara (entre 1 y 10.000).

La salida termina con un caso de prueba con dados de 0 caras que no debe procesarse.

Salida
Por cada caso de prueba se escribirá PRIMERO si el jugador debe coger el primer dado para maximizar sus opciones de ganar, y SEGUNDO si es mejor el segundo dado.

Si no hay diferencia entre elegir uno u otro, se escribirá NO HAY DIFERENCIA.

Entrada de ejemplo
6
9 9 9 9 1 1
6 6 6 6 6 6
6
4 4 4 4 11 11
6 6 6 6 6 6
3
3 3 3
3 3 3
6
9 9 9 9 1 1
4 4 4 4 11 11
0
Salida de ejemplo
PRIMERO
SEGUNDO
NO HAY DIFERENCIA
SEGUNDO

*/