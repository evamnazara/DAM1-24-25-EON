/*EP0217. Realiza el “juego de la suma”, que consiste en que aparezcan dos números
aleatorios (comprendidos entre 1 y 99) que el usuario tiene que sumar. La aplicación debe
indicar si el resultado de la operación es correcto o incorrecto. */
package ud2.ejercicioscondicionales;

import java.util.Scanner;
import java.math.*;
public class EP0217_juegoSuma {
    public static void main(String[] args) {
       //generacion de numero entero 1 a 99 
       int MAX = 99;
       int MIN = 1;

       Math.random();
       double num1 = Math.random() * MAX;
       int num2 = (int)(Math.random())* (MAX - MIN + 1) + MIN;

       for (int i = 0; i < 1000 ; i++ ) {
            //if (num > MAX)
            //System.out.println("Numero demasiado alto: ");
       }

    }
    
}
