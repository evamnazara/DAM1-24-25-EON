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

package clase;

import java.util.Arrays;
import java.util.Scanner;

public class EP0514_Sueldos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sueldo = 0;
        int numeroEncuestados = 0;
        double [] encuesta = new double[0]; //array vacio

        
        System.out.println("Para terminar, introduce -1");
        
        System.out.println("Introduce el sueldo:");
        sueldo = sc.nextDouble();

        while (sueldo != -1) {
            encuesta = Arrays.copyOf(encuesta, encuesta.length + 1);
            encuesta[encuesta.length - 1] = sueldo; //añade el sueldo mas
            System.out.println("Introduce el sueldo:");
            sueldo = sc.nextDouble();
            numeroEncuestados++;
        } 

        sc.close();

        double mediaSueldos = sueldo / numeroEncuestados;
        System.out.println("" + numeroEncuestados + "" + mediaSueldos);
        /*if (encuesta.length == 0) {
            System.out.println("No has introducido ningún sueldo.");
        } else {


        }*/

//        int supMedia; int infMedia; 



        //superiores e inferiores 


        /* int numeroEncuestados = 0;
        

        int sueldoMinimo = 0; int sueldoMaximo = 0;
        System.out.println("El número de encuenstados ha sido: "+ numeroEncuestados);
        

        Arrays.sort(encuesta);
        System.out.println("Sueldos totales ordenados: " + Arrays.toString(encuesta));

        System.out.println("Sueldo mínimo:" + sueldoMinimo);
        System.out.println("Sueldo máximo: " + sueldoMaximo);
        System.out.println("Media de los sueldo: ");*/

    } 
    
}
