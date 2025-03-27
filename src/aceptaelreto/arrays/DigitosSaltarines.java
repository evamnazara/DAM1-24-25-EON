package arrays;

public class DigitosSaltarines {
    
}
Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. 

/* 
Dígitos saltarines
Tiempo máximo: 1,000-3,000 s  Memoria máxima: 4096 KiB
Un número tiene sus dígitos saltarines si, empezando por el primero, se puede ir saltando de uno al siguiente tantos puestos como indiquen, y al final se llega de nuevo al principio habiendo pasado por todos ellos. Por ejemplo, el número 2.312 tiene a sus dígitos saltarines. Empezando por el primero, el primer 2, avanzamos dos dígitos y llegamos al 1. Desde él, avanzamos un dígito más, y llegamos al segundo 2. Desde él, avanzamos otros dos dígitos (dando la vuelta y empezando de nuevo por la izquierda), y llegamos al 3. Y desde éste, avanzamos tres veces, y llegamos otra vez al principio.

Ejemplo de análisis de un número con los dígitos saltarines
Los números con dígitos saltarines son una rareza de la naturaleza y son difíciles de encontrar.

Entrada
El programa deberá leer un primer número n indicando cuántos casos de prueba deberá procesar. A continuación vendrán n líneas, cada una con un número 0 < i < 109.

Ningún número tendrá ceros superfluos a la izquierda.

Salida
Para cada caso de prueba, el programa escribirá "SALTARINES" si el número tiene a sus dígitos saltarines, y "NORMALES" en otro caso.

Entrada de ejemplo
4
2312
3
12
30
Salida de ejemplo
 
SALTARINES
SALTARINES
NORMALES
NORMALES

*/