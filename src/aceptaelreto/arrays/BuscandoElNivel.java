package arrays;

public class BuscandoElNivel {
    
}
Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. 

/* 
Buscando el nivel
Tiempo máximo: 1,000-2,000 s  Memoria máxima: 4096 KiB
Lector de cassettes con el inicio del outrun en la posición de la cinta
Los ordenadores domésticos de los 80 guardaban los datos en cintas de cassette, que son un soporte secuencial. El ordenador no podía elegir qué datos leer, sino que el usuario pulsaba el botón Play, la cinta comenzaba a girar, y si los datos que pasaban por debajo del lector eran los esperados, el ordenador los leía y, si no, los descartaba y seguía esperando a que llegaran los correctos. Como la búsqueda de los datos era manual, los lectores solían disponer de un contador, que avanzaba con la cinta. Al rebobinarla, el usuario podía usar el contador para saber dónde parar, siempre que hubiera anotado con antelación las posiciones de cada cosa.

Normalmente los programas tenían todos los datos seguidos en la cinta y no había que hacer nada especial. Pero algunos juegos necesitaban más información de la que entraba en memoria y, al superar un nivel, había que pulsar Play y esperar a que se cargara el siguiente. Al acabar la partida había que rebobinar la cinta hasta la posición donde estaba guardado el nivel 1 para que el programa lo leyera y se pudiera jugar otra vez. En juegos como "Out Run", donde al acabar un nivel se podía ir a dos distintos, era necesario buscar también al avanzar y no solo al acabar la partida.

Entrada
Cada caso de prueba comienza con un número 1 ≤ n ≤ 100 indicando la cantidad de niveles que tiene un determinado juego. A continuación aparecen n números indicando lo que ocupa en la cinta la información de cada uno de esos niveles. Los niveles aparecen guardados uno detrás de otro en orden.

El caso de prueba continúa con un número 1 ≤ q ≤ 10.000 indicando cuántas subconsultas se harán sobre los datos anteriores. Cada una está compuesta por dos números 1 ≤ a,b ≤ n, indicando el último nivel que se ha cargado (la cinta está colocada al final de sus datos) y el siguiente que se tiene que cargar.

La entrada termina con un caso de un juego sin niveles, que no deberá procesarse.

Salida
Por cada subconsulta, el programa escribirá el desplazamiento que hay que realizar sobre la cinta para colocarla al principio de los datos del nuevo nivel a cargar (un número positivo significará avanzar y uno negativo retroceder). Después de cada caso de prueba se escribirán tres guiones (---).

Entrada de ejemplo
5 10 20 40 7 3
3
1 2
2 5
4 1
0
Salida de ejemplo
 
0
47
-77
---

*/