package arrays;

public class Zamburguesa {
    
}
Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. 

/* 
Saltando al otro lado
Tiempo máximo: 1,000-2,000 s  Memoria máxima: 8192 KiB
Zamburguesas
Juan Esal Tarín quiere saltar de un lado a otro de un río. La otra orilla parece lejos pero, afortunadamente, hay algunas piedras (conocidas también como zamburguesas en algunos contextos) a las que puede ir saltando hasta llegar a la orilla contraria.

Saltar de un sitio a otro, no obstante, es muy cansado. Cada vez que da un salto que le requiere usar su máxima potencia, esta se ve decrementada en una unidad. Eso significa que si en una orilla parte con una potencia de salto de K metros y las piedras están separadas distancias menores que ese K, podrá pasar sin problema al otro lado. Sin embargo, si una de las separaciones es de exactamente K, entonces las separaciones de las piedras siguientes no podrán exceder K − 1. Si algún salto requiere esa distancia, entonces su capacidad de salto bajará de nuevo, hasta K − 2.

Por ejemplo, en un río las piedras están colocadas a distancia 1, 6, 7 y 11 y la otra orilla a distancia 13. Si partimos con una capacidad de salto de 5, el proceso será el siguiente:

Salta desde la orilla (posición 0) hasta la primera piedra, situada a distancia 1, lo que requiere una capacidad de salto 1.
Desde la piedra en 1 salta a la piedra en 6. Como la distancia total coincide con la capacidad de salto, esta se ve reducida a 4.
Desde la piedra en 6 salta a la piedra en 7 sin problema.
Desde la piedra en 7 salta a la piedra en 11. Este salto también es posible pues requiere capacidad de salto 4, que coincide con la capacidad actual. Al ser iguales, la capacidad se ve reducida a 3.
Desde la piedra en 11 salta, sin problema, a la orilla en 13.
Dado una colocación de las piedras en un río, ¿cuál es la mínima capacidad de salto de partida necesaria para poder atravesar el río sin problema?

Entrada
La entrada comienza con un número indicando el número de casos de prueba.

Cada caso de prueba empieza con un número N con el número de posiciones que se darán (hasta 100.000). Las primeras N − 1 posiciones se corresponden con las piedras en el río (dadas en orden de distancia a la orilla origen) y la última con la distancia a la otra orilla (como mucho 109).

Salida
Por cada caso se escribirá una línea con la capacidad de salto inicial mínima para llegar al otro lado.

Entrada de ejemplo
2
2
5 10
5
1 6 7 11 13
Salida de ejemplo
6
5
(c) 

*/