//autora: Eva María Otero Názara 


/*
EP0512. Escribe la función void desordenar(int t[]), que cambia de forma aleatoria los
elementos contenidos en la tabla t. Si la tabla estuviera ordenada, dejaría de estarlo. */

package arraysejercicios;

import java.util.Arrays;
import java.util.Random;

public class EP0512_Desordenar {
    public static void main(String[] args) {
        int[] numerosDesordenados = {2, 3, 4, 5, 6, 7}; 
        
        System.out.println("Array ordenado:");
        Arrays.sort(numerosDesordenados);
        System.out.println(Arrays.toString(numerosDesordenados));

        System.out.println("Array desordenado:");
        desordenar(numerosDesordenados);   
        System.out.println(Arrays.toString(numerosDesordenados));
    }
   /*  public static int arrayAleatorio(int t2) {
        int n; int rndFin; int rndInicio;
        int[] t2 = new int[n];
        Random rnd = new Random();

        for(int i = 0; i < n; i++) {
            t2[i] = rnd.nextInt(rndFin - rndInicio + 1) + rndInicio; 
        }

        return t2;  


    }*/

    public static void desordenar(int t[]) {
        Random rnd = new Random();

        for (int i = 0; i < t.length; i++) {
            int nuevaPosicion = rnd.nextInt(t.length);
            
            int auxiliar = t[i];

            t[i] = t[nuevaPosicion];
            t[nuevaPosicion] = auxiliar;

        }
    }

    
}
