package arrays;

public class HaciendoCuentas {
    
}
Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. 

/* 
Haciendo cuentas
Tiempo máximo: 1,000-2,000 s  Memoria máxima: 4096 KiB
Hucha con forma de cerdito, con monedas al lado
Diana es una chica muy organizada y cada Navidad analiza sus cuentas para el año siguiente. Aprovechando las vacaciones escolares, dedica algunos ratos a anotar en un cuaderno los ingresos y gastos que cree que tendrá durante el año que está a punto de empezar (ir al cine, cenar un día con sus amigos, su paga mensual, el dinero que su tío le da,…).

Eso sí, el resultado final en su cuaderno es un poco caótico. Los ingresos y gastos le van viniendo a la cabeza en cualquier orden y como los apunta inmediatamente según los va recordando no quedan anotados por orden cronológico. Es normal entonces que sea difícil tener clara la evolución de sus ahorros y cuánto dinero tendrá disponible en cada momento.

Sabiendo cuánto dinero tendrá al empezar el año, ¿cuánto estima que tendrá al terminar cada mes?

Entrada
Cada caso de prueba comienza con una primera línea con la cantidad de dinero con la que Diana comienza el año y el número de movimientos que ha anotado en su libreta. A continuación, aparecen los movimientos previstos que tiene para todo el año.

Cada movimiento se especifica en una línea que comienza con la fecha en formato DD-MM con el día y mes en el que tendrán lugar (puedes asumir que el año no es bisiesto). Después aparece la cantidad, empezando con un + si es un ingreso o con - si es un gasto. Finalmente aparece el concepto.

Se garantiza que todos los números serán enteros, que los fondos de Diana nunca serán mayores que 109 ni negativos, y que no habrá más de un movimiento diario. El concepto de cada movimiento es una frase con letras mayúsculas y minúsculas del alfabeto inglés, números y espacios de no más de 100 caracteres.

Salida
Por cada caso de prueba se escribirán doce números separados por espacio indicando la cantidad estimada de dinero que tendrá Diana al acabar cada mes del año tras aplicar todos los movimientos.

Entrada de ejemplo
150 17
01-01 +30 Regalo tio
01-02 -10 Cenar con mis amigos
05-02 -12 Ir al cine
02-02 +45 Paga
03-03 -12 Ir al cine
04-04 -45 Invitar a mis amigos
05-05 +45 Paga
06-06 -12 Ir al cine
01-09 -30 De compras
02-10 -10 Comprar un libro
02-11 -12 Ir al cine
12-12 -20 Comprar un libro
11-12 -35 Ropa
01-11 -45 Gimnasio
01-10 +45 Paga
03-02 -12 Ir al cine
01-03 +45 Paga
Salida de ejemplo
 
180 191 224 179 224 212 212 212 182 217 160 105

*/