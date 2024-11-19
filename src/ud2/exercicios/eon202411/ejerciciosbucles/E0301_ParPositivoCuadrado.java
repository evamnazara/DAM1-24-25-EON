/* E0301. Diseñar un programa que muestre, para cada número introducido por teclado, 
si es par, si es positivo y su cuadrado. El proceso se repetirá hasta que el número
introducido sea 0. */

package ud2.exercicios.eon202411.ejerciciosbucles;
import java.util.*;

public class E0301_ParPositivoCuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Introduce un número: ");
        num = sc.nextInt(); //evita que se machaque la variable del bucle
        

        while (num != 0) {
            if (num % 2 == 0) {
                System.out.println("El número es par");
            } else {
                System.out.println("El número es impar");
            }

            if (num > 0) {
                System.out.println("El número es positivo");
            } else {
                System.out.println("El número es negativo");
            }

            double cuadrado = Math.pow(num, 2);
            System.out.println("Su cuadrado es " + cuadrado);

            num = sc.nextInt(); 
        }

        sc.close();
    }
}
