package arrays;

public class YongueStreet {
    
}
Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. 

/* 

Yonge Street
Tiempo máximo: 1,000-4,000 s  Memoria máxima: 4096 KiB
Señal de Yonge Street, Toronto, Canadá
Aunque no es su capital, Toronto es la ciudad más grande de Canadá y su centro financiero. Además, está dentro del Libro Guiness de los Récords por tener la calle más larga del mundo, llamada Yonge Street, con una longitud total de 86 kilómetros.

Todavía está por incorporar a ese mismo libro el nombre de la primera persona que consiga recorrerla entera sin que le pille ningún semáforo en rojo. Y, con semejante tamaño, es poco probable que alguien lo consiga antes de que se invente el teletransporte.

Aun así, es espectacular ver, desde un extremo, como todos los semáforos cambian de color hasta donde alcanza la vista; y como todos los coches pisan el freno, llenando 86 kilómetros de luces rojas.

Dadas las posiciones de todos los vehículos y de los semáforos en el momento en el que éstos se ponen en rojo, ¿eres capaz de saber dónde terminará parado cada uno haciendo cola hasta que los semáforos vuelvan a estar verdes?

Entrada
Cada caso de prueba comienza con una línea con hasta 200.000 caracteres representando la situación de Yonge Street en el momento en el que todos sus semáforos se cierran. Un carácter '|' indica la posición de un semáforo, un carácter '.' indica una posición libre, y las letras del alfabeto inglés representan vehículos de diferente tipo (automóvil, furgoneta, camión, tractor… amigo que vas en burro).

Tras esa línea aparece otra, con consultas sobre el estado final de la calle. El primer número, n, indica cuántas consultas vienen a continuación, en esa misma línea, separadas por espacio. Cada una consiste en el número de posición por la que se pregunta. La primera posición de la calle, más a la izquierda en la entrada, se corresponde con el número 1.

Salida
Para cada consulta de los casos de prueba se escribirá el contenido de esa posición una vez que todos los vehículos han parado en sus posiciones a la espera de que se abran los semáforos. Las respuestas de cada caso de prueba se darán todas en la misma línea, separadas por espacio. No debe aparecer un espacio tras la última respuesta.

Los vehículos se mueven de izquierda a derecha hasta llegar a un semáforo, momento en el que se detendrán, delante de él, formando una fila. Canadá es un país tranquilo, y nadie se adelanta mientras conduce.

Entrada de ejemplo
A.|.B
5 1 2 3 4 5
AB..C|
5 6 5 4 3 1
Salida de ejemplo
. A | . .
| C B A .
*/
