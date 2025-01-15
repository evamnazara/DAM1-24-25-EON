/*
 * E0509. 
 * Diseña una aplicación para gestionar un campeonato de programación donde se  introduce 
 * la puntuación obtenida por 5 programadores, conforme van terminando la 
 prueba, en forma de números enteros. La aplicación debe mostrar las puntuaciones 
ordenadas de los 5 participantes. En ocasiones, cuando finalizan los 5 participantes 
anteriores, se suman al campeonato programadores de exhibición cuyas puntuaciones se 
incluyen con el resto. La forma de especificar que no intervienen más programadores de 
exhibición es introducir como puntuación un -1. Por último, la aplicación debe mostrar los 
puntos ordenados de todos los participantes. 
 */

package arraysejercicios;

import java.util.*;

public class E0509_Campeonato {
    public static void main(String[] args) {
        final int NUM_PROGRAMADORES = 5;
        Scanner sc = new Scanner(System.in);
        
        double [] puntuacionesProgramadores = new double [5]; //enunciado

        System.out.println("Introduce las puntuaciones de los " + NUM_PROGRAMADORES + " programadores: ");

        for (int i = 0; i < NUM_PROGRAMADORES; i++) {
            puntuacionesProgramadores [i] = sc.nextDouble();
        }
        Arrays.sort(puntuacionesProgramadores);
        System.out.println("Mejores puntuaciones: " + Arrays.toString(puntuacionesProgramadores));

        System.out.println("Puntuaciones de los programadores de exhibicion.");
        System.out.println("Introduce -1 para salir.");

        //LECTURA ANTICIPADA

        double nota = sc.nextDouble(); 
        while (nota != -1) {
            //proceso: añadir ordenado

            //array auxiliar 
            //longitud array original + 1
            double [] tAuxiliar = new double [puntuacionesProgramadores.length + 1];
            //se puede usar binaryseacrh sporque la tabla esta ordenada
            int posicion = Arrays.binarySearch(puntuacionesProgramadores, nota);

            if( posicion < 0 ) {
                posicion = -posicion - 1;
            }

            System.arraycopy(posicion, 0, tAuxiliar, 0, posicion);
            tAuxiliar[posicion] = nota;
            System.arraycopy(posicion, NUM_PROGRAMADORES, tAuxiliar, posicion +1, puntuacionesProgramadores.length - posicion);

            puntuacionesProgramadores = tAuxiliar;


            nota = sc.nextDouble(); //lee otra vez 


            
        }
        sc.close();
        System.out.println("Puntuaciones finales: " + Arrays.toString(puntuacionesProgramadores));
    }
    
}
