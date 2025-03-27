package arrays;

public class EmbarqueEnTrasatlantico {
    
}
Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario.

/* 

Embarque en un transatlántico
Tiempo máximo: 1,000-5,000 s  Memoria máxima: 8192 KiB
Los transatlánticos son buques gigantes con infinidad de cubiertas ("pisos") con camarotes, que pueden transportar simultáneamente a un ingente número de viajeros. Esto hace que se necesite una gran cantidad de tiempo hasta que todos los pasajeros embarcan, organizándose grandes líos en los pasillos interiores.

Queen Mary 2 (fotografía de Brian Burnell)
Queen Mary 2 (fotografía de Brian Burnell)
Para intentar paliar el problema, los responsables de la empresa Cruz Ana Do han decidido que, independientemente de cómo se sitúen los pasajeros en la cola para embarcar, los irán llamando por cubiertas.

Por organizarse, cada vez que hagan embarcar a los ocupantes de una cubierta, los organizadores desean saber cuánta gente queda aún en el puerto esperando. También están interesados en saber, algunas veces, a qué cubierta va alguno de los pasajeros de la cola.

Entrada
La entrada consta de una serie de casos de prueba. Cada uno comienza con una línea con un único número que indica la cantidad de pasajeros, 1 ≤ n ≤ 1.000.000, a la espera de embarcar. A continuación, en una segunda línea, aparece un número por cada uno de los n pasajeros indicando en qué cubierta tiene su pasaje. Los transatlánticos tienen numeraciones de las cubiertas bastante caprichosas (por ejemplo, por superstición algunos no tienen cubierta número 13) de modo que no se debe asumir que sean consecutivos. Al menos sabemos que siempre son positivos menores que 231.

Tras la descripción de los pasajeros aparece una nueva línea con un número indicando cuántas acciones realizan los responsables del embarque. Estas acciones aparecen enumeradas a continuación, cada una en una línea.

A la acción de embarcar a los ocupantes de una determinada cubierta se la denomina EMBARQUE y viene seguida por el número de la cubierta. A la acción de averiguar la cubierta a la que está destinado uno de los pasajeros que aún quedan en la cola se la denomina CONSULTA, y viene seguido por su posición en la cola (un número entre 1 y el número de pasajeros restantes).

Los responsables del embarque a veces se confunden y llaman a los pasajeros de cubiertas que no existen (o que ya han sido embarcadas). Sin embargo, siempre preguntan la cubierta de pasajeros existentes.

El programa terminará cuando se llegue a un caso de prueba sin pasajeros.

Salida
Para cada acción EMBARQUE el programa indicará cuántos pasajeros quedan aún esperando en el puerto para subir al transatlántico una vez que han embarcado todos los viajeros que iban a la cubierta dada. Para cada acción CONSULTA se indicará la cubierta del pasajero situado en esa posición de la cola de viajeros pendiente.

Se escribirá un * después de cada caso de prueba.

Entrada de ejemplo
2
3 4
2
EMBARQUE 0
CONSULTA 2
10
0 1 0 2 0 3 0 4 0 5
5
CONSULTA 1
CONSULTA 2
EMBARQUE 0
CONSULTA 1
CONSULTA 2
0
Salida de ejemplo
 
2
4
*
0
1
5
1
2
*
*/
