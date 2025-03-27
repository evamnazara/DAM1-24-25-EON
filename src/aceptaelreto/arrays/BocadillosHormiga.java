package arrays;

public class BocadillosHormiga {
    
}

Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario.

/* 
Los bocadillos de la hormiga reina
Tiempo máximo: 1,000-4,000 s  Memoria máxima: 4096 KiB
Hormiga
Ser hormiga reina no es fácil. No vamos a enumerar aquí todos y cada uno de los problemas que tiene que solucionar a lo largo del día; baste con uno de ellos a modo de ejemplo.

Cuando llega la hora de la merienda tiene que ponerse a hacer bocadillos para toda su prole. Migas de pan y de corteza no le faltan, pero cada uno de los cachitos de corteza tiene un tamaño distinto, así que conseguir dos cachos iguales para poder poner en la base del bocadillo y en la tapa es una tarea complicada. Afortunadamente sus hijas son bastante inocentes y si la tapa inferior del bocadillo está formada por distintos cachitos de corteza no se darán cuenta, siempre y cuanto la corteza superior cubra exactamente todos los cachos de corteza de la capa inferior.

Como no tiene tiempo que perder ha decidido simplificar las cosas. Ha puesto en fila todos los cachos de corteza que hay en el hormiguero (¡son muchos!). Para hacer el primer bocadillo simplemente busca desde la izquierda de la hilera hacia el final un cacho de corteza que sirva de tapa de todos los trocitos que quedan a la derecha. ¿Podrá hacer un bocadillo? ¿Con qué tapa?

Entrada
La entrada está compuesta por distintos casos de prueba, cada uno de ellos ocupando dos líneas. La primera línea indica el número de cortezas que hay en el hormiguero (como mucho 100.000); la segunda línea contiene los tamaños de cada uno de los trocitos, según han quedado dispuestos para hacer los bocadillos. Todos los tamaños serán números positivos y la suma de todos ellos no será superior a 109.

La entrada termina con un caso de prueba sin cortezas, que no debe procesarse.

Salida
Para cada caso de prueba se indicará si se podrá hacer un bocadillo utilizando el mecanismo simplificado de la reina explicado más arriba que tenga una tapa con la misma longitud que la base. En caso negativo se indicará NO. En caso afirmativo se escribirá SI seguido de la posición que ocupa en la hilera original la tapa superior del bocadillo (empezando a contar desde el 1).

Si hay varios posibles bocadillos, se montará el más grande posible; después de todo las hormigas son pequeñas, pero están hambrientas.

Entrada de ejemplo
10
3 5 8 25 12 15 5 7 1 2
7
6 2 3 1 1 8 12
8
9 45 5 20 10 1 6 3
0
Salida de ejemplo
 
SI 6
NO
SI 2

*/
