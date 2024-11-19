/*EP0217. Realiza el “juego de la suma”, que consiste en que aparezcan dos números
aleatorios (comprendidos entre 1 y 99) que el usuario tiene que sumar. La aplicación debe
indicar si el resultado de la operación es correcto o incorrecto. */
package ud2.exercicios.eon202411.ejercicioscondicionales;

import java.util.Scanner;
//import java.math.*;
public class EP0217_juegoSuma {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

       int MAX = 99;
       int MIN = 1;

       int num1 = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
       int num2 = (int) (Math.random() * (MAX - MIN + 1)) + MIN;

       System.out.printf("Escribe el resultado de sumar %d y %d: ", num1, num2);
       int sumaUsuario = sc.nextInt();
       sc.close();

        if (sumaUsuario == num1 + num2) {
            System.out.println("Resultado correcto");
        } else {
            System.out.printf("¡Has fallado! El resultado correcto es %d%n", num1 + num2);
        }
        

    }
    
}
