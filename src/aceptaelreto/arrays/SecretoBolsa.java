package arrays;

public class SecretoBolsa {
    
}

Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. 

/* 
El secreto de la bolsa
Tiempo máximo: 1,000-2,000 s  Memoria máxima: 4096 KiB
NASDAQ MarketSite TV Studio (CC BY 2.0)
Jonás es un paranoico. Cuando ve los ríos de números con la cotización de la bolsa, cree que es el modo que tienen los gobiernos de enviar información oculta a sus agentes secretos.

Dice que el primer número que se emite en el momento de la apertura es el que hace las veces de suma clave. Una vez identificado, todos los demás números del día se ponen seguidos, formando una gran secuencia. Lo importante de la secuencia es cuántas veces se puede encontrar la suma clave en la suma de dígitos consecutivos.

Dependiendo de cuántas veces esté escondida la suma, los agentes infiltrados sabrán si tienen que mantenerse escondidos o entrar en acción de alguna forma.

Para poder demostrar su teoría, Jonás necesita poder contar rápidamente cuántas veces aparece la suma en las cotizaciones del día. Cuando lo hace a mano, le lleva cosa de una semana averiguarlo, y para cuando lo sabe la información está demasiado obsoleta como para ser útil.

Entrada
La entrada comienza con un primer número indicando cuántos casos de prueba tendrán que procesarse.

Cada caso está compuesto por una única línea, que comienza con un número con la suma clave. A continuación, tras un espacio, vendrá la secuencia de dígitos. La cotización del día puede ser muy larga (para poder esconder mucha información), por lo que la secuencia puede llegar a tener hasta 250.000 dígitos.

Como lo importante de este supuesto sistema de codificación son las sumas, los ceros no aportan nada y son eliminados con antelación. Gracias a esto, la suma clave no será nunca 0, ni aparecerá dicho dígito en la secuencia.

Salida
Por cada caso de prueba el programa escribirá el número escondido en la cotización, es decir, cuántos bloques de dígitos consecutivos de la secuencia suman exactamente la suma clave.

Entrada de ejemplo
3
20 1234
10 91234
3 1214212
Salida de ejemplo
0
2
4

*/
