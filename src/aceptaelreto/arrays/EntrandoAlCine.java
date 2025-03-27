package arrays;

public class EntrandoAlCine {
    
}
Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario.

/* 
Entrando al cine
Tiempo máximo: 1,000-2,000 s  Memoria máxima: 4096 KiB
Larga cola de gente
El cine de verano del pueblo está a punto de morir de éxito, pues la gran afluencia de gente todas las noches hace que se forme una larga cola que provoca la ira de los vecinos.

Hace pocas semanas el consistorio puso en marcha una medida original en los cines de verano: las localidades ahora están numeradas. Se dividió el cine en dos mitades, de forma que todas las butacas de la izquierda tienen ahora números impares mientras que las de la derecha tienen numeración par.

El nuevo funcionamiento ha hecho mejorar bastante la situación porque ahora la compra de las entradas está más escalonada a lo largo del día y la gente no se agolpa en las taquillas cerca de la hora de comienzo de la sesión. Lamentablemente, no está todo resuelto. La larga fila de gente que antes tenía que esperar en esas taquillas espera ahora en la única puerta de entrada al recinto.

Ramiro, el encargado de comprobar las entradas en esa puerta, ya no aguanta más las quejas de los vecinos. Aprovechando que está por allí un ayudante, ha decidido abrir la segunda puerta que permite acceder al cine por el lado de las butacas impares. Pero le da miedo que, en el momento de abrirla, la confusión haga que algunos de los que están esperando se adelanten a otros, por lo que únicamente abrirá la puerta si todos los que van al lado impar del cine están al final de la fila. ¿Puedes ayudarle?

Entrada
La entrada comenzará con un número que indica el número de casos de prueba que aparecen a continuación.

Cada caso de prueba se compone de dos líneas, la primera de ellas tiene un único entero con el número de vecinos esperando en la fila (como mucho 10.000), mientras que la segunda línea contiene el número de butaca a la que va cada uno de ellos. El primer vecino en la cola aparece el primero en la línea.

Salida
Por cada caso de prueba aparecerá una línea independiente indicando si Ramiro puede habilitar la segunda puerta o no. En caso afirmativo aparecerá la palabra SI seguida del número de gente que se quedará en su puerta. Si la fila no cumple la condición impuesta por Ramiro, se escribirá NO.

Entrada de ejemplo
2
10
2 4 6 8 10 1 3 5 7 9
5
6 2 3 0 1
Salida de ejemplo
SI 5
NO

*/