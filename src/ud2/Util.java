package ud2;

import java.util.Scanner;

public class Util {
    static boolean esPar (int n) {
        return n % 2 == 0;
    }

    static boolean esBisiesto(int anho) {
        return anho % 400 == 0 || (anho % 4 == 0 && anho % 100 != 0);
    }

    static int mayor(int a, int b) {
        return a > b ? a : b;
       /* int mayor = a;
         if (b > a) 
            mayor = b;
            return mayor; */

        
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el número: ");

    int n = sc.nextInt();
    sc.close();

    if (esPar(n))
        System.out.println("Es par.");
     else 
        System.out.println("Es impar.");
   /*
    Prueba con años bisiestos:  
    if (esPar(n))
    System.out.println("Es bisiesto.");
    else 
    System.out.println("No es bisiesto.");  */

    System.out.println(mayor(4,9));
}
}
