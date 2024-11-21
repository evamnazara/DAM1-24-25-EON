/* 
E0411. Escribir una función que calcule de forma recursiva el máximo común divisor de
dos números. Para ello sabemos:mcd(a,b) =
mcd(a - b, b) si a >= b
mcd(a, b - a) si b > a
a si b = 0
b si a = 0 
*/

package ud2.exercicios.eon202411.ejerciciosfunciones;

import java.util.*;

public class mcd {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in); 
    int n1; 
    int n2;

    System.out.println("Introduce tu primer número:");
    n1 = sc.nextInt();
    System.out.println("Introduce tu segundo número:");
    n2 = sc.nextInt();

    int mcd1 = maxcomundivisor(n1,n2);
    
    sc.close();

    System.out.println("El MCD de " + n1 + "y" + n2 + " es: " + mcd1);

    }

        
public static int maxcomundivisor (int a, int b) {

    int mcd = 0;

        if (b == 0) {
            mcd = a;
        } else if (a == 0) {
            mcd = b; 
        } else if (a >= b) {
         mcd = maxcomundivisor(a - b, b);
        } if (b > a) {
        mcd = maxcomundivisor(a, b - a);
        } 
        return mcd;
    }

}

    

