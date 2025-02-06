/* Escribe un programa que solicite al usuario un número comprendido entre 1 y 99. El programa
debe mostrarlo con letras, por ejemplo, para 56, se verá "cincuenta y seis". */

package ejercicioscondicionales;

import java.util.Scanner;

public class EP0214 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MIN = 1;
        final int MAX = 99;

        int numero; 

        do{
        System.out.println("Introduzca un número del 1 al 99: ");
        numero = scanner.nextInt();
        }while(numero < MIN || numero > MAX);

        scanner.close();
    }
}sdfsdfsdfsdfsd
