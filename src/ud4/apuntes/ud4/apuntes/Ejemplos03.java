package ud4.apuntes;

import java.util.Arrays;

public class Ejemplos03 {
    public static void main(String[] args) {
        int[] edad = {18, 24, 37, 27}; 

            for (int  i=0; i < 4; i++) {
                System.out.println(edad); //referencia de memoria

                System.out.println(Arrays.toString(edad));
            }

        System.out.println("La edad de la persona 2 es " + edad[1] + " años.");
        System.out.println("Fin de programa.");
    }
}
