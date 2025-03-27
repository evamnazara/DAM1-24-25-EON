package arrays;

public class RepartidorFrigorifico {
    
}
Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. 

/* 
Repartidor de frigoríficos
Tiempo máximo: 1,000-4,000 s  Memoria máxima: 16384 KiB
Ejemplo de repartos
Un repartidor de frigoríficos debe decidir en qué cruce de calles situar su local, de modo que la distancia total de todos los trasportes sea mínima. El repartidor trabaja en la ciudad de Novapolis donde todas las calles son en cuadrícula. Las distancias más cortas entre dos puntos se deben por tanto calcular siguiendo las calles y no como la distancia euclídea. La dificultad añadida es que en la furgoneta del repartidor solo cabe un frigorífico por lo que después de cada reparto debe volver al local a cargar el siguiente.

Por poner un ejemplo, en una cuadrícula de 3×3 en el que los lugares de reparto están en las posiciones (1, 1), (1, 3) y (3, 1), la mejor localización para el local del repartidor será el punto (1, 1).

Entrada
La entrada está formada por distintos casos de prueba. Cada caso de prueba consiste en varias líneas donde la primera línea son tres números enteros: C, el número de calles en dirección vertical, F, el número de calles en dirección horizontal y N, el número de frigoríficos a repartir. A continuación aparecen N líneas con dos números enteros cada una que indican la posición (x, y) de cada sitio de reparto. Se satisface que 1 ≤ x ≤ C, 1 ≤ y ≤ F, 1 ≤ F, C ≤ 10.000 y 1 ≤ N ≤ 50.000. Además, no hay posiciones repetidas.

El final de la entrada se indica con una línea con tres ceros que no se debe procesar.

Salida
Para cada caso de prueba, se escribirán en una línea las coordenadas (x, y) de la posición óptima del local del repartidor. En caso de existir varias posiciones óptimas, se escribirán las coordenadas de aquella tal que la suma x+y sea mínima. Si aún así hubiera varias opciones, se debe considerar la posición con menor x.

Entrada de ejemplo
3 3 3
1 1
1 3
3 1
3 3 3
1 2
2 3
3 1
0 0 0
Salida de ejemplo
1 1
2 2

*/
