/*1. (2) Implementa una función que dado un verbo en infinitivo lo conjugue en presente y 
devuelva un array de String con los resultados de la conjugación para cada una de las 6 
personas verbales. 
 
String[] conjugarPresente(String verbo); 
 
Si el parámetro verbo no tiene una terminación válida la función devolverá null. 
 
2. (1) Crea un programa principal que acepte por teclado verbos en infinitivo y muestre por 
pantalla su conjugación en tiempo presente, añadiendo al inicio los pronombres adecuados. 
Si el verbo introducido no corresponde a un infinitivo con una terminación adecuada el 
programa mostrará el mensaje de error correspondiente. 
 
El programa finalizará cuando se introduzca la palabra “fin”.  */

package strings;

import java.util.Arrays;
import java.util.Scanner;

public class conjugarVerbos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el verbo que quieras conjugar:");

        String verboInfinitivo = sc.nextLine();
        
        //pasar a la funcion como que devuelva null
        while (!verboInfinitivo.endsWith("ar") | 
                verboInfinitivo.endsWith("er") | 
                verboInfinitivo.endsWith("ir") ) {
            System.out.println("Verbo inválido, por favor introduce otro.");

            verboInfinitivo = sc.nextLine();
        }

        System.out.println(conjugarPresente(verboInfinitivo));


        sc.close();
    }

    public static String[] conjugarPresente(String verbo) {
       // quitar conjugacion
        //String [] pronombres = {"Yo", "Tú", "Él/ella","Nosotros ","Vosotros ", "Ellos "};
        //String [] conjugaciones = {"ar", "er", "ir"};



        if (verbo.endsWith("ar")){
            String [] conjugacion =verbo.split("ar");
            //System.out.println(Arrays.toString(conjugacion));
            System.out.println("Yo " + Arrays.toString(conjugacion) + "o" );
            System.out.println("Tú " + Arrays.toString(conjugacion) + "as" );
            System.out.println("Él/ella" + Arrays.toString(conjugacion) + "a" );
            System.out.println("Nosotros " + Arrays.toString(conjugacion) + "amos" );
            System.out.println("Vosotros " + Arrays.toString(conjugacion) + "ais" );
            System.out.println("Ellos " + Arrays.toString(conjugacion) + "an" );
        }
        else if (verbo.endsWith("er")) {
            String [] conjugacion =verbo.split("er");
            //System.out.println(Arrays.toString(conjugacion));
            System.out.println("Yo " + Arrays.toString(conjugacion) + "o" );
            System.out.println("Tú " + Arrays.toString(conjugacion) + "es" );
            System.out.println("Él/ella" + Arrays.toString(conjugacion) + "e" );
            System.out.println("Nosotros " + Arrays.toString(conjugacion) + "emos" );
            System.out.println("Vosotros " + Arrays.toString(conjugacion) + "éis" );
            System.out.println("Ellos " + Arrays.toString(conjugacion) + "en" );
        }

        else if (verbo.endsWith("ir")) {
            String [] conjugacion =verbo.split("ir");
            System.out.println(Arrays.toString(conjugacion));
            System.out.println("Yo " + Arrays.toString(conjugacion) + "o" );
            System.out.println("Tú " + Arrays.toString(conjugacion) + "es" );
            System.out.println("Él/ella" + Arrays.toString(conjugacion) + "e" );
            System.out.println("Nosotros " + Arrays.toString(conjugacion) + "imos" );
            System.out.println("Vosotros " + Arrays.toString(conjugacion) + "ís" );
            System.out.println("Ellos " + Arrays.toString(conjugacion) + "en" );
        }

        return null;
    }
}
