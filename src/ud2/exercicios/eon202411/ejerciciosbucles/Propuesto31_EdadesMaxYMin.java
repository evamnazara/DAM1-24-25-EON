/* Aplicacion que muestre la edad maxima y minima de un grupo de alumnos. 
 El usuario introduce las edades y terminará escribiendo un -1.
 */
package ud2.exercicios.eon202411.ejerciciosbucles;

import java.util.*;

public class Propuesto31_EdadesMaxYMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = -1;
        int edad;

        edad = sc.nextInt();

        while (edad != contador) {
            System.out.println("Introduce la edad: ");
            contador ++;

            edad = sc.nextInt();
        }


        sc.close();

    }
    
}
