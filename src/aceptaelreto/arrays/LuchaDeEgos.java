package arrays;

public class LuchaDeEgos {
    
}
Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario.

/* 

Lucha de egos
Tiempo máximo: 1,000-2,000 s  Memoria máxima: 4096 KiB
Reunión de multitud de superhéroes creados por Stan Lee
Se veía venir. La fila de superhéroes entrando en el despacho de Stan Lee a quejarse se divisaba desde Asgard. Y es que todos querían ser más poderosos que sus compañeros de trabajo. Que si Luke Cage decía que era más fuerte que Hulk, que si Iron Man quería ser más seductor que Daredevil, que si Jessica Jones quería ser más impertinente que la Viuda negra…

Stan Lee propuso que esta lucha de egos se zanjara mediante batallas justas, pactadas y equilibradas. Equilibrarlas supuso un quebradero de cabeza para todos.

Al final, el sindicato THANOS (Trabajadores Heroicos Aunque Necesitados de Organización Sindical) tuvo que intervenir, y acordó con Stan Lee crear un sistema que emparejara a los superhéroes en función de sus preferencias.

El propio Stan Lee asignó a cada superhéroe un nivel de destreza entre 1 y 5. Por su parte, los superhéroes indicaron sus preferencias de la destreza que debía tener su oponente:

Si querían enfrentarse con superhéroes con un nivel concreto, indicaban "=N", con N entre 1 y 5.
Si, por el contrario, estaban dispuestos a enfrentarse con superhéroes que tuvieran un nivel mayor, decían ">N", con N entre 0 y 4.
Los más cobardes podían indicar "<N" para pedir superhéroes de nivel inferior a N, entre 2 y 6.
La lucha se ha convertido en tradición y se hace todos los años. Tienes la valoración de cada superhéroe y sus preferencias y debes emparejarlos. Cada superhéroe luchará con el primero que vaya después en la lista y que cumpla las restricciones de ambos, siempre que no haya sido emparejado previamente. Con este mecanismo de emparejamiento, es posible que algunos superhéroes se queden sin emparejar.

Entrada
El programa deberá procesar múltiples casos de prueba leídos de la entrada estándar.

Cada uno comienza con el número N de superhéroes que competirán en el torneo de egos (como mucho 100).

A continuación aparece una línea de N números entre 1 y 5 con la destreza de cada uno. Después, seguirá una segunda línea con sus preferencias en el mismo orden, y de la forma <N, =N y >N.

La entrada termina con un caso sin superhéroes, que no debe procesarse.

Salida
El programa escribirá, por cada caso de prueba, los emparejamientos realizados en líneas independientes. Cada superhéroe se identifica por su posición en la lista de la entrada (valores entre 1 y N).

La asignación de emparejamientos se realiza buscando desde el primero hasta el último el primer superhéroe que vaya después en la lista que permita que ambos estén conformes con el enfrentamiento. Cada superhéroe lucha solo una vez, por lo que si un superhéroe es asignado en un duelo, no se le busca otro.

Si el proceso termina sin ningún emparejamiento se escribirá NO HAY.

Después de cada caso de prueba se escribirá "---".

Entrada de ejemplo
3
3 1 4
<3 >3 =4
6
3 1 4 4 5 3
=3 >0 <5 =4 <3 >2
0
Salida de ejemplo
 
NO HAY
---
1 6
2 3
---
*/