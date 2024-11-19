/* El veterano concurso de La2 “Saber y Ganar” incluye un juego denominado la “Calculadora
Humana” en la que el concursante debe resolver operaciones matemáticas encadenadas en
un tiempo límite.
Las operaciones se realizan con números enteros e incluyen la suma, resta, división y
multiplicación de números elegidos aleatoriamente.
El juego comienza presentando al usuario una primera operación (a elegir aleatoriamente) entre
dos números enteros (también aleatorios) y solicitando que escriba el resultado por teclado.
Si el usuario escribe un resultado incorrecto se le solicitará que introduzca un nuevo valor por
teclado.
Si el usuario acierta, se presentará una nueva operación (la segunda) en la que el primer
operando será el resultado de la primera, mientras que el operador y el segundo operando serán
elegidos aleatoriamente.
Resuelta la segunda operación se presentará la tercera, luego la cuarta y así sucesivamente.
El juego termina cuando el jugador resuelve 7 operaciones correctamente, independientemente
del número de fallos que haya cometido.
En el programa de TV, el juego termina también cuando expira un temporizador deﬁnido
previamente (por ejemplo 59 segundos). Alternativamente a la implementación del temporizador
se puede establecer el ﬁn del juego cuando el jugador supera un número máximo de fallos
permitido.
Implementa el programa del juego con las siguentes especiﬁcaciones adicionales:
1. El número de operaciones, el número de segundos y el número de fallos permitidos se
deﬁnirán como constantes al inicio del programa para facilitar adaptar el juego y su
diﬁcultad.
2. Tanto los operandos como los resultados de las operaciones planteadas por el juego
estarán limitados a un valor máximo (por ejemplo 200). Es decir, si se le plantea al
usuario una multiplicación, el resultado no deberá superar este límite, por lo que habrá
que tenerlo en cuenta a la hora de generar los datos aleatorios. Se recomienda deﬁnir
también este valor como una constante.
3. En el caso de las divisiones, el programa deberá asegurar que el resultado es un número
entero.
Recomendaciones:
1. Divide el problema complejo en problemas más sencillos hasta que sean fáciles de ver y/o
implementar. Ejemplos:
a. La siguiente función devolverá el valor del segundo operando si el operador elegido
es una división, o -1 si no es posible generarlo (porque el operando1 es primo o
demasiado pequeño, por ejemplo)
static int obtenerOperando2Division(int operando1);
b. Puedes implementar funciones que intenten generar el segundo operando para las
otras operaciones posibles:static int obtenerOperando2Suma(int operando1);
static int obtenerOperando2Resta(int operando1);
static int obtenerOperando2Multiplicacion(int operando1);
c. etc. */

package ud2.practicas;

import java.math.*;
import java.util.*;


public class CalculadoraHumana {

    public static void main(String[] args) {
        System.out.println("JUEGO CALCULADORA HUMANA: ");

        int n1 = (int)Math.random();
        int n2 = (int)Math.random();

        int suma = n1 + n2;
        int resta = n1 - n2;
        int multiplicacion = n1 * n2;
        int division = n1 / n2;

        //int operacion = (suma,resta,multiplicacion,division);

        //for(){}

    }
    
}
