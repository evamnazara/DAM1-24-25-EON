/* Escribe un programa que solicite al usuario un número comprendido entre 1 y 99. El programa
debe mostrarlo con letras, por ejemplo, para 56, se verá "cincuenta y seis". */

package ud2.ejercicioscondicionales;

import java.util.Scanner;

public class EP0214_NumerosALetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MIN = 1;
        final int MAX = 99;

        int numero; 

        do {
            System.out.println("Introduzca un número del 1 al 99: ");
            numero = sc.nextInt();
        } while(numero < MIN || numero > MAX);

        sc.close();
    }
}
