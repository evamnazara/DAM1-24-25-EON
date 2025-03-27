package arrays;

public class CuentasParalelas {
    
}

Para este programa de Arrays en java, resuelve el problema con variables legibles y funciones sencillas. Añade comentarios con los pasos que sigues, NO utilices parseo de ningun tipo, ni funciones como ArrayList, StringBuilder, , Map... sólo Strings y Arrays simples y tipos primitivos. Añade souts donde sea necesario para darle sentido al programa y hacerlo amigables con el usuario.

/* 
Cuentas paralelas
Tiempo máximo: 1,000-3,000 s  Memoria máxima: 8192 KiB
Tras terminar sus estudios hace un par de meses, Consuelo se abrió una cuenta bancaria para empezar a recibir ahí el sueldo de su primer trabajo remunerado. Desde entonces la cuenta ha tenido unos pocos movimientos. En concreto, la ingresaron 1000 euros del primer sueldo con los que pagó una cena en la que invitó a sus padres (150 euros), una compra en un conocido supermercado (80 euros) y una reserva de una casa rural para el siguiente puente (200). El mes terminó y la volvieron a pagar (1040 euros, un poco más que el mes anterior) y ayer mismo se gastó otros 70 euros en el supermercado.

Hoy revisándolos se ha dado cuenta de que si tras pagar los primeros 80 euros en el supermercado se hubiera creado una segunda cuenta y hubiera dejado congelada la primera, ambas tendrían exactamente el mismo saldo:

1000−150−80suma=770−2001040−70suma=770
Le ha resultado tan curioso que le gustaría poder seguir averiguando si los movimientos de su cuenta y las de sus amigos tienen estos puntos de singularidad también o no.

Entrada
La entrada estará compuesta por distintos casos de prueba, cada uno ocupando dos líneas.

La primera línea de cada caso de prueba contiene un número que indica la cantidad de movimientos de una de las cuentas analizadas por Consuelo (nunca será mayor que 100.000). En la segunda línea aparece un número entero por cada movimiento de la cuenta. Cada cantidad no superará el 1.000.000 en valor absoluto. Se garantiza, además, que la suma de los valores absolutos de todos los movimientos no superará 2×109.

La entrada termina con una línea conteniendo un 0.

Salida
Para cada caso de prueba se escribirá un número indicando la cantidad de instantes de tiempo en los que el dueño de la cuenta bancaria podría haber creado una segunda cuenta de forma que ambas tuvieran el mismo saldo final.

Entrada de ejemplo
6
1000 -150 -80 -200 1040 -70
2
100 -100
0
Salida de ejemplo
1
2

*/
