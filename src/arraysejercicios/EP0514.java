//autora: Eva María Otero Názara 

/*EP0514. El ayuntamiento de tu localidad te ha encargado una aplicación que ayude a realizar
encuestas estadísticas para conocer el nivel adquisitivo de los habitantes del municipio. Para ello,
tendrás que preguntar el sueldo a cada persona encuestada. A priori, no conoces el número de
encuestados. 
Para finalizar la entrada de datos, introduce un sueldo con valor -1.
Una vez terminada la entrada de datos, muestra la siguiente información:
● Todos los sueldos introducidos ordenados de forma decreciente.
● El sueldo máximo y mínimo.
● La media de los sueldos. */

package arraysejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class EP0514 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el sueldo de cada persona encuestada.");
        System.out.println("Para terminar, introduce -1");
        
       

        int n = sc.nextInt();
        int [] encuestaNivelAdquisitivo = new int[n];

        int sueldo = 0;
        int numeroEncuestados = 0;

        int sueldoMinimo = 0; int sueldoMaximo = 0;

       do {
            for(int i = 0; i > 0; i++) {
                sueldo =+ sueldo;
                numeroEncuestados++;
            }
            
        } while (n != 1);

        System.out.println("El número de encuenstados ha sido: "+ numeroEncuestados);
        

        Arrays.sort(encuestaNivelAdquisitivo);
        System.out.println("Sueldos totales ordenados: " + Arrays.toString(encuestaNivelAdquisitivo));

        System.out.println("Sueldo mínimo:" + sueldoMinimo);
        System.out.println("Sueldo máximo: " + sueldoMaximo);
        System.out.println("Media de los sueldo: ");

        sc.close();
    }
    
}
