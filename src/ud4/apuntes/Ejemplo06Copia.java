package ud4.apuntes;

import java.util.Arrays;

public class Ejemplo06Copia {
    
    public static void main(String[] args) {
        int[] t1 = {5,7,2,9,3};
        int[] t2 = new int [t1.length];

        t2=t1;

        /*
        for (int i=0; i < t1.length; i++) {
            t2[i] = t1 [i];

        }
        */

        t2 = Arrays.copyOf(t1, t1.length);
        System.out.println("Fin");
    }
}
