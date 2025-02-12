package arrays;

import java.util.Scanner;

public class CuantosDiasFaltan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer el número de casos de prueba
        int numCasos = sc.nextInt();

        // Array con los días acumulados al inicio de cada mes en un año no bisiesto
        int[] diasAcumulados = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

        // Procesamos cada caso
        for (int i = 0; i < numCasos; i++) {
            int dia = sc.nextInt(); // Día dado
            int mes = sc.nextInt(); // Mes dado

            // Convertir la fecha en el número de día en el año
            int diaDelAnio = diasAcumulados[mes - 1] + dia;

            // Calcular los días faltantes hasta el 31 de diciembre
            int diasFaltantes = 365 - diaDelAnio;

            // Imprimir el resultado
            System.out.println(diasFaltantes);
        }

        sc.close();
    }
}



/*¿Cuantos días faltan?
Tiempo máximo: 1,000 s  Memoria máxima: 4096 KiB
Dado un día del año, ¿sabrías decir cuantos días faltan para Nochevieja? Asumiremos que nos encontramos en un año no bisiesto.

Entrada
La entrada comenzará con un entero para especificar el número de casos de prueba que vendrá a continuación. Para cada caso de prueba se mostrará una línea en la que aparecerán dos enteros, el primero de ellos será correspondiente al día y el segundo correspondiente al mes de una fecha válida.

Salida
Para cada fecha de la entrada, se mostrarán el número de días completos que faltan hasta el día de Nochevieja.

Entrada de ejemplo
3
28 12
30 12
1 1
Salida de ejemplo
 
3
1
364 */