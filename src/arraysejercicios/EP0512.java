//autora: Eva María Otero Názara 


/*
EP0512. Escribe la función void desordenar(int t[]), que cambia de forma aleatoria los
elementos contenidos en la tabla t. Si la tabla estuviera ordenada, dejaría de estarlo. */

package arraysejercicios;

import java.util.Arrays;
import java.util.Random;

public class EP0512 {
    public static void main(String[] args) {
        int[] numerosDesordenados = {2, 3, 4, 5, 6, 7}; //generar array 

        Arrays.toString(numerosDesordenados);
    }


    public static void desordenar(int t[]) {
        Random rnd = new Random();

        for (int i=0; i < t.length; i++) {
            int j = rnd.nextInt(t.length);
            
            int auxiliar = t[i];

            t[i] = t[j];
            t[j] = auxiliar;

            System.out.println(t);

        }
    }

    
}
