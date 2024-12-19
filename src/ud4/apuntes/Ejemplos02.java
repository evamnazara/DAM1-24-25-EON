package ud4.apuntes;

import java.util.Random;

public class Ejemplos02 {
    public static void main(String[] args) {

        final int NUM = 1000000; //dec del valor del array a la constante
        Random rnd = new Random();

        int[] edad; 

        edad = new int[NUM]; //inicia array

        for(int i = 0; i < NUM; i++) {
            edad[i] = rnd.nextInt(18,41);

        }

        long suma = 0;

        for(int i = 0; i < NUM; i++) {
            suma += edad[i];
        }

        double media = suma / NUM;

        System.out.println(edad[4]);
        System.out.println("Años totales: " + suma);
        System.out.println("Media de edad: " + media);

    }
}
