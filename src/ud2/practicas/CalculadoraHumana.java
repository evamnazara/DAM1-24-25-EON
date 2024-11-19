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

import java.util.Random;
import java.util.Scanner;

public class CalculadoraHumana {

    // Constantes del juego
    private static final int NUMERO_OPERACIONES = 7;
    private static final int MAX_FALLOS_PERMITIDOS = 5;
    private static final int VALOR_MAXIMO = 200;

    public static void main(String[] args) {
        System.out.println("=== JUEGO: CALCULADORA HUMANA ===");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int aciertos = 0;
        int fallos = 0;
        int operando1 = generarNumeroAleatorio(random);

        while (aciertos < NUMERO_OPERACIONES && fallos < MAX_FALLOS_PERMITIDOS) {
            // Generar operación aleatoria
            char operador = generarOperadorAleatorio(random);
            int operando2 = generarOperando2(operador, operando1, random);

            // Asegurarnos que la operación es válida
            if (operando2 == -1) continue;

            // Mostrar operación y pedir respuesta
            System.out.printf("Operación: %d %c %d = ?%n", operando1, operador, operando2);
            int resultadoCorrecto = calcularResultado(operador, operando1, operando2);
            int respuestaUsuario = solicitarEntero(scanner, "Tu respuesta: ");

            // Verificar la respuesta
            if (respuestaUsuario == resultadoCorrecto) {
                System.out.println("¡Correcto!");
                aciertos++;
                operando1 = resultadoCorrecto; // El resultado se convierte en el nuevo operando1
            } else {
                System.out.printf("Incorrecto. La respuesta correcta era: %d%n", resultadoCorrecto);
                fallos++;
            }

            System.out.printf("Aciertos: %d | Fallos: %d%n%n", aciertos, fallos);
        }

        // Mensaje final
        if (aciertos == NUMERO_OPERACIONES) {
            System.out.println("¡Felicidades! Has resuelto todas las operaciones correctamente.");
        } else {
            System.out.println("Has alcanzado el límite de fallos. ¡Suerte la próxima vez!");
        }

        scanner.close();
    }

    // Genera un número aleatorio entre 1 y VALOR_MAXIMO
    private static int generarNumeroAleatorio(Random random) {
        return random.nextInt(VALOR_MAXIMO) + 1;
    }

    // Genera un operador aleatorio (+, -, *, /)
    private static char generarOperadorAleatorio(Random random) {
        char[] operadores = {'+', '-', '*', '/'};
        return operadores[random.nextInt(operadores.length)];
    }

    // Genera el segundo operando asegurando que la operación es válida
    private static int generarOperando2(char operador, int operando1, Random random) {
        switch (operador) {
            case '+':
                return generarNumeroAleatorio(random);
            case '-':
                return random.nextInt(operando1 + 1); // Garantiza que operando2 <= operando1
            case '*':
                return generarNumeroAleatorio(random);
            case '/':
                return obtenerOperando2Division(operando1, random);
            default:
                return -1;
        }
    }

    // Asegura que el segundo operando para una división produce un entero
    private static int obtenerOperando2Division(int operando1, Random random) {
        if (operando1 <= 1) return -1; // No es posible dividir un número <= 1

        for (int i = 2; i <= operando1; i++) {
            if (operando1 % i == 0) {
                return i; // Devuelve un divisor válido
            }
        }

        return -1; // Si no hay divisores (número primo)
    }

    // Calcula el resultado de una operación
    private static int calcularResultado(char operador, int operando1, int operando2) {
        switch (operador) {
            case '+':
                return operando1 + operando2;
            case '-':
                return operando1 - operando2;
            case '*':
                return operando1 * operando2;
            case '/':
                return operando1 / operando2;
            default:
                throw new IllegalArgumentException("Operador desconocido: " + operador);
        }
    }

    // Solicita un número entero al usuario con validación
    private static int solicitarEntero(Scanner scanner, String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, introduce un número entero.");
            }
        }
    }
}