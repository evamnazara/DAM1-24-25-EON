/*EP0415. Diseña una función a la que se le pasan las horas y minutos de dos instantes de
tiempo, con el siguiente prototipo:
static int diferenciaMin (int hora1, int minuto1, int hora2, int minuto2)La función devolverá la cantidad de minutos que existen de diferencia entre los dos
instantes utilizados. */

package ud2.exercicios.eon202411.ejerciciosfunciones;

import java.util.Scanner;

public class EP0415_MinsDiferencia {

    public static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {
        int minutosTotales1 = (hora1 * 60) + minuto1;
        int minutosTotales2 = (hora2 * 60) + minuto2;

        return Math.abs(minutosTotales1 - minutosTotales2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int hora1;
        int minuto1;
        int hora2;
        int minuto2;

        System.out.println("Vamos a introducir, por tramos, las horas y minutos.");

        System.out.println("Introduce la primera hora: ");
        hora1 = sc.nextInt();

        System.out.println("Introduce sus minutos: ");
        minuto1 = sc.nextInt();

        System.out.println("Introduce la segunda hora: ");
        hora2 = sc.nextInt();

        System.out.println("Introduce sus minutos: ");
        minuto2 = sc.nextInt();


        sc.close();
        int diferencia = diferenciaMin(hora1, minuto1, hora2, minuto2);
        System.out.println("La diferencia en minutos es: " + diferencia);
    }
}
