package arrays;

public class RestaurandoPeliculas {
    
}

Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. 

/* 
Restaurando películas
Tiempo máximo: 1,000-3,000 s  Memoria máxima: 16384 KiB
Celuloide de película antigua
En el mundo de la digitalización en el que vivimos, con las plataformas digitales ofreciéndonos toneladas de películas, la mayoría de nosotros somos ajenos al peligro en el que están las películas antiguas. Por poner un ejemplo, el 75% del cine mudo de Estados Unidos se ha destruido. Y es que el celuloide donde se plasmaban los fotogramas está hecho de nitrato de celulosa, muy inflamable y químicamente inestable lo que hace que con los años se degrade.

En la primera etapa de la descomposición de la película, esta comienza a decolorarse. Posteriormente la imagen comienza a borrarse del soporte al descomponerse la emulsión de nitrato. En la tercera etapa el nitrato comienza a burbujear y en la última el celuloide se cristaliza en un rollo donde termina adquiriendo un color marrón, momento en el cual se da por perdida por completo la película. A la volatilidad del celulide hay que añadir problemas inherentes al almacenaje y visualización como las motas de polvo que pueden depositarse en la película durante las proyecciones.

Afortunadamente, sitios como el George Eastman Museum tratan de restaurar las películas, digitalizándolas fotograma a fotograma y utilizando software de tratamiento de imágenes para eliminar esas manchas y pérdidas de color. El proceso, muy tedioso, tiene una primera parte física en la que se analiza la película para comprobar por ejemplo si las bandas laterales están deterioradas (y se sustituyen por nuevas si es necesario) y si las posibles uniones de distintos fragmentos siguen intactas. Una vez que se aseguran de que el celuloide no tendrá problemas al pasar por el scanner, comienza el proceso de digitalización tras el que se procederá a retocar las imágenes ajustando brillo, contraste, eliminando suciedad, etc.

A veces el celuloide está tan deteriorado que se han echado a perder largos fragmentos de la película. Incluso se ha podido extraviar alguna "lata" entera, perdiéndose con ella un rollo completo de celuloide. En esos casos la única alternativa es contactar con otros museos y colecciones para encontrar otras copias y entre todas intentar reconstruir la película completa.

Entrada
La entrada está formada por un número variable de casos de prueba, cada uno ocupando varias líneas. La primera línea contiene dos números: el número total de fotogramas de la película a restaurar (hasta 109) y el número de copias recopiladas de entre todos los museos, archivos y colecciones del mundo (al menos una y como mucho 100).

Por cada copia aparecerá una línea que comienza con el número de secuencias de fotogramas aprovechables, seguido de la descripción de cada una de esas secuencias: dos números separados por una coma con el fotograma inicial y el final del fragmento (números entre 1 y el total de fotogramas de la película). Los fragmentos se dan en orden creciente y nunca se solapan (al fin y al cabo vienen de la misma copia) aunque entre dos fragmentos podría no haber ningún fotograma perdido (por ejemplo si pertenecen a "latas" distintas). Cada copia tendrá al menos un fragmento utilizable y el número de fragmentos total entre todas ellas nunca será mayor que 100.000.

Después del último caso de prueba viene una línea con dos ceros.

Salida
Por cada caso de prueba aparecerá una única línea indicando si será posible reconstruir la película completa. Si es posible se escribirá SI y en caso contrario NO.

Entrada de ejemplo
50 1
1 1,50
50 1
2 1,30 35,50
50 2
2 1,30 35,50
1 31,34
50 2
2 1,30 35,50
1 32,34
0 0
Salida de ejemplo
 
SI
NO
SI
NO

*/