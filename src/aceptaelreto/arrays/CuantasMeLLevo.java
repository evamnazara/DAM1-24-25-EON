package arrays;

import java.util.Scanner;

public class CuantasMeLLevo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("¿cuántas me llevo? ");
            System.out.println("Número 1:");
            String num1 = sc.nextLine();
            System.out.println("Número 2: ");
            String num2 = sc.nextLine();

            // "0 0" termina la ejecución
            if (num1.equals("0") && num2.equals("0")) {
                break;
            }

            // num1 y num2 tienen la misma longitud (rellenamos con ceros a la izquierda si es necesario)
            int longitudMaxima = Math.max(num1.length(), num2.length());
            while (num1.length() < longitudMaxima) {
                num1 = "0" + num1;  // añade ceros a la izquierda de num1 si es necesario
            }
            while (num2.length() < longitudMaxima) {
                num2 = "0" + num2;  // añade ceros a la izquierda de num2 si es necesario
            }

            // Contador de acarreos
            int acarreos = 0;
            int acarreo = 0;  // Acarreo inicial es 0

            // Sumar de derecha a izquierda
            for (int i = longitudMaxima - 1; i >= 0; i--) {
                // Obtener los dígitos en la posición i
                int digito1 = num1.charAt(i) - '0';  // Convertir el carácter en dígito
                int digito2 = num2.charAt(i) - '0';  // Convertir el carácter en dígito

                // Sumar los dígitos y el acarreo de la posición anterior
                int suma = digito1 + digito2 + acarreo;

                // Si la suma es 10 o más, hay acarreo
                if (suma >= 10) {
                    acarreos++;
                    acarreo = 1;  // El acarreo se "lleva una" al siguiente dígito
                } else {
                    acarreo = 0;  // Si no hay acarreo, no se lleva nada
                }
            }

            System.out.println("Te llevas " + acarreos);
        }

        sc.close(); 
    }
}



/*
 * ¿Cuántas me llevo?
Tiempo máximo: 2,000 s  Memoria máxima: 4096 KiB
Cuando aprendemos a sumar números pronto nos cuentan aquello de "llevarse una": cuando los dos dígitos que sumamos llegan a la decena tenemos "acarreo" que debemos sumar a los siguientes dígitos (de la izquierda).

Cuando nuestros maestros nos ponían ejercicios, antes tenían que contar cuántas veces tendríamos que "llevarnos una" y en base a eso medían la dificultad del ejercicio.

¿Puedes hacer un programa que automatice esa tarea?

Entrada
La entrada estará compuesta de numerosos casos de prueba, cada uno de ellos en una línea. En cada línea apareceran dos números positivos separados por un espacio. Se garantiza que los números no tendrán más de 1000 dígitos.

Los casos de prueba terminan con el caso especial 0 0, que no provocará salida.

Salida
Para cada caso de prueba hay que escribir en una línea el número de veces que hay "acarreo" en la suma.

Entrada de ejemplo
123 456
555 555
123 594
0 0
Salida de ejemplo
 
0
3
1
 */