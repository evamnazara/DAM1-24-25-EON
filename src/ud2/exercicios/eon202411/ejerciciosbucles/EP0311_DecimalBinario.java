/* Realiza un programa que convierta un número entero decimal en su representación 
binaria. Hay que tener en cuenta que desconocemos cuántas cifras tiene el número que introduce 
el usuario.
Por simplicidad, iremos mostrando el número binario con un digito por línea.
*/
package ud2.exercicios.eon202411.ejerciciosbucles;

import java.util.*;

public class EP0311_DecimalBinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu numero decimal: ");
        int n = sc.nextInt();
        String binario = ""; //cadena vacia en principio
        
        while (n / 2  > 0 ) {
            binario = binario + (n % 2);

            //actualizas n 
            n = n / 2;

           
            // alternativa ( sacando la linea binario = n + binario; )
            // if (n == 1)
            // binario = (n % 2) + binario;
        }

        binario = n + binario;

        sc.close();

        System.out.println(binario);


        //sc.close();


    }
}
