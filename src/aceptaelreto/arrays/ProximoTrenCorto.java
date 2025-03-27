package arrays;

public class ProximoTrenCorto {
    
}
Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. 

/* 
Próximo tren corto
Tiempo máximo: 2,000-3,000 s  Memoria máxima: 16384 KiB
Tren de cercanías entrando en una estación. Imagen CC-BY-2.0 de Ricardo Ricote Rodríguez
Aunque el jefe de la estación de Cercanías pone en todos los carteles luminosos y anuncia por megafonía que el próximo tren en llegar a la estación será corto, los pasajeros insisten en distribuirse a lo largo de todo el andén. Cuando llega el tren, son comunes las carreras de aquellos que se han colocado mal y no faltan los tropezones y accidentes. Una vez la maleta de un pasajero voló por los aires ¡y toda su ropa terminó esparcida por las vías!

Salvador D. Pasa Jeros, un conductor de cercanías con buen corazón, quiere parar el tren de modo que se minimice la suma total recorrida por los usuarios mal colocados. Para eso cuenta con las cámaras del andén de la próxima estación, con las que consigue saber cuánta gente hay en cada punto.

Entrada
Cada caso de prueba comienza con dos números, 1 ≤ T ≤ E ≤ 200.000 indicando, respectivamente, la longitud del tren y del andén.

A continuación aparecen, en otra línea, E números (entre 1 y 1.000) indicando cuántos pasajeros hay en cada posición.

La entrada termina con dos ceros.

Salida
Por cada caso de prueba el programa escribirá la menor longitud total acumulada que tendrán que recorrer los pasajeros en el andén, asumiendo que el tren para en el mejor sitio posible.

Si un pasajero está situado en una zona del andén en la que para el tren, se asume que no deberá desplazarse hasta llegar a una puerta.

Entrada de ejemplo
2 4
1 1 1 1
2 5
1 1 1 1 1
3 6
10 5 0 0 10 10
0 0
Salida de ejemplo
 
2
4
35

*/
