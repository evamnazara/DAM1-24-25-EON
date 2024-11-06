/* E0312. Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso. */
package ud2.ejerciciosbucles;

import java.util.*;

public class E0312_Suspensos {

    public static void main(String[] args) {
        final int NUM_ALUMNOS = 5;
        boolean HaySuspensos = false; //bandera de falsedad (en principio no hay suspensos)
        Scanner sc = new Scanner(System.in); 
        

        for (int i = 1 ; i < NUM_ALUMNOS ; i++) { //si se pidiese el numero, i=0
            System.out.println("Escribe las nota de los alumnos: ");
            int nota = sc.nextInt();

            if (nota < 5) 
                HaySuspensos = true;
               // break; si quisieramos que siguiese

        }

        if (HaySuspensos) {
            System.out.println("Hubo suspensos");
        } else {
            System.out.println("No hya ningún suspenso.");
        }
        
        sc.close(); 
    }
    
}
