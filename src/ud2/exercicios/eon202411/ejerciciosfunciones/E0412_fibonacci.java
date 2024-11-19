/* E0412. Diseñar una función recursiva que calcule el enésimo término de la serie de
Fibonacci. En esta serie el enésimo valor se calcula sumando los dos valores anteriores
de la serie, es decir:
fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
fibonacci(1) = 1
fibonacci(0) = 1 */

package ud2.exercicios.eon202411.ejerciciosfunciones;
import java.util.Scanner;

public class E0412_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número:");
        int num = sc.nextInt();

        sc.close();
        System.out.println(fibonacci(num));
    }

    static int fibonacci(int n){

        if (n < 2){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
