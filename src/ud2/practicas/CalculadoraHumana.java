
package ud2.practicas;

import java.util.Random;
import java.util.Scanner;

public class CalculadoraHumana {

    private static final int NUM_OPERACIONES = 7;
    private static final int MAX_FALLOS_PERMITIDOS = 5;
    private static final int MAX_VALOR = 200;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aciertos = 0;
        int fallos = 0;


        Random random = new Random();
        int op1 = generarNumRandom(random);


        System.out.println("CALCULADORA HUMANA:");

       
        if (aciertos == NUM_OPERACIONES) {
            System.out.println("¡HAS GANADO EL JUEGO! Vuelve a intentarlo cuando quieras.");
        } else {
            System.out.println("¡Oh no! Has superado los 5 fallos permitidos.");
            System.out.println("Vuelve a intentarlo cuando quieras.");
        }


        while (aciertos < NUM_OPERACIONES && fallos < MAX_FALLOS_PERMITIDOS) {
            char operador = generarOpRandom(random);
            int op2 = generarOp2(operador, op1, random);

            if (op2 == -1) continue;

            System.out.printf("Operación: %d %c %d = ?%n", op1, operador, op2);
            int resultadoCorrecto = calcularResultado(operador, op1, op2);

            int respuestaUsuario = sc.nextInt();
            System.out.println("Tu respuesta es: " + respuestaUsuario);

            if (respuestaUsuario == resultadoCorrecto) {
                System.out.println("¡Correcto!");
                aciertos++;
                op1 = resultadoCorrecto; 
            } else {
                System.out.println("¡Has fallado");
                System.out.printf("Respuesta:" + resultadoCorrecto);

                fallos++;
            }

            System.out.printf("Aciertos: " + aciertos);
            System.out.printf("Fallos:" + fallos);

        }

        sc.close();
    }

    public static int generarNumRandom(Random random) {
        return random.nextInt(MAX_VALOR) + 1;
    }

    public static char generarOpRandom(Random random) {
        char[] operadores = 
        { '+', '-', '*', '/' };
        
        return operadores[random.nextInt(operadores.length)];
    }

    public static int generarOp2(char operador, int op1, Random random) {
        
        switch (operador) {
            case '+':
                return generarNumRandom(random);
            case '-':
                return random.nextInt(op1 + 1);
            case '*':
                return generarNumRandom(random);
            case '/':
                return op2Division(op1, random);
            default:
                return -1;
        }
    }

    public static int op2Division(int operando1, Random random) {
        if (operando1 <= 1) return -1;

        for (int i = 2; i <= operando1; i++) {
            if (operando1 % i == 0) {
                return i;
            }
        }

        return -1; 
    }

    public static int calcularResultado(char operador, int op1, int op2) {
        if (operador == '+') return op1 + op2;
        if (operador == '-') return op1 - op2;
        if (operador == '*') return op1 * op2;
        if (operador == '/') return op1 / op2;

        throw new IllegalArgumentException("Operador desconocido: " + operador); 
    }

}