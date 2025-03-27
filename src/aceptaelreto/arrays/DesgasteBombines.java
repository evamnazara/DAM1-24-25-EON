package arrays;

public class DesgasteBombines {
    
}
Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario.

/* 
El desgaste de los bombines
Tiempo máximo: 2,000-3,000 s  Memoria máxima: 8192 KiB
El bombín de una cerradura
Todas las urbanizaciones cerradas con un gran número de vecinos experimentan el mismo problema con las cerraduras: al ser tanta gente entrando y saliendo diariamente, las cerraduras se resienten y terminan funcionando mal.

Cuando en una puerta concreta se utiliza más uno de los dos lados de la cerradura, una solución que aplica habitualmente el personal de mantenimiento es dar la vuelta al bombín para que el desgaste de ambos lados se equilibre y, al menos, ambos lados funcionen más o menos igual.

Lamentablemente con la crisis el personal de mantenimiento de nuestra urbanización se ha tenido que eliminar por completo y sólo tenemos presupuesto para llamar al cerrajero una vez. Tenemos una previsión del número de veces que entrará y saldrá la gente por la puerta a lo largo de un periodo de tiempo y tenemos que decidir qué día queremos que venga el cerrajero a dar la vuelta al bombín para que al final del periodo el desgaste de ambos lados sea lo más parecido posible.

Entrada
La entrada estará compuesta por distintos casos de prueba que representan la estimación de uso de una puerta en un periodo de tiempo.

Cada caso de prueba consiste en dos líneas. La primera indica el número de días del periodo (1 ≤ n ≤ 1.000.000). La segunda línea contiene n números, cada uno de ellos indicando el desgaste del bombín; un número positivo v debe interpretarse como que el lado de fuera de la puerta se ha utilizado v veces más que el de dentro durante ese día. Un número negativo indica lo contrario. Se garantiza que el valor absoluto de v no superará 1.000.000 y que la suma de los valores absolutos de todos los números será menor o igual a 109.

La entrada termina con una línea con un 0.

Salida
Por cada caso de prueba se indicará al final de qué día querremos que venga el cerrajero para que dé la vuelta al bombín, de forma que al final del periodo de n días el desgaste de ambos lados de la cerradura sea lo más parecido posible. El primer día de la secuencia se corresponde con el número 1.

Si no es necesario que venga ningún cerrajero, se escribirá un 0. Si hay varios días posibles, preferiremos que venga cuanto antes, por si sube sus honorarios.

Entrada de ejemplo
4
1 2 2 1
4
1 2 2 0
4
1 2 -2 -1
4
6 1 -1 5
3
-4 -5 5
0
Salida de ejemplo
2
2
0
1
0

*/
