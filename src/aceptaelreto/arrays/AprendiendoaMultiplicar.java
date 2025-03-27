package arrays;

public class AprendiendoaMultiplicar {
    
}
Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario.

/* 
Aprendiendo a multiplicar
Tiempo máximo: 1,000-2,000 s  Memoria máxima: 4096 KiB
El pequeño Samuel está aprendiendo a multiplicar. Su forma de ser le lleva a querer aprenderlo todo, por lo que en cuanto ve una ristra de números se pone a multiplicarlos uno tras otro hasta el final. No le asusta que sean número grandes ni que el resultado tenga muchos dígitos.

Lo que sí le molesta es que habitualmente el resultado final de la multiplicación de todos esos números (¡incluso miles de ellos!) termine siendo cero. Y no le gusta porque, sabe, eso hace que no practique tanto como le gustaría.

Ahora nos ha pedido ayuda para aconsejarle qué números multiplicar. Cuando se encuentra una secuencia de números nos pregunta qué segmento de ellos multiplicar de forma que sea lo más grande posible y que su resultado no sea cero.

Entrada
La entrada comenzará con la cantidad de secuencias de números que tendremos que procesar. Cada secuencia aparecerá en dos líneas en la entrada, la primera contendrá la longitud de la secuencia (0 ≤ n ≤ 10.000), y la segunda tendrá los n números enteros.

Salida
Para cada secuencia se indicará, en una línea independiente, la cantidad total de números que Samuel podrá multiplicar y su lugar en la secuencia (donde el primer elemento es el 0). Mira el formato exacto en el ejemplo. Si hay varios segmentos posibles con la misma longitud, se debe mostrar el que aparezca antes en la secuencia.

Si no hay ningún segmento posible que Samuel pueda multiplicar, se escribirá "SIGUE BUSCANDO".

Entrada de ejemplo
4
4
6 7 8 9
10
0 8 9 7 0 1 8 9 0 2
1
0
1
1
Salida de ejemplo
 
4 -> [0,3]
3 -> [1,3]
SIGUE BUSCANDO
1 -> [0,0]

*/
