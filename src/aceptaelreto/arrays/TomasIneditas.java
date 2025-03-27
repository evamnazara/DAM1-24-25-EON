package arrays;

public class TomasIneditas {
    
}

Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario.

/* 

Tomas inéditas
Tiempo máximo: 1,000 s  Memoria máxima: 4096 KiB
Panel de ayuda a la navegación en La Guerra de las Galaxias. Fotograma de la película original.
Se está preparando una nueva versión, totalmente remasterizada, de "Star Wars: Episodio IV", con nuevas tomas inéditas. Como todo el material de la película original ha sido ya publicado y republicado, la única forma de saciar la sed de los fans es crear contenido nuevo, manteniendo el estilo original. Para la nueva reedición, se ha decidido añadir alguna toma adicional del interior de las naves durante la gran batalla final.

En particular, se va a enseñar el monitor del panel de apoyo a la navegación que mostraba gráficas temporales sobre alguna característica de la nave como la altura o velocidad. Como el estilo visual de los paneles de control de la película era, por ser finos, "vintage", se quieren generar esas gráficas usando sólo caracteres alfanuméricos para imitar el aspecto. Se usarán únicamente los caracteres "/", "\" y "_" (guión bajo) en función de si la gráfica sube, baja o se mantiene constante en un determinado punto.

Como amante de la "saga galáctica" has decidido crear (¡y donar!) el software para que las nuevas tomas vean la luz. Te darán los movimientos de la gráfica en cada paso, y la pintarás con los caracteres anteriores, enmarcándola, además, entre "#" para simular el monitor CRT.

Entrada
Cada caso de prueba es una cadena de entre 1 y 100 letras, indicando la evolución de la gráfica. Una "I" indica que la gráfica se mantiene igual que en el paso previo ("_"), una "S" indica que sube una línea hacia arriba ("/") y una "B" indica que baja una posición "\". Se debe considerar que la "altura" inicial en la gráfica es 0 y a partir de ahí se mueve en función de lo indicado. Se garantiza que el valor nunca descenderá de ese mismo 0 y que no habrá letras distintas a las descritas.

Salida
Por cada caso de prueba se dibujará el panel de ayuda utilizando los caracteres alfanumericos descritos. La gráfica se enmarcará en un cuadro formado por el carácter "#". El interior del marco tendrá tantas columnas como letras la entrada, y las filas necesarias para incluir exactamente la gráfica.

Entrada de ejemplo
IISSBSIIIII
SIISBIB
Salida de ejemplo
#############
#      _____#
#   /\/     #
#__/        #
#############
#########
# __/\_ #
#/     \#
#########

*/

