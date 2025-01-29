/*
 * La siguiente función (método de la clase String) permite convertir un String en un array de 
caracteres (elementos de tipo char): 
 
public char[] toCharArray() 
 
Ejemplo de uso:  
 
String cadena = "Hola Mundo"; 
char[] tablaChar = cadena.toCharArray(); 
 
Crea una función que reciba una cadena de caracteres y una letra como parámetros de 
entrada y que devuelva un array con las posiciones en que aparece dicha letra en la 
cadena. La numeración de posiciones comenzará en el 0, y si no se encuentra la letra la 
función devolverá un array vacío. Utiliza el siguiente prototipo: 
 
static int[] buscarLetra(String cadena, char letra) 
 
Amplía el programa “Conceptos de programación” para solicitar repetidamente una letra por 
teclado al usuario e indicar si existe o no en el término elegido al azar, cuantas veces 
aparece y en que posiciones.  
La clase Scanner de Java no dispone de un método nextChar() para leer caracteres. En su 
lugar, para leer una letra de teclado puedes usar el método next() de la clase Scanner para 
leer un String y acceder al carácter de la primera posición de la siguiente forma: 
 
char letra = sc.next().charAt(0); 

El bucle de entrada de letras terminará al introducir una letra que no se encuentre. 
 */

package arraysejercicios;

import java.util.*;

public class BuscandoLetras {

    public static String[] conceptos = {
        "Algoritmo",
        "Lenguaje de programación",
        "Entorno de desarrollo",
        "Compilación",
        "Ejecución",
        "Código fuente",
        "Bytecode",
        "Código objeto"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String conceptoAleatorio = fraseAleatoria(conceptos);
        System.out.println("Concepto aleatorio seleccionado: " );
        System.out.println(conceptoAleatorio);

        while (true) {

            System.out.println("Introduce la letra que quieras buscar: ");
            System.out.println("Salida: introduce una letra que no esté en la palabra.");
            char letra = sc.next().charAt(0);

            int[] posiciones = buscarLetra(conceptoAleatorio, letra);

            if (posiciones.length == 0) {
                System.out.println("No existe la letra " + letra + " en la palabra elegida. ");
                 } else {
                    System.out.println("La letra '" + letra + "' aparece en las posiciones: ");
                         for (int pos : posiciones) {
                            System.out.println(pos);
                            }
                System.out.println("Número total de veces que aparece: " + posiciones.length );
            }
            sc.close();
        }


    }


    static String fraseAleatoria(String[] t) {
        Random rnd = new Random();
        int indiceAleatorio = rnd.nextInt(t.length); 
        return t[indiceAleatorio]; 
    }


    static int[] buscarLetra(String cadena, char letra) {
        char[] caracteres = cadena.toCharArray();
        //int[] tempPosiciones = new int[0]; //devuelve array vacío 
        int[] tempPosiciones = new int[caracteres.length];
        int contadorVeces = 0;

        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == letra) {
               i = tempPosiciones[contadorVeces++];
            }
        }

        return Arrays.copyOf(tempPosiciones, contadorVeces);
    }

}
