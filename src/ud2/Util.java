package ud2;

import java.util.*;

public class Util {
    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    static boolean esBisiesto(int anho) {
        return anho % 400 == 0 || (anho % 4 == 0 && anho % 100 != 0);
    }

    static int mayor(int a, int b) {
        return a > b ? a : b;
        /*
         * int mayor = a;
         * if (b > a)
         * mayor = b;
         * return mayor;
         */

    }

    static String notaEnTexto(int nota) {
        String notaEnTexto = "";
        switch (nota) {
            case 0, 1, 2, 3, 4:
                notaEnTexto = "insuficiente";
                break;
            case 5:
                notaEnTexto = "suficiente";
                break;
            case 6:
                notaEnTexto = "bien";
                break;
            case 7, 8:
                notaEnTexto = "notable";
                break;
            case 9, 10:
                notaEnTexto = "sobresaliente";
                break;

            default:
                break;
        }
        return notaEnTexto;
    }

    // con double e int
    static String notaEnTexto(double nota) {

        // valor alt a cadena vacía: null
        String notaEnTexto = ""; // java admite que el identificador sea el mismo

        // si la nota es <0 devuelve la cadena vacia por defecto
        // if (nota < 0 || nota > 10)
        // return "";

        if (nota >= 0 && nota < 5) {
            notaEnTexto = "insuficiente";
        } else if (nota >= 5 && nota < 6) {
            notaEnTexto = "Suficiente";
        } else if (nota >= 6 && nota < 7) {
            notaEnTexto = "Bien";
        } else if (nota >= 7 && nota < 9) {
            notaEnTexto = "Notable";
        } else if (nota >= 9 && nota <= 10) {
            notaEnTexto = "Sobresaliente";
        }

        return notaEnTexto;
    }

    /*
     * static double casiCero (double num) {
     * if ( num != 0 && num > -1 && num < 1) {
     * return double ;
     * } else {
     * 
     * }
     * }
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * System.out.println("Introduce el número: ");
         * 
         * int n = sc.nextInt();
         * sc.close();
         * 
         * if (esPar(n))
         * System.out.println("Es par.");
         * else
         * System.out.println("Es impar.");
         * /*
         * Prueba con años bisiestos:
         * if (esPar(n))
         * System.out.println("Es bisiesto.");
         * else
         * System.out.println("No es bisiesto.");
         */

        // System.out.println(mayor(4,9));

        // double notaDouble = 6.7;
        // int notaInt = 5;
        double nota;
        System.out.println("Nota: ");
        nota = sc.nextDouble();
        System.out.println(notaEnTexto(nota));
        // System.out.println(notaEnTexto(notaDouble));
        sc.close();
    }
}
