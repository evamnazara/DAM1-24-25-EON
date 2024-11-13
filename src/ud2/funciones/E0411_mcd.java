/* 
E0411. Escribir una función que calcule de forma recursiva el máximo común divisor de
dos números. Para ello sabemos:mcd(a,b) =
mcd(a - b, b) si a >= b
mcd(a, b - a) si b > a
a si b = 0
b si a = 0 
*/

package ud2.funciones;

//import java.util.*;

public class E0411_mcd {

   /*  Scanner sc = new Scanner(System.in); 
    int n1; 
    int n2;

    System.out.println("Introduce tu primer número:");
    n1 = sc.nextInt();
    System.out.println("Introduce tu segundo número:");
    n2 = sc.nextInt();

    int mcd1 = mcd(n1,n2);
    
    sc.close();

    System.out.println("El MCD de " + n1 + "y" + n2 + " es: " + mcd1);

    }
    */
        
public static int mcd (int a, int b) {

    int mcd = 0;

        if (b == 0) {
            mcd = a;
        } else if (a == 0) {
            mcd = b; 
        } else if (a >= b) {
         mcd = mcd(a - b, b);
        } if (b > a) {
        mcd = mcd(a, b - a);
        } 
        return mcd;
    }

    public static void main(String[] args) {
        System.out.println(mcd(4,8)); 
        System.out.println(mcd(12, 30));
    }
    /* int i;//temporal para no perder b
        while (b != 0) {
            i = b;
            b = a % b;
            a = i;
        }
        return a; */

}

    

