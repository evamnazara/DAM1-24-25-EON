package arrays;

public class Conjuritis {
    
}
Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario.

/* 
Conjuritis
Tiempo máximo: 2,000 s  Memoria máxima: 4096 KiB
Hechicero invocando un conjuro
El Doctor Extraño es un poderoso hechicero entrenado por El Anciano, y sucesor del título de "Hechicero supremo" a su muerte. A pesar de ser un superhéroe muy poderoso, ahora está en un apuro.

El Barón Mordo ha sometido al Doctor Extraño a un hechizo llamado "conjuritis" que le impide pensar en conjuros con claridad y en su mente se mezclan conjuros reales y conjuros falsos.

Tras invocar una sucesión de conjuros, el Doctor Extraño está convencido de que dos le han fallado. Sabe cuánto daño inflinge, a priori, cada uno de sus conjuros, y sabe cuánto daño real ha causado en total en el villano destino de sus hechizos. Ahora necesita saber qué dos han fallado por estar siendo afectados por su conjuritis para no usarlos otra vez.

Entrada
El programa deberá procesar, de la entrada estándar, múltiples casos de prueba.

Cada caso de prueba comienza con un número 3 ≤ N ≤ 200.000 que indica la cantidad de hechizos invocados. A continuación sigue una línea con N números con el daño que, a priori, inflinge cada uno. La lista está ordenada de menor a mayor, y no hay dos hechizos iguales. El hechizo menos poderoso posible sólo tiene poder 1, y el más fuerte alcanza 500.000.

Por útlimo, aparece una tercera línea indicando el daño total causado sobre el villano que ha recibido todos los hechizos.

La entrada termina con un caso sin hechizos, que no deberá procesarse.

Salida
Por cada caso de prueba, el programa escribirá, en la salida estándar, el poder a priori de los dos hechizos que no han funcionado, de menor a mayor. Se garantiza que habrá solución y que será única.

Entrada de ejemplo
3
1 2 3
3
4
1 3 5 9
10
5
1 3 5 6 7
18
0
Salida de ejemplo
1 2
3 5
1 3

*/
