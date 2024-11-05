/* E0306. Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará
todos los números del 1 al n. */
package ud2.ejerciciosbucles;
import java.util.*;

public class E0306_AprenderAContar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador;

        System.out.println("Introduce el numero:");
        contador = sc.nextInt();

        System.out.println("Contador del 1 al " + contador);
        
        for (int i = 1; i <= contador; i++ ) {
            System.out.println(i );
        }
        sc.close();
    }
}
