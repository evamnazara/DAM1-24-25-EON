package arrays;

public class TurismoDeLuces {
    
}
Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario.

/* 
Turismo de luces
Tiempo máximo: 1,000-2,000 s  Memoria máxima: 8192 KiB
Calle Larios de Málaga, enero de 2018. CC BY-SA 2.0, Ángel de los Ríos (via Flickr)
En Navidad, las ciudades compiten por iluminar sus calles de la forma más vistosa y atrayente posible, lo que ha terminado por consolidar el llamado turismo de luces, en el que infinidad de personas viajan a diferentes puntos del mundo para presenciar estas maravillas.

El ayuntamiento de la localidad en la que vives ha hecho una inversión enorme (parcialmente sufragada por los comerciantes de las zonas afortunadas) y ha hecho un folleto con las N calles iluminadas ordenadas por cercanía, de tal forma que lo más cómodo es visitarlas en ese mismo orden (o en sentido inverso).

El problema es que ¡son demasiadas! Has estimado que te da tiempo a ver únicamente K calles, contiguas en la lista, y tienes que decidir cuáles.

Por la zona en la que está cada calle (y el nivel adquisitivo de sus comerciantes), intuyes el grado de espectacularidad de sus luces. Quieres maximizar tu grado total de asombro que se calcula con la diferencia de la espectacularidad de las visitas consecutivas. Por ejemplo, si ves una calle con una espectacularidad de 10 y a continuación otra con una espectacularidad de 300, entonces tu grado total de asombro sube 290. Pero si justo después vas a una calle con una espectacularidad de 125, la decepción hace que tu grado de asombro descienda 175 (300 − 125).

Entrada
El programa deberá leer múltiples casos de prueba, cada uno ocupando dos líneas.

La primera contiene dos números, N y K, indicando cuántas calles hay iluminadas y cuántas vas a visitar respectivamente (2 ≤ K ≤ N ≤ 500.000).

La segunda línea contiene N números (entre 1 y 109) separados por espacio con el grado de espectacularidad de cada calle.

Salida
Para cada caso de prueba el programa escribirá el mayor grado de satisfacción que puedes conseguir recorriendo exactamente K calles consecutivas de la entrada.

Ten en cuenta que puedes decidir hacer el recorrido completo en cualquier sentido, si eso aumenta tu grado de satisfacción.

Entrada de ejemplo
3 3
10 300 125
5 3
100 200 250 400 600
4 2
400 300 250 270
Salida de ejemplo
115
350
100

*/