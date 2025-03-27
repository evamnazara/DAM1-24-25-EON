package arrays;

public class EligiendoCaramelos {
    
}
Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario.

/* 
Eligiendo caramelos
Tiempo máximo: 2,000-3,000 s  Memoria máxima: 4096 KiB
Nicolás la Fuente era un niño tartamudo que adoraba los caramelos. Era de familia humilde, así que cuando conseguía poder comprar unas pocas golosinas tardaba mucho en decidir cuáles elegir. Y como no sabía si podría volver a esa tienda, nunca compraba dos caramelos del mismo tipo, para probar de más sabores.

Un día encontró una tienda regentada por un dependiente guasón llamado Cardano, amante de las matemáticas. Cardano retó a Nicolás a decirle cuántas posibilidades tenía de elegir 2 caramelos de entre los 9 disponibles; si le contestaba bien, le regalaría 2 caramelos y le tocaría decidir cuáles cogía. Nicolás era muy rápido haciendo cálculos, pero su tartamudez le impidió decir a tiempo "36". Estaba convencido de que si lo hubiera llevado escrito le habría sido mucho más fácil.

Dispuesto a pedirle la revancha al día siguiente, se fue a casa y construyó una tabla con todas las posibles respuestas para el tendero. Si en la tienda había 9 caramelos, en la tabla Nicolás tenía una fila con la respuesta a contestar si le preguntaba por el número de formas de coger cero caramelos, un caramelo, dos caramelos, etcétera. ¿Serías capaz de hacer lo mismo?

Entrada
La entrada estará compuesta por distintos casos de prueba terminados con una línea con dos ceros, que no debe procesarse.

Cada caso de prueba tiene dos números, el número de tipos de caramelos distintos de la tienda (n > 0) y el número máximo de caramelos que, asume Nicolás, estará Cardano dispuesto a regalarle (m ≤ n). En la tienda nunca habrá más de 5.000 tipos de caramelos.

Salida
Para cada caso de prueba se escribirá una línea con las respuestas que tendría que dar Nicolás para cada una de las posibles preguntas de Cardano. Como cada número individual puede llegar a ser muy grande, se escribirá para cada uno el resto resultante tras dividirlo entre 1.000.000.007.

Entrada de ejemplo
4 2
4 3
4 4
9 2
0 0
Salida de ejemplo
 
1 4 6
1 4 6 4
1 4 6 4 1
1 9 36

*/